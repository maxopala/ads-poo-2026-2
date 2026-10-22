package abstract_class;

public class TesteFuncionario {
    public static void main(String[] args) {
        FuncAdministrativo a = new FuncAdministrativo();
        a.setCpf("111.111.111-11");
        a.setNome("Ana");
        a.setSalarioBruto(10000.00);

        FuncGerente b = new FuncGerente();
        b.setCpf("222.222.222-22");
        b.setNome("Camila");
        b.setSalarioBruto(10000.00);
        b.setQtdeSubordinados(10);

        FuncEstagiario c = new FuncEstagiario();
        c.setCpf("333.333.333-33");
        c.setNome("Joao");
        c.setSalarioBruto(10000.00);

        Funcionario[] funcs = new Funcionario[]{
                a, b, c
        };

//        for (Funcionario func : funcs) {
//            printFunc(func);
//        }

        imprimirFolhaPagamento(funcs);
    }

    static void printFunc(Funcionario a) {
        System.out.println("-----------------------------------------------");
        System.out.printf("CPF: %s / Nome: %s\n" +
                        "Proventos: %9.2f | Descontos: %9.2f | Salario Liquido: %9.2f\n",
                a.getCpf(), a.getNome(),
                a.calcularProventos(),
                a.calcularDescontos(),
                a.calcularSalarioLiquido());
    }

    static void imprimirFolhaPagamento(Funcionario[] funcs) {
        System.out.println("+--------------------+--------------+--------------+--------------+");
        System.out.println("| Nome               | Proventos    | Descontos    | Liquido      |");
        System.out.println("+--------------------+--------------+--------------+--------------+");
        double totalProventos = 0.0;
        double totalDescontos = 0.0;
        double totalLiquido = 0.0;
        for (Funcionario func : funcs) {
            totalProventos += func.calcularProventos();
            totalDescontos += func.calcularDescontos();
            totalLiquido += func.calcularSalarioLiquido();
            System.out.printf("| %-18s | R$ %9.2f | R$ %9.2f | R$ %9.2f |" +
                    "\n", func.getNome(), func.calcularProventos(), func.calcularDescontos(), func.calcularSalarioLiquido());
        }
        System.out.println("+--------------------+--------------+--------------+--------------+");
        System.out.printf("| %-18s | R$ %9.2f | R$ %9.2f | R$ %9.2f |" +
                "\n", "TOTAL", totalProventos, totalDescontos, totalLiquido);
        System.out.println("+--------------------+--------------+--------------+--------------+");
    }
}
