public class ComissaoFuncionario3 extends Funcionario {
    
    private double Vendasbrutas;
    private double Taxacomissao;

    public ComissaoFuncionario( String nome, String sobrenome, String nss, double vendas, double taxa ){

        super( nome, sobrenome, nss );
        setVendasBrutas( vendas );
        setTaxaComissao( taxa );
    }

    public void setTaxaComissao( double taxa ) {

        Taxacomissao = ( taxa > 0.0 && taxa < 1.0 ) ? taxa : 0.0;
    }

    public double getTaxaComissao() {

        return Taxacomissao;
    }

    public void setVendasBrutas( double vendas ) {

        Vendasbrutas = ( vendas < 0.0 ) ? 0.0 : vendas;
    }

    public double getVendasBrutas() {

        return Vendasbrutas;
    }

    @Override
    public double ganhos() {

        return getTaxaComissao() * getVendasBrutas();
    }

    @Override
    public String toString() {

        return String.format("%s: %s\n%s: $%,.2f; %s: %.2f", "Comissão Funcionário", super.toString(), "Vendas Brutas", getVendasBrutas(), "Taxa de Comissão", getTaxaComissao());
    }
}