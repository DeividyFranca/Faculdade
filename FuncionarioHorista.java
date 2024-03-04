public class FuncionarioHorista {
    
    private double remuneracao;
    private double horas;

    public FuncionarioHorista ( String nome, String sobrenome, String nss, double Salariohora, double horasTrabalhadas) {

        super( nome, sobrenome, nss);
        setRemuneracao( Salariohora );
        setHoras( horasTrabalhadas );
    }

    public void setRemuneracao( double Salariohora ) {

        remuneracao = ( Salariohora < 0.0 ) ? 0.0 : Salariohora;
    }

    public double getRemuneracao() {

        return remuneracao;
    }

    public void setHoras( double horasTrabalhadas ) {

        horas = (( horasTrabalhadas >= 0.0 ) && ( horasTrabalhadas <= 168.0 )) ? horasTrabalhadas : 0.0;
    }

    public double getHoras() {

        return horas;
    }

    @Override
    public double ganhos() {

        if ( getHoras() <= 40 )
        return getRemuneracao() * getHoras();
        else
        return 40 * getRemuneracao() + ( getHoras() - 40 ) * getRemuneracao() * 1.5;
    }

    @Override
    public String toString() {

        return String.format("Funcionário Horista: %s\n%s: $%,.2f %s: %,.2f", super.toString(), "Salário por hora", getRemuneracao(), "Horas Trabalhadas", getHoras());
    }
}