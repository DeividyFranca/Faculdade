import java.security.SecureRandom;

public class Dado_6M {
    public static void main(String[] args) {
        SecureRandom Numerosaleatorios = new SecureRandom();

        int frequencia1 = 0;
        int frequencia2 = 0;
        int frequencia3 = 0;
        int frequencia4 = 0;
        int frequencia5 = 0;
        int frequencia6 = 0;

        for (int rolar = 1; rolar <= 6000000; rolar++) {
            int face = 1 + Numerosaleatorios.nextInt(6);

            switch (face) {
                case 1:
                    ++frequencia1;
                    break;
                case 2:
                    ++frequencia2;
                    break;
                case 3:
                    ++frequencia3;
                    break;
                case 4:
                    ++frequencia4;
                    break;
                case 5:
                    ++frequencia5;
                    break;
                case 6:
                    ++frequencia6;
                    break;
            }
        }

        System.out.println("Face\tFrequência");
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", frequencia1, frequencia2, frequencia3,
                frequencia4, frequencia5, frequencia6);
    }
}