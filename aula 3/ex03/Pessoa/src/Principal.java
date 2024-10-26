import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a qtd de alunos a cadastrar: ");
        int tamanho = teclado.nextInt();

        // Criar o vetor de Alunos com o tamanho especificado
        Aluno turma = new Aluno(tamanho);

        
        System.out.println("Digite a qtd de Professores a cadastrar: ");
        int tamanho2 = teclado.nextInt();

        // Criar o vetor de Alunos com o tamanho especificado
        Professor professor = new Professor(tamanho2);

        for(int i = 0; i < tamanho; i++)
        {
            System.out.println("Digite o nome do aluno " + (i + 1));
             String nome = teclado.next();

             System.out.println("Digite a idade do aluno " + (i + 1));
             int idade = teclado.nextInt();

             System.out.println("Digite o curso do aluno " + (i + 1));
             String Curso = teclado.next();

              // Cria uma nova instância de Aluno com os dados fornecidos
            Aluno aluno = new Aluno(nome, idade, Curso);

             turma.adicionarAluno(aluno);

        }

        System.out.println("Lista alunos: ");
        
            turma.retornaAlunos();
        

       


      
    }
}
