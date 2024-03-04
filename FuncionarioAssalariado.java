public class FuncionarioAssalariado extends Funcionario {

    private double Salariosemanal;

    public FuncionarioAssalariado(String nome, String sobrenome, String nss, double salario) {

        super(nome, sobrenome, nss);
        setSalarioSemanal(salario);
    }

    public void setSalarioSemanal(double salario) {

        Salariosemanal = salario < 0.0 ? 0.0 : salario;
    }

    public double getSalarioSemanal() {
        return Salariosemanal;
    }

    @Override
    public double ganhos() {

        return getSalarioSemanal();
    }

    @Override
    public String toString() {

        return String.format("Funcionário Assalariado: %s\n%s: $%,.2f", super.toString(), "Salário Semanal",
                getSalarioSemanal());
    }

}