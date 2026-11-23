package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BancoDadosMain {
    public static void main(String[] args) throws Exception {
        String URL = "jdbc:postgresql://localhost:5432/meu_banquinho_poo";
        String USUARIO = "postgres";
        String SENHA = "123456";

        Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select " +
                "p.cpf as cpf_pessoa, " +
                "p.nome as nome_pessoa, " +
                "c.nome as cargo, " +
                "c.salario as salario " +
                "from cargo c " +
                "inner join funcionario f  on c.id  = f.fk_cargo " +
                "inner join pessoa p on p.cpf = f.fk_pessoa " +
                "where p.nome ilike 'MARIA%' or p.nome ilike 'JOAO%' " +
                "order by c.nome, p.cpf");

        while (rs.next()) {
            String cpf = rs.getString("cpf_pessoa");
            String nome = rs.getString("nome_pessoa");
            String cargo = rs.getString("cargo");
            double salario = rs.getDouble("salario");

            System.out.printf("| %-11s | %-40s | %-30s | %9.2f |\n",
                    cpf, nome, cargo, salario);
        }
    }
}
