package testes;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DadosTeste {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Usuario, que dia voce nasceu (DD/MM/AAAA)? ");

        String dataStr = new Scanner(System.in).nextLine();

        LocalDate data2 = LocalDate.parse(dataStr, formatter);

        System.out.println("Você nasceu em " + data2.format(formatter));
        System.out.println("Sua idade é " + Period.between(data2, LocalDate.now()).getYears());
    }
}
