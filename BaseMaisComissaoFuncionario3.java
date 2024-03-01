public class BaseMaisComissaoFuncionario3 extends ComissaoFuncionario{
   
    private double Basesalarial;
    
    public BaseMaisComissaoFuncionario( String nome, String sobrenome, String nss, double vendas, double taxa, double salario ) {
        
        super( nome, sobrenome, nss, vendas, taxa);

        setBasesalarial( salario );
    }

    public void setBasesalarial( double salario ) {
        Basesalarial = ( salario < 0.0 ) ? 0.0 : salario;
    }

    public double getBasesalarial() {
        return Basesalarial;
    }

    @Override
    public double ganhos() {
        return getBasesalarial() + super.ganhos();
    }

    @Override
    public String toString() {
        return String.format("%s: %s\n%s: %.2f", "Base Salarial", super.toString(), "Base Salarial", getBasesalarial());
    }
}