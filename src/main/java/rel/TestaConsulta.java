package rel;

import util.InterfaceUtil;

public class TestaConsulta {
    public static void main(String[] args) {
        Consulta c = new Consulta();

        System.out.println("Tipo de relatório. [1] CSV | [2] HTML: ");
        int op = InterfaceUtil.lerInt();

        Relatorio rel;
        if (op == 1) {
            rel = new RelatorioCsv();
        } else {
            rel = new RelatorioHtml();
        }

        c.gerarRelatorio(rel);
    }
}
