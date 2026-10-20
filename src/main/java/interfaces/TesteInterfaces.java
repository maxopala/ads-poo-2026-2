package interfaces;

import interfaces.impl.BydDolphin;
import interfaces.impl.FiatPalio;
import interfaces.impl.WvFusca;

public class TesteInterfaces {
    public static void main(String[] args) {
        FiatPalio carro = new FiatPalio();

        Motorista motorista = new Motorista();

        motorista.acelerarCarro(carro);
        motorista.mudarDirecaoEsquerda(carro, 30);
        motorista.mudarDirecaoDireita(carro, 50);
        motorista.frearCarro(carro);
    }
}
