import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);

        int[] valores;
        valores = new int[5];

        System.out.println("Digite 5 valores: ");

        for (int i = 0; i < valores.length; i++) {

            try {
                System.out.println("valor "+ (i + 1) + ": ");
                valores[i] = s.nextInt();
            } catch (Exception ex) {
                System.out.println("***ERRO***\n digite um valor inteiro");
                 s.nextLine();
                 System.out.println("valor "+ (i + 1) + ": ");
                 valores[i] = s.nextInt();
            }
           
        }

        Conta cp = new Contapoupanca();

        System.out.println("### Extrato da conta poupancia ###");

        for (int k = 0; k < valores.length; k++) {
            cp.SetSaldo(valores[k]);
            cp.imrpimirExtrato();
        }

       System.out.println("Total depositado na conta ");

       cp.total();


        //System.out.println("Hello, World!");
    }
}
