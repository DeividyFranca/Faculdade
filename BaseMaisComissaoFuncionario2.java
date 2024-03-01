public class BaseMaisComissaoFuncionario2 {
    
    public static void main(String[] args) {
        BaseMaisComissaoFuncionario funcionario = new BaseMaisComissaoFuncionario("Bob", "Lewis", "333-33-3333", 5000, .04, 300);

        System.out.println("Informações de funcionários obtidas por métodos get: \n");
        System.out.printf("%s %s\n", "Nome é", funcionario.getNome());
        System.out.printf("%s %s\n", "Sobrenome é", funcionario.getSobrenome());
        System.out.printf("%s %s\n", "Número de Segurança Social é", funcionario.getNumeroSegurancasocial());
        System.out.printf("%s %.2f\n", "Vendas Brutas é", funcionario.getVendasbrutas());
        System.out.printf("%s %.2f\n", "Taxa de Comissão é", funcionario.getTaxacomissao());
        System.out.printf("%s %.2f\n", "Base Salarial é", funcionario.getBasesalarial());

        funcionario.setBasesalarial( 1000 );

        System.out.printf("\n%s:\n\n%s\n", "Atualizar informações de funcionários obtidas por toString", funcionario.toString());
    }
}