import java.util.Scanner;

public class SomaSimples {

    public static void main(String[] args)

    {

        Scanner input = new Scanner(System.in);

        int numero1,
                numero2,
                soma;

        System.out.print("Insira o primeiro número: ");

        numero1 = input.nextInt();

        System.out.print("Insira o segundo número: ");

        numero2 = input.nextInt();

        soma = numero1 + numero2;

        System.out.print("A soma é: " + soma);

    }

}