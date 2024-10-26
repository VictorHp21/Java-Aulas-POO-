import java.util.Scanner;

public class excecao {
    public static void main(String[] args)  throws Exception{
        Scanner s = new Scanner(System.in);
         Integer numero1 = null;
         Integer numero2 = null;
       
         //int contador = 0;

         //metodo sem precisar de contador; assim ele vai repetir até os 2 valores serem digitados corretamente

        while (numero1 == null || numero2 == null) {
             try {
            
            System.out.println("Digite numero1: ");
            numero1 = s.nextInt();

             System.out.println("Digite numero2: ");
            numero2 = s.nextInt();

            System.out.println("A soma dos valores: " + numero1 + " e " + numero2 + " é igual a: " + (numero1+ numero2));

        }
        catch (Exception ex){
             System.out.println("* Erro * digite um número inteiro: ");

             s.nextLine();
        }
            //contador++;
        }

       
    }
}
