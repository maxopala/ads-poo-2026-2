package abstract_class;

public class FuncAdministrativo extends FuncionarioAbstrato {
    public double calcularProventos() {
        return this.getSalarioBruto();
    }

    public double calcularDescontos() {
        return this.getSalarioBruto() * 0.15;
    }
}
