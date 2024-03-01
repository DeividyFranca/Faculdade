public class Polimorfismo {

    public static void main(String[] args) {
        
        ComissaoFuncionario comissaoFuncionario = new ComissaoFuncionario("Sue", "Jones", "222-22-2222", 10000, .06);

        BaseMaisComissaoFuncionario baseMaisComissaoFuncionario = new BaseMaisComissaoFuncionario("Bob", "Lewis", "333-33-3333", 5000, .04, 300);

        System.out.printf("%s %s:\n\n%s\n\n", "Chamando ComissãoFuncionario toString com referência da suplerclass", "para o objeto da superclass", comissaoFuncionario.toString());
        
        System.out.printf("%s %s:\n\n%s\n\n", "Chamando BaseMaisComissãoFuncionario toString com suplerclass", "referência ao objeto da superclass", baseMaisComissaoFuncionario.toString());

        ComissaoFuncionario comissaoFuncionario2 = baseMaisComissaoFuncionario;
        System.out.printf("%s %s:\n\n%s\n\n", "Chamando BaseMaisComissãoFuncionario toString com suplerclass", "referência ao objeto da superclass", comissaoFuncionario2.toString());

    }
    
}