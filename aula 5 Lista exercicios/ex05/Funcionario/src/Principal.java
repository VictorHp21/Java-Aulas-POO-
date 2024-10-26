import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;  

public class Principal {
    public static void main(String[] args) throws ParseException {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Vendedor> arrayVendedor = new ArrayList<Vendedor>();

        Gerente gerente = null;

        String nome;
        String nascimento;
        long cpf;

        

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("* Inserir Funcionários *");

            System.out.println("\nDeseja cadastrar um funcionário ou gerente?");
            System.out.println("\n-1 Vendedor\n-2 Gerente\n- \n 3 - Informacoes - 4 Sair");
            opcao = teclado.nextInt();
            teclado.nextLine();  

            if (opcao == 1) {
                System.out.println("Digite o nome do vendedor: ");
                nome = teclado.nextLine();  

                System.out.println("Digite a data de nascimento do vendedor (dd/MM/yyyy): ");
                nascimento = teclado.nextLine();
            
          
                 // This could be MM/dd/yyyy, you original value is ambiguous 
                SimpleDateFormat input = new SimpleDateFormat("dd/MM/yyyy");
                Date datanascimento = input.parse(nascimento);

                System.out.println("Digite o CPF do vendedor: ");
                cpf = teclado.nextLong();
                teclado.nextLine();  

                System.out.println("Digite o salário do vendedor: ");
                float salario = teclado.nextFloat();
                teclado.nextLine();  

                System.out.println("Digite o Estado:");
                System.out.println("Nome:");
                String nomeEstado = teclado.nextLine();
                System.out.println("Sigla:");
                String sigla = teclado.nextLine();

                Estado estado = new Estado( nomeEstado, sigla );

                System.out.println("Cidade:");
                String nomeCidade = teclado.nextLine();

                 Cidade cidade = new Cidade( nomeCidade, estado );
               

                System.out.println("Digite o endereço do vendedor:");

                System.out.println("Rua:");
                String rua = teclado.nextLine();

                System.out.println("Número:");
                int numero = teclado.nextInt();
                teclado.nextLine(); 

                System.out.println("Bairro:");
                String bairro = teclado.nextLine();

                System.out.println("CEP:");
                 int cep = teclado.nextInt();

                Endereco endereco = new Endereco(rua, bairro, numero, cep, cidade);

                 Vendedor vendedor = new Vendedor(nome, datanascimento, cpf, endereco, salario);
                 arrayVendedor.add(vendedor);
                 
                



              
            }

            if (opcao == 2) {
                System.out.println("Digite o nome do Gerente: ");
                nome = teclado.nextLine();  

                System.out.println("Digite a data de nascimento do Gerente (dd/MM/yyyy): ");
                nascimento = teclado.nextLine();

                  // This could be MM/dd/yyyy, you original value is ambiguous 
                  SimpleDateFormat input = new SimpleDateFormat("dd/MM/yyyy");
                  Date datanascimento = input.parse(nascimento);
                

                System.out.println("Digite o CPF do Gerente: ");
                cpf = teclado.nextLong();
                teclado.nextLine();  

                System.out.println("Digite o salário do Gerente: ");
                float salario = teclado.nextFloat();
                teclado.nextLine();  

                System.out.println("Digite o Estado:");
                System.out.println("Nome:");
                String nomeEstado = teclado.nextLine();
                System.out.println("Sigla:");
                String sigla = teclado.nextLine();

                 Estado estado = new Estado( nomeEstado, sigla );

                System.out.println("Cidade:");
                String nomeCidade = teclado.nextLine();

                Cidade cidade = new Cidade( nomeCidade, estado );

               

              

                System.out.println("Digite o endereço do Gerente:");

                System.out.println("Rua:");
                String rua = teclado.nextLine();

                System.out.println("Número:");
                int numero = teclado.nextInt();
                teclado.nextLine();  

                System.out.println("Bairro:");
                String bairro = teclado.nextLine();

                System.out.println("CEP:");
                int cep = teclado.nextInt();

                Endereco endereco = new Endereco(rua, bairro, numero, cep, cidade);

                 gerente = new Gerente(nome, datanascimento, cpf, endereco, salario);

                // gerente.exibirInformacoes();

            

               
    }


    if(opcao == 3)
    {
        System.out.println("\n *** Lista Funcionarios ***\n");
        System.out.println("Gerente: ");

        gerente.exibirInformacoes();

        System.out.println("\nVendedores: \n");

       for(Vendedor objVendedor: arrayVendedor)
       {
         objVendedor.exibirInformacoes();
       }

       

    }
}

    }


}