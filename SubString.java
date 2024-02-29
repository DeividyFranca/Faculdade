public class SubString {
    public static void main(String[] args) {
        String letras = "abcdefghijklmabcdefghijklm";

        System.out.printf("Substrings do index 20 para o final é \"%s\"%n", letras.substring(20));
        System.out.printf("%s \"%s\"%n", "Substrings do index 3 até, mas não incluindo 6 é", letras.substring(3, 6));
    }
}