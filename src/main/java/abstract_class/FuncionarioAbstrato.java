package abstract_class;

public abstract class FuncionarioAbstrato implements Funcionario {
    private String cpf;
    private String nome;
    private double salarioBruto;

    public final double calcularSalarioLiquido() {
        double salario = calcularProventos() - calcularDescontos();
        if (salario < 0) {
            salario = 0;
        }
        return salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
}
