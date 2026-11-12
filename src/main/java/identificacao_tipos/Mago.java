package identificacao_tipos;

public class Mago implements Guerreiro, Curador {
    int pontosVida = 80;
    int forca = 5;
    int defesa = 10;
    int mana = 40;

    @Override
    public void atacar(Alvo alvo) {
        System.out.println("Mago atacando " + alvo);
        int dano = (int) (forca * (1 + mana / 20.0));
        alvo.receberDano(dano);
        System.out.println("Mago atacou " + alvo);
        mana -= 3;
    }

    @Override
    public boolean receberDano(int dano) {
        System.out.println("Mago recebendo dano de " + dano);
        dano = (int) (dano - defesa * (mana / 15.0));
        if (dano <= 0) {
            dano = 1;
        }
        this.pontosVida -= dano;
        return this.pontosVida <= 0;
    }

    @Override
    public void curar(Guerreiro guerreiro) {
        System.out.println("Mago curando " + guerreiro);
        guerreiro.receberCura((int) (mana * 1.01));
        this.mana -= 5;
    }

    @Override
    public void receberCura(int pontos) {
        System.out.println("Mago recebendo cura de " + pontos);
        pontosVida += pontos + mana / 50;
    }

    @Override
    public String toString() {
        return "Mago (" + pontosVida + ")";
    }
}
