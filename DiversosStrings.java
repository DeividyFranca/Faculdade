public class DiversosStrings {
    public static void main(String[] args) {
        String s1 = "Olá";
        char[] charArray = new char[5];

        System.out.printf("s1: %s", s1);

        System.out.printf("%nComprimento do s1: %d", s1.length());

        System.out.printf("%nA string invertida é: ");

        for (int count = s1.length() - 1; count >= 0; count--)
            System.out.printf("%c", s1.charAt(count));

        s1.getChars(0, 3, charArray, 0);
        System.out.printf("%nA matriz de caracteres é: ");

        for (char character : charArray)
            System.out.print(character);

        System.out.println();
    }
}