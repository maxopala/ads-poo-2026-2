package guns;

public class Arma {
    private String nome;
    private int capacidade;
    private int municao;

    public Arma(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.municao = 0;
    }

    public String getNome() {
        return this.nome;
    }

    public String disparar() {
        if (this.municao > 0) {
            this.municao--;
            return "Bang!";
        } else {
            return "Click!";
        }
    }

    public void recarregar(int c) {
        this.municao = this.municao + c;
        if (this.municao > this.capacidade) {
            this.municao = this.capacidade;
        }
    }
}
