package abstract_class;

public class FuncEstagiario extends FuncionarioAbstrato {
    public double calcularProventos() {
        return this.getSalarioBruto();
    }

    public double calcularDescontos() {
        return 0.0;
    }
}
