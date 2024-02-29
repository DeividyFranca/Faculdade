import java.security.SecureRandom;

public class Inteiros_Aleatorios {
    public static void main(String[] args) {
        SecureRandom Numerosaleatorios = new SecureRandom();

        for (int counter = 1; counter <= 20; counter++) {

            int face = 1 + Numerosaleatorios.nextInt(6);

            System.out.printf("%d  ", face);

            if (counter % 5 == 0)
                System.out.println();
        }
    }
}