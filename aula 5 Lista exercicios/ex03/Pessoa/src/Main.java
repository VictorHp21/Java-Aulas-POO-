import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;  

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner (System.in);

        ArrayList<Professor> equipProfessor = new ArrayList<Professor>();

        ArrayList<Coordenador> equipCoordenador = new ArrayList<Coordenador>();

        int opcao = 0;
        int contador = 0;
        int cpf;
        double salario;
        String curso, nome;

        System.out.println(" * Cadastrar Professor/ Coolaborador *\n");

        while (opcao != 4) {
            System.out.println("Escolha a opção desejada: \n1-Cadastrar Professor\n2-Cadastrar Coolaborador\n3-Exibir cadastrados\n4-Sair");
            opcao = teclado.nextInt();

            if(opcao == 1)
            {
                System.out.println("Digite o nome do professor: ");
                nome = teclado.next();

                 System.out.println("Digite o cpf do professor: ");
                cpf = teclado.nextInt();

                 System.out.println("Digite o salario do professor: ");
                salario = teclado.nextDouble();

                contador ++;

                Professor professor = new Professor(nome, cpf, contador, salario);

                 equipProfessor.add(professor);



            }
            if (opcao == 2)
            {
                 System.out.println("Digite o nome do Coordenador: ");
                nome = teclado.next();

                 System.out.println("Digite o cpf do Coordenador: ");
                cpf = teclado.nextInt();

                     System.out.println("Digite o salario do Coordenador: ");
                salario = teclado.nextDouble();

                 System.out.println("Digite o curso do Coordenador: ");
                curso = teclado.next();

                

                contador ++;

                Coordenador coordenador = new Coordenador(nome, cpf, contador, salario, curso);

                 equipCoordenador.add(coordenador);

            }

            if (opcao == 3)
            {

                System.out.println("\n ---- Professores ----");

                 int cont = 0;

                 for(Professor professores: equipProfessor)
                         {
                          
                            cont ++;
                               System.out.println("\n Professor " + cont);
                             professores.DadosProf();
                         }

                System.out.println("\n ---- Coordenadores ----");

                 cont = 0;

                for (Coordenador coordenadores: equipCoordenador)
                {
                      
                     cont ++;
                     System.out.println("\n Coordenador " + cont);

                    coordenadores.DadosCoordenador();

                }
            }
        }
    }
}