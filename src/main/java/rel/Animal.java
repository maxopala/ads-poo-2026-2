package rel;

public class Animal {
    String nome;
    Integer idade;
    String sexo;

    public Animal(String nome, Integer idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }
}
