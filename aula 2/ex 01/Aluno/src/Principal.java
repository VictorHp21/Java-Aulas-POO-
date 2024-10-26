import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int nota1, nota2, nota3;

        System.out.println("******* Dados Aluno *******");
        System.out.println("Digite o nome do aluno: ");
        nome = scan.next();
        System.out.println("Digite a nota1: ");
        nota1 = scan.nextInt();
        System.out.println("Digite a nota2: ");
        nota2 = scan.nextInt();
        System.out.println("Digite a nota3: ");
        nota3 = scan.nextInt();

        Aluno objetoaluno; //declaração do objeto
        objetoaluno = new Aluno(nome, nota1, nota2, nota3); // instanciando objeto

        System.out.println("******* Boletim final *******");
        System.out.println("Aluno " + objetoaluno.retornome() + " está " + objetoaluno.Resultadofinal());


    }
}
