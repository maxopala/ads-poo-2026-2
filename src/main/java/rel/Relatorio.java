package rel;

public interface Relatorio {
    void addHeaderCell(String h);

    void addDataRow(Object[] row);

    String gerar();
}
