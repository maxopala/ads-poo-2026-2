package testes;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class RandomTeste {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(
                Files.newInputStream(Paths.get("/home/max/entrada.txt")))) {
            System.out.println("N: " + scanner.nextInt());
            System.out.println("N: " + scanner.nextInt());
            System.out.println("N: " + scanner.nextInt());
        }
        InputStream input = Files.newInputStream(Paths.get("/home/max/.bash_history"));
        Scanner scanner1 = new Scanner(input);
        System.out.println("N: " + scanner1.next());
        input.close();
        while (scanner1.hasNext()) {
            System.out.println("N: " + scanner1.next());
        }
        System.out.println("N: " + scanner1.next());
    }
}
