package heranca;

public class Carro extends Veiculo {
    private int numeroPortas;

    @Override
    public String acelerar() {
        super.acelerar();
        return "TO TO TO TO TO!";
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
}
