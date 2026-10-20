package exerciciodirigido;

public class Veterinario {
    private String crmv;
    private String nome;
    private String especialidade;

    public Veterinario(String crmv, String nome, String especialidade) {
        this.crmv = crmv;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getCrmv() {
        return crmv;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}
