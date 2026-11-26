package database;

import database.repository.CargoRepository;
import database.repository.impl.CargoRepositoryPostgres;
import database.repository.model.Cargo;
import database.repository.model.CargoException;

import java.util.Scanner;

public class BancoDadosOrganizadoMain {
    static CargoRepository cargoRepository = new CargoRepositoryPostgres();

    public static void main(String[] args) throws Exception {
        boolean continuar = true;
        while (continuar) {
            System.out.println("""
                    [1] Inserir
                    [2] Alterar
                    [3] Consultar por ID
                    [4] Consultar por Nome
                    [5] Listar Todos
                    [6] Remover por Id
                    [0] Sair 
                    """);
            int op = new Scanner(System.in).nextInt();
            switch (op) {
                case 1:
                    acaoInserirCargo();
                    break;
                case 2:
                    acaoAlterarCargo();
                    break;
                case 3:
                    acaoConsultarId();
                    break;
                case 4:
                    acapConsultarNome();
                    break;
                case 5:
                    acaoListarTodos();
                    break;
                case 6:
                    acaoRemoverPorId();
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        Cargo[] cargos = cargoRepository.consultarTodos();
        printCargos(cargos);
    }

    private static void acaoInserirCargo() {
        Cargo novoCargo = new Cargo();
        preencherCargo(novoCargo);
        try {
            cargoRepository.salvar(novoCargo);
            System.out.println("Cargo inserido com sucesso!");
        } catch (CargoException e) {
            System.out.println("ERRO INESPERADO: " + e.getMessage());
        }
    }

    private static void acaoAlterarCargo() {
        int idCargo = lerIdCargo();
        Cargo cargo = cargoRepository.consultarPorId(idCargo);
        if (cargo == null) {
            System.out.println("Cargo não encontrado.");
            return;
        }
        preencherCargo(cargo);
        try {
            cargoRepository.salvar(cargo);
            System.out.println("Cargo alterado com sucesso.");
        } catch (CargoException e) {
            System.out.println("ERRO INESPERADO: " + e.getMessage());
        }
    }

    private static void acaoConsultarId() {
        int idCargo = lerIdCargo();
        Cargo cargo = cargoRepository.consultarPorId(idCargo);
        if (cargo == null) {
            System.out.println("Cargo não encontrado.");
            return;
        }
        System.out.printf("""
                -------------------------------------
                Id do Cargo: %d
                Nome do Cargo: %s
                Salário: %.2f
                -------------------------------------
                \n""", idCargo, cargo.getNome(), cargo.getSalario());
    }

    private static void acapConsultarNome() {
        String nomeCargo = lerNomeCargo();
        Cargo[] cargos = cargoRepository.consultarPorNome(nomeCargo);
        printCargos(cargos);
    }

    private static void acaoListarTodos() {
        Cargo[] cargos = cargoRepository.consultarTodos();
        printCargos(cargos);
    }

    private static void acaoRemoverPorId() {
        int idCargo = lerIdCargo();
        Cargo cargo = cargoRepository.consultarPorId(idCargo);
        if (cargo == null) {
            System.out.println("Cargo não encontrado.");
            return;
        }
        cargoRepository.removerCargo(cargo);
    }

    private static int lerIdCargo() {
        System.out.print("ID do cargo: ");
        return new Scanner(System.in).nextInt();
    }

    private static String lerNomeCargo() {
        System.out.print("Nome do cargo: ");
        return new Scanner(System.in).nextLine();
    }

    private static void preencherCargo(Cargo cargo) {
        cargo.setNome(lerNomeCargo());

        System.out.print("Salário: ");
        Double salario = new Scanner(System.in).nextDouble();
        cargo.setSalario(salario);
    }

    private static void printCargos(Cargo[] cargos) {
        System.out.println("+-----+-------+------------------------------------------+-----------+");
        System.out.println("| #   | ID    | Nome                                     | Salario   |");
        System.out.println("+-----+-------+------------------------------------------+-----------+");
        for (int i = 0; i < cargos.length; i++) {
            Cargo c = cargos[i];
            System.out.printf("| %3d | %5d | %-40s | %9.2f |\n",
                    i + 1, c.getId(), c.getNome(), c.getSalario());
        }
        System.out.println("+-----+-------+------------------------------------------+-----------+");
    }
}
