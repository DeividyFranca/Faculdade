import java.util.Scanner;

public class MediadaClasse2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;

        System.out.print("Insira a nota ou -1 para sair: ");
        int nota = input.nextInt();

        while (nota != -1) {
            total = total + nota;
            gradeCounter = gradeCounter + 1;

            System.out.print("Insira a nota ou -1 para sair: ");
            nota = input.nextInt();
        }

        if (gradeCounter != 0) {
            double media = (double) total / gradeCounter;

            System.out.printf("%nO total das %d notas inseridas é %d%n", gradeCounter, total);
            System.out.printf("A média da classe é %.2f%n", media);
        } else
            System.out.println("Nenhuma nota foi inserida");
    }
}