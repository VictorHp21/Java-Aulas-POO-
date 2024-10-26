import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        // Corpo do método

        Scanner teclado = new Scanner (System.in);

        String nome, telefone;

        ArrayList<Contato> contatos = new ArrayList<Contato>();

        System.out.println("\n+++ Agenda telefonica +++\n");

        int opcao = 0;

        while(opcao != 4)
        {

            System.out.println("Escolha a opção desejada: \n1-Cadastrar contato \n2-Buscar contato \n3-Imprimir agenda \n4-Sair");
            opcao = teclado.nextInt();

            if(opcao == 1)
            {
                System.out.println("Digite o nome do contato: ");
                nome = teclado.next();

                System.out.println("Digite o telefone do contato: ");
                telefone = teclado.next();

                Contato objcContato = new Contato(nome, telefone);

                contatos.add(objcContato);



            }

            if (opcao == 2)
            {
                String busca;
                System.out.println("Digite o nome do contato que deseja procurar: ");
                busca = teclado.next();

                boolean encontrado = false;

                for (Contato lisContatos : contatos) {
                    // Usar equals() para comparar strings
                    if (lisContatos.getNome().equals(busca)) {
                        encontrado = true;
                        lisContatos.ExibirContatos();  // Exibe o contato encontrado
                        break;
                    }
                }
                 if (!encontrado){
                    //exibir o contato encontrado
                    System.out.println("Contato inexistente!");
                                 } 


                }
                if (opcao == 3)
                {
                    System.out.println("\nContatos: \n");
                    
                    for(Contato listContatos: contatos)
                    {
                        listContatos.ExibirContatos();
                    }
    
    
                }

            }

           
        }
    }

