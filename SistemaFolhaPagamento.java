public class SistemaFolhaPagamento {
    
    public static void main(String[] args) {
        
        FuncionarioAssalariado Funcionarioassalariado = new FuncionarioAssalariado("John", "Smith", "111-11-1111", 800.00);
        FuncionarioHorista Funcionariohorista = new FuncionarioHorista("Karen", "Prince", "222-22-2222", 16.75, 40);
        ComissaoFuncionario comissaofuncionario = new ComissaoFuncionario("Sue", "Jones", "333-33-3333", 10000, .06);
        BaseMaisComissaoFuncionario baseMaisComissaoFuncionario = new BaseMaisComissaoFuncionario("Bob", "Lewis", "444-44-4444", 5000, .04, 300);

        System.out.println("Funcionários processados individualmente:\n");

        System.out.printf("%s\n%s: $%,.2f\n\n", Funcionarioassalariado, "Recebeu", Funcionarioassalariado.ganhos());
        System.out.printf("%s\n%s: $%,.2f\n\n", Funcionariohorista, "Recebeu", Funcionariohorista.ganhos());
        System.out.printf("%s\n%s: $%,.2f\n\n", comissaofuncionario, "Recebeu", comissaofuncionario.ganhos());
        System.out.printf("%s\n%s: $%,.2f\n\n", baseMaisComissaoFuncionario, "Recebeu", baseMaisComissaoFuncionario.ganhos());

        Funcionario[] funcionarios = new Funcionario[4];

        funcionarios[0] = Funcionarioassalariado;
        funcionarios[1] = Funcionariohorista;
        funcionarios[2] = comissaofuncionario;
        funcionarios[3] = baseMaisComissaoFuncionario;

        System.out.println("Funcionários processados polimorficamente:\n");

        for (Funcionario Funcionarioatual : funcionarios) {

            System.out.println(Funcionarioatual);

            if (Funcionarioatual instanceof BaseMaisComissaoFuncionario) {
                
                BaseMaisComissaoFuncionario3 funcionario = ( BaseMaisComissaoFuncionario ) Funcionarioatual;

                funcionario.setBasesalarial( 1.10 * funcionario.getBasesalarial() );

                System.out.printf("Nova Base Salarial com 10%% de aumento é: $%,.2f\n", funcionario.getBasesalarial());
            }

            System.out.printf("Recebeu $%,.2f\n\n", Funcionarioatual.ganhos());
        }

        for ( int j = 0; j < funcionarios.length; j++ )
        System.out.printf( "Funcionário %d é um %s\n", j, funcionarios[ j ].getClass().getName() );
    }
}