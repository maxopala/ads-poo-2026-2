package rel;

public class RelatorioCsv implements Relatorio {
    private String cabecalho;
    private String dados;

    public RelatorioCsv() {
        this.cabecalho = "";
        this.dados = "";
    }

    @Override
    public void addHeaderCell(String h) {
        if (this.cabecalho.isEmpty()) {
            this.cabecalho = h;
        } else {
            this.cabecalho = this.cabecalho + "," + h;
        }
    }

    @Override
    public void addDataRow(Object[] row) {
        String linha = "";
        for (Object c : row) {
            if (linha.isEmpty()) {
                linha = c.toString();
            } else {
                linha = linha + "," + c;
            }
        }

        if (this.dados.isEmpty()) {
            this.dados = linha;
        } else {
            this.dados = this.dados + "\n" + linha;
        }
    }

    @Override
    public String gerar() {
        return cabecalho + "\n" + dados;
    }
}
