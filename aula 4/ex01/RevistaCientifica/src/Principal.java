import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        
        //criando o objeto da revista "Ciencia e tecnologia"
        RevistaCientifica objRevista = new RevistaCientifica(563, "Ciencia e tecnologia");

        int numero = 0;
        String Titulo;
        Scanner teclado = new Scanner (System.in);

        while (numero != -1)
        {
            System.out.println("*** Cadastro de Edicao ***: \n");
            System.out.println("Digite o numero da edição");
            numero = teclado.nextInt();

            if(teclado.hasNextLine()); //limpar o conteúdo que posssa ter ficado no teclado
            teclado.nextLine();

            if(numero == -1) //encerra o cadastro de edicoes
            break;

            //criar o objeto edicao
            Edicao objEdicao = new Edicao(numero);

            //em cada edição, temos 5 Artigos artigos
            System.out.println("\n*** Cadastro de artigos ***: \n");
            for(int i = 0; i < 5; i++)
            {
                System.out.println("\n Digite o titulo do artigo " + (i+1) + ":");
                Titulo = teclado.nextLine();

                //inserir artigo na edição
                objEdicao.inserirArtigo(Titulo);
            }
            //inserir a Edição na revista
            objRevista.InserirEdicao(objEdicao);
        }

        System.out.println("\n ### Conteúdo da Revista ###:");
        //mostrar todas as edições da revista e todos os artigos de cada edição
        for(Edicao edicao: objRevista.getArray_Edicao())
        {
            //mostrar o numero da edição
            System.out.println("\n ---- Edição: " + edicao.getNumero());

            //mostrar todos os artigos da edição
            for(Artigo artigo: edicao.getArray_Artigo())
            {
                //mostrar o titulo do artigo
                System.out.println("\n ** Artigo: " + artigo.getTitulo());
            }
        }

    }
}
