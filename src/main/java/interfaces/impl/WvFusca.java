package interfaces.impl;

import interfaces.Direcao;
import interfaces.Movimento;
import interfaces.Volante;

public class WvFusca implements Volante, Movimento {
    @Override
    public boolean girar(Direcao direcao, double tamanho) {
        System.out.println("Sou um Fusca e estou virando para a " + direcao + " no tamanho " + tamanho + ".");
        return false;
    }

    @Override
    public void acelerar() {
        System.out.println("Sai da frente, que lá vei o Fusca!");
    }

    @Override
    public void frear() {
        System.out.println("Para para para!");
    }
}
