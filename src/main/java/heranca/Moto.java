package heranca;

public class Moto extends Veiculo {
    private int cilindradas;

    @Override
    public String acelerar() {
        km = km + 1;
        return "MEMEEEEEENNN!!!";
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
