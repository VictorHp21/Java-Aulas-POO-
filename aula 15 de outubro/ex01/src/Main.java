import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String textoUsuario = "";

        Scanner s = new Scanner(System.in);

        ArrayList<String> TextoArquivo = new ArrayList<String>();

        FileWriter arquivoEscrita = null;
        File caminho_arquivo = new File("src/arquivo.txt"); // o arquivo será criado na pasta raiz do projeto

        try {
            while(textoUsuario != "-1") {
                System.out.println("Escreva o que deseja inserir no arquivo: ");
                textoUsuario = s.nextLine();

                if(textoUsuario.trim().equals("-1"))
                {
                    break; // encerra a leitura do arquivo
                }
            
            arquivoEscrita = new FileWriter(caminho_arquivo, true); 
            //se o arquivo não existir, vai criar caso ao contrario, abre para adicionar
            arquivoEscrita.append(textoUsuario + "\n"); //inseri o texto no arquivo

            arquivoEscrita.close(); // fecha o arquivo
            
            }
        } catch (Exception e) {
            System.out.println("Erro ao acessar aarquivo para escrita. " );
        }

    if(caminho_arquivo.exists()) //se existir o arquivo no caminho especificado
    {
        try {
            Scanner leitor = new Scanner(caminho_arquivo);
            String texto = "";

            while(leitor.hasNextLine()) //existe uma linha com informações no arquivo?
            {
                //adicionar uma nova string ao List
                TextoArquivo.add(leitor.nextLine());
            }
            leitor.close();

        } catch (Exception e) {
            System.out.println("Erro ao acessar aarquivo para escrita. " );
        }
    }
    
    System.out.println("Conteudo do arquivo: ");
     
        for(String i: TextoArquivo)
        {
            System.out.println(i + "\n");
        }

    }
}
