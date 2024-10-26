import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        

        System.out.println("Digite a qtd de alunos a cadastrar: ");
        int tamanho = teclado.nextInt();

         // Criar o vetor de Alunos com o tamanho especificado
         Alunos aluno = new Alunos(tamanho);

        for(int i = 0; i < tamanho; i++)
        {
            System.out.println("Digite o nome do aluno" + (i+ 1));
            String n = teclado.next();

            System.out.println("Insira a nota1: ");
            double n1 = teclado.nextDouble();

            System.out.println("Insira a nota2: ");
            double n2 = teclado.nextDouble();

            aluno.inserirNotas(n, n1, n2);


        }

        System.out.println("A nota media dos alunos é: " + aluno.calcularMedia());

        System.out.println("Digite a partir de que valor deseja calcular a media: ");
        double valor = teclado.nextDouble();

        System.out.println("A media de notas a partir desse valor é: " + aluno.media2(valor));

    }
}
