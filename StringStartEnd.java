public class StringStartEnd {
    public static void main(String[] args) {
        String[] strings = { "iniciado", "iniciando", "terminou", "final" };

        for (String string : strings) {
            if (string.startsWith("in"))
                System.out.printf("\"%s\" começa com \"in\"%n", string);
        }

        System.out.println();

        for (String string : strings) {
            if (string.startsWith("ici", 2))
                System.out.printf("\"%s\" começa com \"ici\" na posição 2%n", string);
        }

        System.out.println();

        for (String string : strings) {
            if (string.endsWith("do"))
                System.out.printf("\"%s\" termina com \"do\"%n", string);
        }
    }
}
