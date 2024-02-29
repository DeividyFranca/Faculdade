public class JurosCompostos {
    public static void main(String[] args) {
        double valor;
        double principal = 1000.0;
        double taxa = 0.05;

        System.out.printf("%s%20s %n", "Anos", "Valor em depósito");

        for (int ano = 1; ano <= 10; ++ano) {
            valor = principal * Math.pow(1.0 + taxa, ano);

            System.out.printf("%4d%,20.2f%n", ano, valor);
        }
    }
}