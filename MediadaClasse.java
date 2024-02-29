import java.util.Scanner;

public class MediadaClasse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 10) {
            System.out.print("Insira as notas: ");
            int nota = input.nextInt();
            total = total + nota;
            gradeCounter = gradeCounter + 1;
        }

        int media = total / 10;

        System.out.printf("%n O total de todas as 10 notas é %d%n", total);
        System.out.printf("A média da classe é %d%n", media);
    }
}