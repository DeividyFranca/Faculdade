public class Funcionario {
    
    private String Nome;
    private String Sobrenome;
    private String NumeroSegurancasocial;

    public Funcionario( String nome, String sobrenome, String nss ) {

        Nome = nome;
        Sobrenome = sobrenome;
        NumeroSegurancasocial = nss;
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

    @Override
    public String toString() {
        
        return String.format("%s %s\nNúmero de Segurança Social: %s", getNome(), getSobrenome(), getNumeroSegurancasocial());
    }

    public abstract double ganhos();
    
}