import java.util.Scanner;

public class Comparacao {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero1,
                numero2;

        System.out.print("Insira o primeiro número: ");
        numero1 = input.nextInt();

        System.out.print("Insira o segundo número: ");
        numero2 = input.nextInt();

        if (numero1 == numero2)
            System.out.printf("%d == %d%n", numero1, numero2);

        if (numero1 != numero2)
            System.out.printf("%d != %d%n", numero1, numero2);

        if (numero1 < numero2)
            System.out.printf("%d < %d%n", numero1, numero2);

        if (numero1 > numero2)
            System.out.printf("%d > %d%n", numero1, numero2);

        if (numero1 <= numero2)
            System.out.printf("%d <= %d%n", numero1, numero2);

        if (numero1 >= numero2)
            System.out.printf("%d >= %d%n", numero1, numero2);

    }

}