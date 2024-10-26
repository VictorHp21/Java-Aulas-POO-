import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner (System.in);
        
        produto[] produtos = new produto[5];

        System.out.println(" --- Cadastre 5 produtos ---");

        String nome =  null;  
         

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do produto " + (i+1) + ": ");
            nome = s.next();
     
    boolean tentativa = false;

    while( tentativa == false) {
        try {

            if (isNumeric(nome) == true) {
                throw new Exception("Nome invalido");
            } else {
                tentativa = true;
            }
        } catch (Exception ex) {
            System.out.println("Erro: " + ex);
            //s.nextLine();
            System.out.println("Digite o nome do produto " + (i+1) + ": ");
             nome = s.next();
        }
    }
      
    String custoString = "";
    float custoFloat = 0;
        
    while(custoFloat <= 0) {
        try {
            System.out.println("Digite o valor do produto " + (i+1) + ": ");
            custoString = s.next();

            if(!custoString.matches("-?\\d+(\\.\\d+)?")) //se não for um número
            {
                throw new Exception("Custo invalido");
            } else{
                    custoFloat = Float.parseFloat(custoString);
                    produtos[i] = new produto(nome, custoFloat);
                  }

            } catch (Exception e) {
                System.out.println("Erro: " + e);
               
            }
          
           

            //produtos[i] = new produto(nome, custoFloat);
        }
    }
       

        System.out.println("Os Produtos cadastrados são: ");

        for (int k = 0; k < 5; k++) {
            System.out.println(produtos[k].getNome() + " - " + produtos[k].getCusto());
        }
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            //tenta converter a string para inteiro se conseguir é numerico
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }



}
