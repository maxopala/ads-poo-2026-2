package exerciciodirigido;

import java.time.LocalDate;

public class Consulta {
    private int codigo;
    private LocalDate data;
    private double valor;
    private String diagnostico;
    private boolean paga;
    private Animal animal;
    private Veterinario veterinario;

    public Consulta(int codigo, LocalDate data, double valor, Animal animal, Veterinario veterinario) {
        this.codigo = codigo;
        this.data = data;
        this.valor = valor;
        this.animal = animal;
        this.veterinario = veterinario;
    }

    public int getCodigo() {
        return codigo;
    }

    public LocalDate getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public boolean isPaga() {
        return paga;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void registrarDiagnostico(String diagnostico) {
        if (diagnostico != null) {
            if (this.diagnostico == null) {
                System.out.println("[ATENÇÃO] Já existia um diagnóstico.");
            }
            this.diagnostico = diagnostico;
        }
    }

    public boolean aplicarDesconto(double percentual) {
        if (percentual < 0 || percentual > 100) {
            return false;
        }
        this.valor = (100.0 - percentual) * this.valor / 100;
        return true;
    }

    public void exibirResumo() {
        String texto = String.format(
                "Codigo: %d\n" +
                        "Data: %s\n" +
                        "Valor: %.2f\n" +
                        "Animal: %s\n" +
                        "Veterinario: %s (%s)\n" +
                        "Paga: %s\n" +
                        "Diagnostico: %s",
                this.codigo, this.data, this.valor,
                this.animal.getNome(),
                this.veterinario.getNome(), this.veterinario.getEspecialidade(),
                this.paga, (this.diagnostico != null ? this.diagnostico : "PENDENTE")
        );
        System.out.println(texto);
    }
}
