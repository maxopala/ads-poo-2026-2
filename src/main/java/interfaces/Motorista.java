package interfaces;

public class Motorista {
    public void acelerarCarro(Movimento movimento) {
        movimento.acelerar();
    }

    public void frearCarro(Movimento movimento) {
        movimento.frear();
    }

    public void mudarDirecaoEsquerda(Volante volante, float tamanho) {
        volante.girar(Direcao.ANTI_HORARIO, tamanho);
    }

    public void mudarDirecaoDireita(Volante volante, float tamanho) {
        volante.girar(Direcao.HORARIO, tamanho);
    }
}
