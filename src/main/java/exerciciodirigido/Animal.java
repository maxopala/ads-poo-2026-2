package exerciciodirigido;

public class Animal {
    private String nome;
    private String especie;
    private int idade;
    private Tutor tutor;

    public Animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public String getDescricao() {
        if (this.tutor != null) {
            return this.nome + " (" + this.especie + ") [" + this.idade + "] -> " + this.tutor.getNome();
        } else {
            return this.nome + " (" + this.especie + ") [" + this.idade + "] -> SEM TUTOR";
        }
    }
}
