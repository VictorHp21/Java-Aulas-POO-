import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        //instanciando um vetor de 5 objetos
        Empregado[] empregados = new Empregado[5];

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Digite o nome do empregado" + (i + 1));
            String n = teclado.next();
            System.out.println("Digite o cpf do empregado" + (i + 1));
            int cp = teclado.nextInt();
            System.out.println("Digite o nome do empregado" + (i + 1));
            float s = teclado.nextFloat();

            empregados[i] = new Empregado(n, cp, s);
        }

    }
}
