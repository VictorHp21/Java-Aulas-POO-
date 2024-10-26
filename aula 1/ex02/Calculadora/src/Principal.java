import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Calculadora objeto1;
        int numero1, numero2;

        Scanner teclado = new Scanner(System.in); //leitura do teclado

        System.out.println("Digite o numero1: ");
        numero1 = teclado.nextInt();
        System.out.println("Digite o numero2: ");
        numero2 = teclado.nextInt();

         objeto1 = new Calculadora(numero1, numero2);

         //chamar metodo multiplicacao
         System.out.format("\n o produto dos numero e %d", objeto1.multiplica());

         //metodo media
         System.out.println("\nA media dos 2 numeros e: " + objeto1.media());

    }
}
