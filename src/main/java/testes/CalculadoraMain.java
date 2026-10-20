package testes;

import util.InterfaceUtil;

public class CalculadoraMain {
    public static void main(String[] args) {
        System.out.print("Numero 1: ");
        int x = InterfaceUtil.lerInt();
        System.out.print("Numero 2: ");
        int y = InterfaceUtil.lerInt();
        int z = x + y;
        InterfaceUtil.imprimeLinha(30, '#');
        System.out.println("Resultado: " + z);
        InterfaceUtil.desenhaRetanguloAvancado(7, 40, '$', ' ');
    }
}
