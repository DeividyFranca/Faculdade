import java.util.Scanner;

public class AnalisedeResultados {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int passar = 0;
        int falhas = 0;
        int studentCounter = 1;

        while (studentCounter <= 10) {

            System.out.print("Insira o resultado (1 = passou, 2 = falhou): ");
            int resultado = input.nextInt();

            if (resultado == 1)
                passar = passar + 1;
            else
                falhas = falhas + 1;

            studentCounter = studentCounter + 1;
        }

        System.out.printf("Passaram: %d%nFalharam: %d%n", passar, falhas);

        if (passar > 8)
            System.out.println("Bônus para o instrutor!");
    }
}