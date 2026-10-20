package util;

import java.io.IOException;
import java.util.Scanner;

public class InterfaceUtil {
    public static int lerInt() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();
        return x;
    }

    public static void imprimeLinha(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void desenhaRetanguloAvancado(int l, int c, char b, char p) {
        imprimeLinha(c, b);
        for (int j = 0; j < l - 2; j++) {
            System.out.print(b);
            for (int i = 0; i < c - 2; i++) {
                System.out.print(p);
            }
            System.out.println(b);
        }
        imprimeLinha(c, b);
    }
}
