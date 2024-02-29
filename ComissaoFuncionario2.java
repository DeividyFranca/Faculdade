public class ComissaoFuncionario2 {
    
    public static void main(String[] args) {
        ComissaoFuncionario funcionario = new ComissaoFuncionario("Sue", "Jones", "222-22-2222", 10000, .06);

        System.out.println("Informações de funcionários obtidas por métodos get: \n");
        System.out.printf("%s %s\n", "Primeiro nome é", funcionario.getNome());
        System.out.printf("%s %s\n", "Sobrenome nome é", funcionario.getSobrenome());
        System.out.printf("%s %s\n", "Número de Segurança Social é", funcionario.getNumeroSegurancasocial());
        System.out.printf("%s %.2f\n", "Vendas Brutas é", funcionario.getVendasbrutas());
        System.out.printf("%s %.2f\n", "Taxa de Comissão é", funcionario.getTaxacomissao());

        funcionario.setVendasbrutas( 500 );
        funcionario.setTaxacomissao( .1 );

        System.out.printf("\n%s:\n\n%s\n", "Atualizar informações de funcionários obtidas por toString", funcionario);
    }
}