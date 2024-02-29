public class Escopo {

    private static int x = 1;

    public static void main(String[] args) {
        int x = 5;

        System.out.printf("Local x no main é %d%n", x);

        useVariavelLocal();
        useCampo();
        useVariavelLocal();
        useCampo();

        System.out.printf("%nlocal x no main é %d%n", x);
    }

    public static void useVariavelLocal() {
        int x = 25;

        System.out.printf("%nlocal x ao entrar no método useVariavelLocal é %d%n", x);
        ++x;
        System.out.printf("local x antes de sair do método useVariavelLocal é %d%n", x);
    }

    public static void useCampo() {
        System.out.printf("%ncampo x ao entrar no método useCampo é %d%n", x);
        x *= 10;
        System.out.printf("Campo x antes de sair do método useCampo é %d%n", x);
    }
}