public class ComissaoFuncionario extends Object {
    private String Nome;
    private String Sobrenome;
    private String NumeroSegurancasocial;
    private double Vendasbrutas;
    private double Taxacomissao;

    public ComissaoFuncionario( String nome, String sobrenome, String nss, double vendas, double taxa ) {
        Nome = nome;
        Sobrenome = sobrenome;
        NumeroSegurancasocial = nss;
        setVendasbrutas( vendas );
        setTaxacomissao( taxa );
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

    public double ganhos() {
        return getTaxacomissao() * getVendasbrutas();
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f", "Comissão do Funcionário", getNome(), getSobrenome(), "Número de Segurança Social", getNumeroSegurancasocial(), "Vendas Brutas", getVendasbrutas(), "Taxa de Comissão", getTaxacomissao());
    }
}