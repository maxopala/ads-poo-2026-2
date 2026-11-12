package identificacao_tipos;

public class Barbaro implements Guerreiro {
    int pontosVida = 100;
    int forca = 30;
    int defesa = 40;

    @Override
    public void atacar(Alvo alvo) {
        System.out.println("Barbaro atacando " + alvo);
        int dano = forca;
        alvo.receberDano(dano);
        System.out.println("Barbaro atacou " + alvo);
    }

    @Override
    public void receberCura(int pontos) {
        System.out.println("Barbarfo recebendo cura de " + pontos);
        pontosVida += pontos;
    }

    @Override
    public boolean receberDano(int dano) {
        System.out.println("Barbaro recebendo dano de " + dano);
        dano = dano - defesa;
        if (dano <= 0) {
            dano = 1;
        }
        this.pontosVida -= dano;
        return this.pontosVida <= 0;
    }

    @Override
    public String toString() {
        return "Barbaro (" + pontosVida + ")";
    }
}
