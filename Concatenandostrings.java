public class Concatenandostrings {
    public static void main(String[] args) {
        String s1 = "Feliz ";
        String s2 = "Aniversário";

        System.out.printf("s1 = %s%ns2 = %s%n%n", s1, s2);
        System.out.printf("Resultado de s1.concat(s2) = %s%n", s1.concat(s2));
        System.out.printf("s1 após concatenação = %s%n", s1);
    }
}