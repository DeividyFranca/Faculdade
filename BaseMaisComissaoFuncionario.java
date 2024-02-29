public class BaseMaisComissaoFuncionario {

    private String Nome;
    private String Sobrenome;
    private String NumeroSegurancasocial;
    private double Vendasbrutas;
    private double Taxacomissao;
    private double Basesalarial;

    public BaseMaisComissaoFuncionario( String nome, String sobrenome, String nss, double vendas, double taxa, double salario) {
        Nome = nome;
        Sobrenome = sobrenome;
        NumeroSegurancasocial = nss;
        setVendasbrutas( vendas );
        setTaxacomissao( taxa );
        setBasesalarial( salario );
    }

    public void setNome( String nome ) {
        Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setSobrenome( String sobrenome ) {
        Sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setNumeroSegurancasocial( String nss ) {
        NumeroSegurancasocial = nss;
    }

    public String getNumeroSegurancasocial() {
        return NumeroSegurancasocial;
    }

    public void setVendasbrutas( double vendas ) {
        Vendasbrutas = ( vendas < 0.0 ) ? 0.0 : vendas;
    }

    public double getVendasbrutas() {
        return Vendasbrutas;
    }

    public void setTaxacomissao( double taxa ) {
        Taxacomissao = ( taxa > 0.0 && taxa < 1.0 ) ? taxa : 0.0;
    }

    public double getTaxacomissao() {
        return Taxacomissao;
    }

    public void setBasesalarial( double salario ) {
        Basesalarial = ( salario < 0.0 ) ? 0.0 : salario;
    }

    public double getBasesalarial() {
        return Basesalarial;
    }

    public double ganhos() {
        return Basesalarial + ( Taxacomissao * Vendasbrutas );
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f ", "Base Salarial e Comissão do Funcionário", Nome, Sobrenome, "Número de Segurança Social", NumeroSegurancasocial, "Vendas Brutas", Vendasbrutas, "Taxa de Comissão", Taxacomissao, "Base Salarial", Basesalarial);
    }
}