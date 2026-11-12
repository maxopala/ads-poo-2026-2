package identificacao_tipos;

public class IdentificacaoTiposMain {
    public static void main(String[] args) {
        Guerreiro[] timeA = new Guerreiro[]{
                new Barbaro(), new Arqueiro(), new Mago()
        };

        Guerreiro[] timeB = new Guerreiro[]{
                new Mago(), new Arqueiro(), new Mago()
        };

        batalha(timeA, timeB);
    }

    public static void batalha(Guerreiro[] timeA, Guerreiro[] timeB) {
        for (int i = 0; i < 2; i++) {
            System.out.println("============================");
            System.out.println("Time A atacando");
            System.out.println("============================");
            for (int j = 0; j < timeA.length; j++) {
                System.out.println("Guerreiro " + j + " atacando");
                timeA[j].atacar(timeB[j]);
                if (timeA[j] instanceof Curador) {
                    ((Curador) timeA[j]).curar(timeA[(j + 1) % timeA.length]);
                }
            }

            System.out.println("============================");
            System.out.println("Time B atacando");
            System.out.println("============================");
            for (int j = 0; j < timeB.length; j++) {
                System.out.println("Guerreiro " + j + " atacando");
                timeB[j].atacar(timeA[j]);
                if (timeB[j] instanceof Curador) {
                    ((Curador) timeB[j]).curar(timeB[(j + 1) % timeB.length]);
                }
            }
        }
    }
}
