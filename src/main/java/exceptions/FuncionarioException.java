package exceptions;

public class FuncionarioException extends Exception {
    public static final int CPF_TAMANHO = 1;
    public static final int CPF_DIGITOS = 2;
    public static final int NOME = 3;
    public static final int SALARIO = 4;

    int code;

    public FuncionarioException(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
