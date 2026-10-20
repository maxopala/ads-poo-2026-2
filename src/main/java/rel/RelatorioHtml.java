package rel;

public class RelatorioHtml implements Relatorio {
    String htmlHeader = "";
    String htmlData = "";

    @Override
    public void addHeaderCell(String h) {
        htmlHeader = htmlHeader + "<th>" + h + "</th>";
    }

    @Override
    public void addDataRow(Object[] row) {
        String linha = "";
        for (Object c : row) {
            linha = linha + "<td>" + c + "</td>";
        }
        linha = "<tr>" + linha + "</tr>";
        htmlData = htmlData + "\n" + linha;
    }

    @Override
    public String gerar() {
        return "<table border=\"1\"><thead>" + htmlHeader + "</thead><tbody>" +
                htmlData + "</tbody></table>";
    }
}
