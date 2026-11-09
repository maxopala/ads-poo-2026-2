package exceptions;

import java.util.Scanner;

public class TesteListaFuncionarios {
    public static void main(String[] args) {
        ListaFuncionarios funcs = new ListaFuncionarios();

        while (true) {
            System.out.println("CPF: ");
            String cpf = new Scanner(System.in).nextLine();
            if (cpf.isEmpty()) {
                break;
            }

            Funcionario f = new Funcionario();
            f.setCpf(cpf);
            System.out.println("Nome: ");
            f.setNome(new Scanner(System.in).nextLine());
            System.out.println("Salario: ");
            f.setSalario(new Scanner(System.in).nextDouble());
            int c = 0;
            while (true) {
                try {
                    c++;
                    System.out.println("Tentativa " + c);
                    funcs.inserir(f);
                    break;
                } catch (FuncionarioCpfTamanhoException e) {
                    if (cpf.length() < 11) {
                        cpf = String.format("%011d", Long.parseLong(cpf));
                        f.setCpf(cpf);
                    }
                } catch (FuncionarioSalarioException e) {
                    if (f.getSalario() < 1800) {
                        f.setSalario(1800D);
                    } else {
                        f.setSalario(300000D);
                    }
                } catch (FuncionarioException e) {
                    System.out.println("Dados invalidos: " + e.getMessage());
                }
            }
        }
    }
}
