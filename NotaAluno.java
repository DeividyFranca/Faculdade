import java.util.Scanner;

public class NotaAluno {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nota_aluno;

        System.out.print("Insira a sua nota: ");
        nota_aluno = input.nextInt();

        if (nota_aluno >= 90)
            System.out.println("A");

        else if (nota_aluno >= 80)
            System.out.println("B");

        else if (nota_aluno >= 70)
            System.out.println("C");

        else
            System.out.println("F");

    }

}
