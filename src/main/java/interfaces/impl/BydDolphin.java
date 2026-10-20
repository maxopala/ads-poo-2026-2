package interfaces.impl;

import interfaces.Direcao;
import interfaces.Movimento;
import interfaces.Volante;

public class BydDolphin implements Volante, Movimento {
    @Override
    public boolean girar(Direcao direcao, double tamanho) {
        System.out.println("Sou um Dolphin e estou girando " + tamanho + " na direção " + direcao + ".");
        return false;
    }

    @Override
    public void acelerar() {
        System.out.println("Sou um Dolphin e estou acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("Sou um Dolphin e estou freando.");
    }
}
