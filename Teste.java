public class Teste {

    public static void main(String[] args) {

        int x = 2, y = 3, w = 4, z = 5;
        int resultado1 = soma(x, y);
        int resultado2 = soma(w, z);
        System.out.println(resultado1);
        System.out.println(resultado2);
    }

    static int soma(int a, int b) {

        int resultado = a + b;
        return resultado;
    }
}