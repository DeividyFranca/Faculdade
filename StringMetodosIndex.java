public class StringMetodosIndex {
    public static void main(String[] args) {
        String letras = "abcdefghijklmabcdefghijklm";

        System.out.printf("'c' é localizado no index %d%n", letras.indexOf('c'));
        System.out.printf("'a' é localizado no index %d%n", letras.indexOf('a', 1));
        System.out.printf("'$' é localizado no index %d%n%n", letras.indexOf('$'));

        System.out.printf("O último 'c' é localizado no index %d%n", letras.lastIndexOf('c'));
        System.out.printf("O último 'a' é localizado no index %d%n", letras.lastIndexOf('a', 25));
        System.out.printf("O último '$' é localizado no index %d%n%n", letras.lastIndexOf('$'));

        System.out.printf("\"def\" é localizado no index %d%n", letras.indexOf("def"));
        System.out.printf("\"def\" é localizado no index %d%n", letras.indexOf("def", 7));
        System.out.printf("\"olá\" é localizado no index %d%n%n", letras.indexOf("olá"));

        System.out.printf("O último \"def\" é localizado no index %d%n", letras.lastIndexOf("def"));
        System.out.printf("O último \"def\" é localizado no index %d%n", letras.lastIndexOf("def", 25));
        System.out.printf("O último \"olá\" é localizado no index %d%n%n", letras.lastIndexOf("olá"));
    }
}