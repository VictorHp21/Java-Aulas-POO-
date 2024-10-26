import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        float lado1, lado2, lado3;
        Triangulo objeto1; //declaração do objeto da classe triangulo

        Scanner teclado = new Scanner(System.in); //leitura do teclado

        //solicitar ao usuario que digite os 3 lados do triangulo
        System.out.println("Digite o lado1: ");
        lado1 = teclado.nextFloat();
        System.out.println("Digite o lado2: ");
        lado2 = teclado.nextFloat();
        System.out.println("Digite o lado3: ");
        lado3 = teclado.nextFloat();

        //instanciar o objeto triangulo
        objeto1 = new Triangulo(lado1,lado2,lado3);

        //chamar o metodo para calcular o perimetro
        System.out.println("\n O perimetro do triangulo e: " + objeto1.calculaperimetro());

        //chamar o metodo para verificar se é equilatero
        if (objeto1.verificaequila() == true)
            System.out.println("Traingulo equilatero");
        else System.out.println("Nao e equilatero");

    }
}
