package rel;

public class Consulta {
    static Animal[] ANIMAIS = new Animal[]{
            new Animal("Toto", 10, "M"),
            new Animal("Fifi", 5, "F"),
            new Animal("Tupã", 10, "M"),
            new Animal("Kaka", 5, "F"),
            new Animal("Lala", 10, "F"),
            new Animal("Zeze", 15, "M"),
            new Animal("Vovo", 10, "M"),
            new Animal("Trilili", 5, "F"),
            new Animal("Doguito", 10, "M"),
            new Animal("Lilica", 5, "F")
    };

    public void gerarRelatorio(Relatorio r) {
        r.addHeaderCell("Nome do Animal");
        r.addHeaderCell("Idade");
        r.addHeaderCell("Sexo");

        for (Animal a : ANIMAIS) {
            r.addDataRow(new Object[]{
                    a.getNome(),
                    a.getIdade(),
                    a.getSexo()
            });
        }

        System.out.println("-----------------------------------------------------------------------");
        System.out.println(r.gerar());
        System.out.println("-----------------------------------------------------------------------");
    }
}
