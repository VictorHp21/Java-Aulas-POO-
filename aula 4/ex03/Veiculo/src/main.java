import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);

        ArrayList<Onibus> ArrayOnibus = new ArrayList<Onibus>();

        ArrayList<Caminhao> ArrayCaminhao = new ArrayList<Caminhao>();

        String placa;
        int ano;
        int Assentos;
        int eixos;

        int opcao = 0;

        while( opcao != 4)
        {
            System.out.println(" *** Cadastrar veículos ***\n");

            System.out.println("Escolha a opção desejada\n");
            System.out.println("1- Cadastrar Caminhão\n");
            System.out.println("2- Cadastrar Onibus\n");
            System.out.println("3- Exibir Cadsatrados\n");
            System.out.println("4- sair\n");

            opcao = teclado.nextInt();
            teclado.nextLine();


                if(opcao == 1)
                {
                    System.out.println("Digite a placa do caminhão: ");
                    placa = teclado.next();

                    System.out.println("Digite o ano do caminhão: ");
                    ano = teclado.nextInt();

                    System.out.println("Digite o numero de eixos do caminhão: ");
                    eixos = teclado.nextInt();

                    Caminhao objCaminhao = new Caminhao(placa, ano, eixos);

                    ArrayCaminhao.add(objCaminhao);
                }

                if(opcao == 2)
                {
                    System.out.println("Digite a placa do Onibus: ");
                    placa = teclado.next();

                    System.out.println("Digite o ano do Onibus: ");
                    ano = teclado.nextInt();

                    System.out.println("Digite o numero de assentos do Onibus: ");
                    Assentos = teclado.nextInt();

                    Onibus objOnibus = new Onibus(placa, ano, Assentos);

                    ArrayOnibus.add(objOnibus);
                }

                if(opcao == 3)
                {
                System.out.println("Caminhões: ");

                    for(Caminhao objCaminhao: ArrayCaminhao)
                    {
                        objCaminhao.ExibirDados();
                    }

                    System.out.println("Onibus: ");
                
                    for(Onibus objOnibus: ArrayOnibus)
                    {
                        objOnibus.ExibirDados();
                    }
                }



        }

      

    }
}
