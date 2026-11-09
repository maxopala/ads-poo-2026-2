package exceptions;

public class ListaFuncionarios {
    public void inserir(Funcionario f)
            throws FuncionarioException, FuncionarioCpfTamanhoException, FuncionarioSalarioException {

        if (f.getCpf().length() != 11) {
            throw new FuncionarioCpfTamanhoException();
        }

        for (int i = 0; i < 11; i++) {
            if (!Character.isDigit(f.getCpf().charAt(i))) {
                throw new FuncionarioException(FuncionarioException.CPF_DIGITOS);
            }
        }

        if (f.getNome().length() < 3) {
            throw new FuncionarioException(FuncionarioException.NOME);
        }

        if (f.getSalario() < 1800 || f.getSalario() > 300000D) {
            throw new FuncionarioSalarioException();
        }

        System.out.println("Funcionario Inserido");
        System.out.println(f);
    }
}
