public class DiversosStrings2 {
    public static void main(String[] args) {
        String s1 = "olá";
        String s2 = "ADEUS";
        String s3 = "   espaços   ";

        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%n%n", s1, s2, s3);

        System.out.printf("Substituir 'l' por 'L' no s1: %s%n%n", s1.replace('l', 'L'));

        System.out.printf("s1.toUpperCase() = %s%n", s1.toUpperCase());
        System.out.printf("s2.toLowerCase() = %s%n", s2.toLowerCase());

        System.out.printf("s3 depois do corte = \"%s\"%n%n", s3.trim());

        char[] charArray = s1.toCharArray();
        System.out.print("s1 como uma matriz de caracteres = ");

        for (char character : charArray)
            System.out.print(character);

        System.out.println();
    }
}