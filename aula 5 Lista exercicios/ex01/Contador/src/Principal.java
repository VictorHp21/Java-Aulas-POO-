import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        Contador objContador = new Contador(0);

        int valor, valorAincrementar;
        int opcao = 0;

        System.out.println("Bem vindo ao contador!");

        while(opcao != 4){
          
            System.out.println("\nEscolha uma opção:\n1-Zerar contador\n2-Incrementar um valor ao contador\n3-Mostrar o valor do contador\n4-Sair");
            opcao = teclado.nextInt();

            if(opcao == 1)
            {
                objContador.zerarValor();
            }
            if(opcao == 2)
            {
                System.out.println("Qual o número deseja adicionar ao contador? ");
                valorAincrementar = teclado.nextInt();
                objContador.incrementar(valorAincrementar);
            }
            if(opcao == 3)
            {
                System.out.print("O valor do contador é: " + objContador.RetornaValor());
                
            }

        }

        
    }
}
