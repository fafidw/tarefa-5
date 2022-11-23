public class HelloWorld {
    public static void main(String[] args){
       String ambiente = args[0];
       if(ambiente.equalsIgnoreCase("DEV")) {
        System.out.print("Executando em Dev");
       } else if (ambiente.equalsIgnoreCase("TESTE")) {
        System.out.print("Ambiente de teste");
       } else {
        System.out.print(ambiente);
       }
       
    }
}