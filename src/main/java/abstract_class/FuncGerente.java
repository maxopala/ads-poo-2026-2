package abstract_class;

public class FuncGerente extends FuncionarioAbstrato {
    private int qtdeSubordinados;

    public double calcularProventos() {
        return this.getSalarioBruto() + this.getQtdeSubordinados() * 300.00;
    }

    public double calcularDescontos() {
        return this.getSalarioBruto() * 0.15;
    }

    public int getQtdeSubordinados() {
        return qtdeSubordinados;
    }

    public void setQtdeSubordinados(int qtdeSubordinados) {
        this.qtdeSubordinados = qtdeSubordinados;
    }
}
