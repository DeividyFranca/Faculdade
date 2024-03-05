import java.util.ArrayList;

public class ColecaoArrayList {

    public static void main(String[] args) {

        ArrayList< String > items = new ArrayList< String >();

        items.add( "vermelho" );
        items.add( 0, "amarelo" );

        System.out.print("Exibir o conteúdo da lista com loop controlado por contador:");

        for ( int i = 0; i < items.size(); i++ )
            System.out.printf(" %s", items.get( i ) );
        
        exibir( items, "\nExibir o conteúdo da lista com instrução for aprimorada:");

        items.add("verde");
        items.add("amarelo");
        exibir( items, "Lista com dois elementos novos:");

        items.remove("amarelo");
        exibir( items, "Removido a primeira instância de amarelo:");

        items.remove(1);
        exibir( items, "Removido o segundo elemento da lista (verde):");

        System.out.printf("\"vermelho\" está %sna lista\n", items.contains("vermelho") ? "": "não ");

        System.out.printf("Tamanho: %s\n", items.size());
    }
    public static void exibir( ArrayList< String > items, String cabecalho) {

        System.out.print(cabecalho);

        for ( String item : items)
            System.out.printf(" %s", item);
        
        System.out.println();
    }
}