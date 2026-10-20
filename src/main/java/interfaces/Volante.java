package interfaces;

public interface Volante {
    /**
     * Faz com que o veículo mude sua direção para o rumo indicado
     * no tamanho informado no segundo parâmetro.
     *
     * @param direcao Direção do giro
     * @param tamanho Tamanho do giro
     * @return Indica se o giro encontrou trava do volante.
     */
    boolean girar(Direcao direcao, double tamanho);
}
