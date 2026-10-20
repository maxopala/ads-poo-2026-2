package heranca;

import util.InterfaceUtil;

public class HerancaMain {
    public static void printVeiculo(Veiculo v) {
        System.out.printf("" +
                        "Marca: %s | " +
                        "Modelo: %s | " +
                        "Ano: %d | " +
                        "Placa: %s | " +
                        "Cor: %s | KM: %d\n",
                v.getMarca(), v.getModelo(), v.getAno()
                , v.getPlaca(), v.getCor(), v.getKm());
    }


    public static void main(String[] args) {
        Veiculo a = new Veiculo();
        a.setMarca("Yamaha");
        a.setModelo("YBR");
        a.setAno(2018);
        a.setPlaca("ABT2354");
        a.setCor("Preta");

        Veiculo b = new Carro();
        b.setMarca("Honda");
        b.setModelo("City");
        b.setAno(2022);
        b.setPlaca("XPT9988");
        b.setCor("Azul");

        printVeiculo(a);
        System.out.println(a.acelerar());
        System.out.println(a.acelerar());
        System.out.println(a.acelerar());
        printVeiculo(a);

//        System.out.println("-------------------");
//
//        printVeiculo(b);
//        System.out.println(b.acelerar());
//        System.out.println(b.acelerar());
//        System.out.println(b.acelerar());
//        printVeiculo(b);

    }
}
