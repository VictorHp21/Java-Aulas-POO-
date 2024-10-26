import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("------ Operações Matematica ------");

        double valor1, valor2;
        System.out.println("\nDigite o valor1");
        valor1 = teclado.nextDouble();
        System.out.println("Digite o valor2");
        valor2 = teclado.nextDouble();

        //OperacaoMat objMat = new OperacaoMat(valor1, valor2);

        int opcao = 0;
        while (opcao != 7) {
            
        

        

        System.out.println("***** Qual operação deseja realizar *****");
        System.out.println("\n1 - Soma");
        System.out.println("\n2 - Subtração");
        System.out.println("\n3 - Divisão");
        System.out.println("\n4 - Multiplicação");
        System.out.println("\n5 - Média");
        System.out.println("\n6 - Média Ponderada");
        System.out.println("\n7 - Sair ");
        opcao = teclado.nextInt();

       

        switch (opcao) {
            case 1:
            Soma objSoma = new Soma (valor1, valor2);
            System.out.println("A soma dos valores é: " + objSoma.soma());
                break;
                case 2:
                Subtracao objSub = new Subtracao(valor1, valor2);
                System.out.println("A Subtração dos valores é: " + objSub.subtracao());

                break;
        
            case 3:
            Divisao objdiv = new Divisao(valor1, valor2);
            System.out.println("A Divisão dos valores é: " + objdiv.div());
                break;
        
            case 4:
             Multiplicacao objmult = new Multiplicacao(valor1, valor2);
            System.out.println("A Multiplicação dos valores é: " + objmult.mult());
                break;
        
            case 5:
            Media objmed = new Media(valor1, valor2);
            System.out.println("A Media dos valores é: " + objmed.med());
                break;
        
            case 6:
            System.out.println("Digite o peso do valor1: ");
            double peso1 = teclado.nextDouble();
            System.out.println("Digite o peso do valor2: ");
            double peso2 = teclado.nextDouble();
            MediaPonderada objmedP = new MediaPonderada(valor1, valor2, peso1, peso2);
            System.out.println("A Media Ponderada dos valores é: " + objmedP.mediap());
                break;
        
            default:
                break;
        }
    }
 }
}
