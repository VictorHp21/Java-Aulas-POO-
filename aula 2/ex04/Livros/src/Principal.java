import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        String t;
        int qtd = 0;
        int pgs;

        //instanciado objeto
        Livros objetoLivro1 = new Livros("Principe", 150, 0);

        System.out.println("O livro cadastrado é: " + objetoLivro1.retornaTitulo());
        System.out.format("O progresso de leitura é : %.2f por cento", objetoLivro1.VerificarProgresso());

        System.out.println("\nDigite o titulo correto do livro: ");
        t = teclado.nextLine();
        objetoLivro1.AlterarTitulo(t);

        System.out.println("Quantas paginas foram lidas? ");
        pgs = teclado.nextInt();

        
        System.out.println("O livro cadastrado é: " + objetoLivro1.retornaTitulo());
        System.out.format("O progresso de leitura é : %.2f por cento", objetoLivro1.VerificarProgresso(pgs, objetoLivro1.retornaQtdpaginas()));




    }
}
