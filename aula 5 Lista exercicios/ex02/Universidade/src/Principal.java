import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);

        String nomeUniversidade, nome;
        int ano, dia, mes, idade;
        int opcao = 0;

          ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();



        System.out.println("**** Cadastro Pessoa/Universidade ****");

        while (opcao != 3) {
            System.out.println("\nEscolha uma oopção:\n1-Adcionar pessoa\n2-exibir relatorio de pessoas cadastradas\n3-Sair");
            opcao = teclado.nextInt();

            if(opcao == 1)
            {
                System.out.println("Digite o nome da pessoa ");   
                nome = teclado.next();
                System.out.println("Digite a idade da pessoa ");   
                idade = teclado.nextInt();

                System.out.println("Digite o dia do nascimento da pessoa "); 
                dia = teclado.nextInt();
                
                System.out.println("Digite o mes do nascimento da pessoa ");   
                mes = teclado.nextInt();

                System.out.println("Digite o ano do nascimento da pessoa ");   
                ano = teclado.nextInt();

                System.out.println("Digite a faculdade em que a pessoa trabalha");
                nomeUniversidade = teclado.next();

                Universidade objuUniversidade = new Universidade(nomeUniversidade);

                Pessoa pessoa = new Pessoa(nomeUniversidade, nome, idade, dia, mes, ano);

                pessoas.add(pessoa);

            }

            if(opcao == 2)
            {
                System.out.println("\nRelatorio: \n");

                for(Pessoa pessoa: pessoas)
                {
                    pessoa.exibirdados();
                }
            }
        }

    }
}
