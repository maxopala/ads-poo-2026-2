package exceptions;

import java.util.Scanner;

public class TesteEx {
    public static void main(String[] args) {
        double a, b, c;
        System.out.println("Digite um valor de a: ");
        a = new Scanner(System.in).nextDouble();
        System.out.println("Digite um valor de b: ");
        b = new Scanner(System.in).nextDouble();
        System.out.println("Digite um valor de c: ");
        c = new Scanner(System.in).nextDouble();

        try {
            double[] x = Baskara.calc(a, b, c);
            System.out.println("Raizes: " + x[0] + " e " + x[1]);
        } catch (DeltaNegativoException e) {
            System.out.println("Delta negativo");
        }
    }
}
