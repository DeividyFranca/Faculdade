import java.util.Scanner;

public class LetrasdasNotas {
    public static void main(String[] args) {
        int total = 0;
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n   %s%n   %s%n", "Insira as notas inteiras no intervalo de 0-100.",
                "Digite o indicador de fim de arquivo para encerrar a entrada:",
                "No UNIX/Linux/Mac OS X digite <Ctrl> d e pressione Enter",
                "No Windows digite <Ctrl> z e pressione Enter");

        while (input.hasNext()) {
            int grade = input.nextInt();
            total += grade;
            ++gradeCounter;

            switch (grade / 10) {
                case 9:
                case 10:
                    ++aCount;
                    break;

                case 8:
                    ++bCount;
                    break;
                case 7:
                    ++cCount;
                    break;

                case 6:
                    ++dCount;
                    break;

                default:
                    ++fCount;
                    break;
            }
        }

        System.out.printf("%nRelatório de Notas:%n");

        if (gradeCounter != 0) {

            double average = (double) total / gradeCounter;

            System.out.printf("Total das notas inseridas é %d%n", gradeCounter, total);
            System.out.printf("A média da turma é %.2f%n", average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", "Número de alunos que receberam cada nota:",
                    "A: ", aCount, "B: ", bCount, "C: ", cCount, "D: ", dCount, "F: ", fCount);
        } else
            System.out.println("Nenhuma nota foi inserida");
    }
}