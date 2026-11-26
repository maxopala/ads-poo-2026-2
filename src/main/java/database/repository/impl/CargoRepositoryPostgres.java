package database.repository.impl;

import database.repository.CargoRepository;
import database.repository.model.Cargo;
import database.repository.model.CargoException;

import java.sql.*;

public class CargoRepositoryPostgres implements CargoRepository {
    @Override
    public void salvar(Cargo cargo) throws CargoException {
        try {
            Connection conn = getConnection();
            if (cargo.getId() == null) {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select coalesce(max(id), 0) + 1 novo_id from cargo");
                rs.next();
                int novoId = rs.getInt("novo_id");

                PreparedStatement pstmt = conn.prepareStatement("""
                        insert into cargo(id, nome, salario)
                        values(?, ?, ?)
                        """);
                pstmt.setInt(1, novoId);
                pstmt.setString(2, cargo.getNome());
                pstmt.setDouble(3, cargo.getSalario());

                pstmt.executeUpdate();

                cargo.setId(novoId);
            } else {
                PreparedStatement pstmt = conn.prepareStatement("""
                        update cargo
                        set nome = ?,
                            salario = ?
                        where id = ?
                        """);
                pstmt.setString(1, cargo.getNome());
                pstmt.setDouble(2, cargo.getSalario());
                pstmt.setInt(3, cargo.getId());

                pstmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new CargoException("Erro ao salvar cargo.");
        }
    }

    @Override
    public Cargo consultarPorId(Integer id) {
        try {
            Connection conn = getConnection();
            ResultSet rs = conn.createStatement().executeQuery("""
                    select nome, salario
                    from cargo c
                    where c.id = %d
                    """.formatted(id));
            if (!rs.next()) {
                return null;
            }
            Cargo c = new Cargo();
            c.setId(id);
            c.setNome(rs.getString("nome"));
            c.setSalario(rs.getDouble("salario"));
            return c;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Cargo[] consultarPorNome(String nome) {
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Cargo[] consultarTodos() {
        try {
            Connection conn = getConnection();
            ResultSet rsCount = conn.createStatement().executeQuery("select count(*) qtde from cargo");
            rsCount.next();
            int qtde = rsCount.getInt("qtde");

            ResultSet rs = conn.createStatement().executeQuery("""
                    select id, nome, salario
                    from cargo c
                    order by nome, id
                    """);

            Cargo[] cargos = new Cargo[qtde];
            int i = 0;

            while (rs.next()) {
                Cargo c = new Cargo();
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setSalario(rs.getDouble("salario"));
                cargos[i] = c;
                i++;
            }

            return cargos;
        } catch (SQLException e) {
            e.printStackTrace();
            return new Cargo[0];
        }
    }

    @Override
    public void removerCargo(Cargo cargo) {
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() throws SQLException {
        String URL = "jdbc:postgresql://localhost:5432/meu_banquinho_poo";
        String USUARIO = "postgres";
        String SENHA = "123456";
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}
