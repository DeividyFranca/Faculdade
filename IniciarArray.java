public class IniciarArray {

    public static void main(String[] args) {

        int[] array;

        array = new int[10];

        System.out.printf("%s%8s\n", "Index", "Valor");

        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d\n", counter, array[counter]);
    }
}