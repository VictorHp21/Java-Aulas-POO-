import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        int numero1, numero2, numero3;
        operacoes obj1;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        numero1 = teclado.nextInt();
        System.out.println("Digite o segundo  numero: ");
        numero2 = teclado.nextInt();
        System.out.println("Digite o terceiro numero: ");
        numero3 = teclado.nextInt();
        
        //instanciar o objeto
        obj1 = new operacoes(numero1, numero2, numero3);

        System.out.println("\nA soma destes numeros e: " + obj1.somar());
        System.out.println("\n A subtra destes numeros: " + obj1.subtrair());
        System.out.println("\n A multiplicacao destes numeros: " + obj1.multiplicar());
        System.out.println("\n A media destes numeros: " + obj1.media());
        System.out.println("\n O maior destes numeros: " + obj1.maior());



        


    }
}
