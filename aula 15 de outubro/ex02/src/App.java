import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App {
    public static void menu() {
        System.out.println("O que deseja fazer? \n");
        System.out.println("1 - Criar um novo continente");
        System.out.println("2 - Cadastrar um novo país");
        System.out.println("3 - Listar continentes");
        System.out.println("4 - Sair");
        }
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        ArrayList<Continente> continentes = new ArrayList<Continente>();
       // ArrayList<Pais> paises = new ArrayList<Pais>();

       String textoUsuario = "";
       ArrayList<String> TextoArquivo = new ArrayList<String>();
       FileWriter arquivoEscrita = null;
       File caminho_arquivo = new File("src/Continente.txt"); // o arquivo será criado na pasta raiz do projeto
       //arquivoEscrita.append(textoUsuario + "\n"); //inseri o texto no arquivo

        int opcao = 0;

        System.out.println("\n *** Bem vindo! *** \n");

       

        while (opcao != 4) {
            menu();
            opcao = s.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n *** Criando novo continente *** \n");
                    System.out.println("Qual o nome do continente? \n");
                    s.nextLine();
                    String nomeContinente = s.nextLine();
                    Continente novoContinente = new Continente(nomeContinente);
                    continentes.add(novoContinente);
                    break;
                case 2:
                    System.out.println("\n *** Cadastrando novo país *** \n");
                    System.out.println("Qual o nome do país? \n");
                    String nomePais = s.next();
                    System.out.println("Qual a dimensão do país? \n");
                    double dimensaoPais = s.nextDouble();
                    System.out.println("Qual a população do país? \n");
                    int populacaoPais = s.nextInt();
                    //Pais novoPais = new Pais(nomePais, dimensaoPais, populacaoPais);
                    //paises.add(novoPais);
                    System.out.println("A qual continente o país se encontra? \n"); 
                    s.nextLine();
                    String nomeContinentePais = s.nextLine();
                    boolean continenteEncontrado = false;

                    for (Continente continente : continentes) {
                        if (continente.getNomeContinente().equals(nomeContinentePais)) {
                            Pais novoPais = new Pais(nomePais, dimensaoPais, populacaoPais);
                            continente.adcPaises(novoPais);
                            continenteEncontrado = true;
                            break;
                        }
                    }

                    if (!continenteEncontrado) {
                        System.out.println("Continente inexistente");
                    }

                    break;
                case 3:
                    System.out.println("\n *** Listando continentes *** \n");
                    //este relatorio deve ser armazenado em um arquivo txt
                    int i = 0;
                    for (Continente continente : continentes){
                        
                        System.out.println("Nome do continente " + (i+1) + ":" + continente.getNomeContinente());
                            textoUsuario = continente.getNomeContinente();
                            TextoArquivo.add(textoUsuario + "\n");
                        i++;
                        System.out.println("\n Países cadastrados neste continente: \n");
                        textoUsuario = "Paises cadastraods neste continente: ";
                        TextoArquivo.add(textoUsuario + "\n");
                        //testar se a parte abaixo de países vai fumcionar
                        List<Pais> paises = continente.getPaises();
                        for (Pais pais: paises) {
                            System.out.println("Nome do país: " + pais.getNomePais());
                                textoUsuario = pais.getNomePais();
                                TextoArquivo.add(textoUsuario + "\n");

                            System.out.println("Dimensão do país: " + pais.getDimensaoPais());
                                textoUsuario = "Dimensão do país: ";
                                TextoArquivo.add(textoUsuario + "\n");
                                textoUsuario = String.valueOf(pais.getDimensaoPais());
                                TextoArquivo.add(textoUsuario + "\n");

                            System.out.println("População do país: " + pais.getPopulacaoPais());
                                textoUsuario = "População do país: ";
                                TextoArquivo.add(textoUsuario + "\n");
                                textoUsuario = String.valueOf(pais.getPopulacaoPais());
                                TextoArquivo.add(textoUsuario + "\n");
                            System.out.println();

                        }
                        System.out.println("\n|Dimensão total do Continente: " + continente.getDimensaoTotal());
                            textoUsuario = "Dimensão total do Continente: ";
                            TextoArquivo.add(textoUsuario + "\n");
                            textoUsuario = String.valueOf(continente.getDimensaoTotal());
                            TextoArquivo.add(textoUsuario + "\n");

                        System.out.println("\n|População total  do Continente: " + continente.getPopulaçãoTotal());
                            textoUsuario = "População total do Continente: ";
                            TextoArquivo.add(textoUsuario + "\n");
                            textoUsuario = String.valueOf(continente.getPopulaçãoTotal());
                            TextoArquivo.add(textoUsuario + "\n");

                        System.out.println("\n|Pais com a maior população deste continente: " + continente.maiorPopulacao());
                            textoUsuario = "Pais com a maior população deste continente: ";
                            TextoArquivo.add(textoUsuario + "\n");
                            textoUsuario = continente.maiorPopulacao();
                            TextoArquivo.add(textoUsuario + "\n");

                        System.out.println("\n|Pais com a menor população deste continente: " + continente.menorPopulacao());
                            textoUsuario = "Pais com a menor população deste continente: ";
                            TextoArquivo.add(textoUsuario + "\n");
                            textoUsuario = continente.menorPopulacao();
                            TextoArquivo.add(textoUsuario + "\n");

                        System.out.println("\n|Pais com a maior dimensão deste continente: " + continente.maiorDimensao());
                            textoUsuario = "Pais com a maior dimensão deste continente: ";
                            TextoArquivo.add(textoUsuario + "\n");
                            textoUsuario = continente.maiorDimensao();
                            TextoArquivo.add(textoUsuario + "\n");

                        System.out.println("\n|Pais com a menor dimensão deste continente: " + continente.menorDimensao());
                            textoUsuario = "Pais com a menor dimensão deste continente: ";
                            TextoArquivo.add(textoUsuario + "\n");
                            textoUsuario = continente.menorDimensao();
                            TextoArquivo.add(textoUsuario + "\n");
                    }
                         // Gravar o relatório no arquivo
                    arquivoEscrita = new FileWriter(caminho_arquivo, true); 
                    for (String linha : TextoArquivo) {
                        arquivoEscrita.write(linha.toUpperCase() + "\n");
                    }
                    arquivoEscrita.close();
                    
                    break;
                case 4:
                    System.out.println("Programa encerrado");
                    break;
                default:
                    System.out.println("Opção inválida");
                    opcao = 0;
                    break;
                           }
           
            
                           


        
        
        }
        arquivoEscrita = new FileWriter(caminho_arquivo, true); 
            //se o arquivo não existir, vai criar caso ao contrario, abre para adicionar
            arquivoEscrita.append(TextoArquivo + "\n"); //inseri o texto no arquivo

            arquivoEscrita.close(); // fecha o arquivo
    }

}