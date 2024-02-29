import java.security.SecureRandom;

public class Craps {

    private static final SecureRandom Numerosaletorios = new SecureRandom();

    private enum Status {
        CONTINUE, GANHOU, PERDEU
    };

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        int meusPontos = 0;
        Status gameStatus;

        int somadosdados = lançardados();

        switch (somadosdados) {
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.GANHOU;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.PERDEU;
                break;
            default:
                gameStatus = Status.CONTINUE;
                meusPontos = somadosdados;
                System.out.printf("Os pontos são %d%n", meusPontos);
                break;
        }

        while (gameStatus == Status.CONTINUE) {
            somadosdados = lançardados();

            if (somadosdados == meusPontos)
                gameStatus = Status.GANHOU;
            else if (somadosdados == SEVEN)
                gameStatus = Status.PERDEU;

        }

        if (gameStatus == Status.GANHOU)
            System.out.println("Jogador venceu");
        else
            System.out.println("Jogador perdeu");

    }

    public static int lançardados() {

        int dado1 = 1 + Numerosaletorios.nextInt(6);
        int dado2 = 1 + Numerosaletorios.nextInt(6);

        int soma = dado1 + dado2;

        System.out.printf("Jogador lançou %d + %d = %d%n", dado1, dado2, soma);

        return soma;
    }
}