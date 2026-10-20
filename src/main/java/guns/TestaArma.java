package guns;

public class TestaArma {
    public static void main(String[] args) {
        Arma a = new Arma("Bereta 9mm", 12);

        String som;

        som = a.disparar();
        System.out.println(som);

        a.recarregar(5);

        som = a.disparar();
        System.out.println(som);

        som = a.disparar();
        System.out.println(som);

        som = a.disparar();
        System.out.println(som);

        som = a.disparar();
        System.out.println(som);

        som = a.disparar();
        System.out.println(som);

        som = a.disparar();
        System.out.println(som);

        som = a.disparar();
        System.out.println(som);

        som = a.disparar();
        System.out.println(som);

        a.recarregar(30);

        for (int i = 0; i < 15; i++) {
            som = a.disparar();
            System.out.println(som);
        }
    }
}
