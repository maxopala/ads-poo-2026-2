package interfaces.impl;

import interfaces.Direcao;
import interfaces.Movimento;
import interfaces.Volante;

public class FiatPalio implements Volante, Movimento {
    @Override
    public boolean girar(Direcao direcao, double tamanho) {
        System.out.println("Sou um Palio e estou virando para a " + direcao + " no tamanho " + tamanho + ".");
        return false;
    }

    @Override
    public void acelerar() {
        System.out.println("La vem o Paliao! Cheio de Paixao!");
    }

    @Override
    public void frear() {
        System.out.println("Freando o Palio!");
    }
}
