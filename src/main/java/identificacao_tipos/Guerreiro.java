package identificacao_tipos;

public interface Guerreiro extends Alvo {
    void atacar(Alvo alvo);

    void receberCura(int pontos);
}