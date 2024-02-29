public class StringCompare {
   public static void main(String[] args) {
      String s1 = new String("olá");
      String s2 = "adeus";
      String s3 = "Feliz Aniversário";
      String s4 = "feliz aniversário";

      System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n%n", s1, s2, s3, s4);

      if (s1.equals("olá"))
         System.out.println("s1 é igual a \"olá\"");
      else
         System.out.println("s1 não é igual \"olá\"");

      if (s1 == "olá")
         System.out.println("s1 é o mesmo objeto que \"olá\"");
      else
         System.out.println("s1 não é o mesmo objeto que \"olá\"");

      if (s3.equalsIgnoreCase(s4))
         System.out.printf("%s é igual a %s com caso ignorado%n", s3, s4);
      else
         System.out.println("s3 não é igual a s4");

      System.out.printf("%ns1.compareTo(s2) é %d", s1.compareTo(s2));
      System.out.printf("%ns2.compareTo(s1) é %d", s2.compareTo(s1));
      System.out.printf("%ns1.compareTo(s1) é %d", s1.compareTo(s1));
      System.out.printf("%ns3.compareTo(s4) é %d", s3.compareTo(s4));
      System.out.printf("%ns4.compareTo(s3) é %d%n%n", s4.compareTo(s3));

      if (s3.regionMatches(0, s4, 0, 5))
         System.out.println("Os primeiros 5 caracteres de s3 e s4 correspondem");
      else
         System.out.println("Os primeiros 5 caracteres de s3 e s4 não correspondem");

      if (s3.regionMatches(true, 0, s4, 0, 5))
         System.out.println("Os primeiros 5 caracteres de s3 e s4 correspondem com caso ignorado");
      else
         System.out.println("Os primeiros 5 caracteres de s3 e s4 não correspondem");
   }
}