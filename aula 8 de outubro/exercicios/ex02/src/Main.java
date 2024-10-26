import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        double valor = 0;

       Contacorrente[] contas = new Contacorrente[5];	

       Contapoupança[] contasP = new Contapoupança[5];

       for (int i = 0; i < contas.length; i++) {
           contas[i] = new Contacorrente();
       }

       for (int i = 0; i < contasP.length; i++) {
           contasP[i] = new Contapoupança();
       }

        int opcao = 0;
        System.out.println("Bem vindo ao app do Banco!\n");

    while(opcao != 4){
        System.out.println("Escolha uma opção:");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Ver saldo");
        System.out.println("4. Sair: ");
        opcao = s.nextInt();
        System.out.println("\n");
        switch (opcao) {
            case 1:
                System.out.println("*** Depositar ***\n");
                int c = 0;
            while(c != 1 && c != 2){
                try{
                    System.out.println("Deseja depositar em 1.conta corrente ou 2. conta poupança?");
                 c = s.nextInt();
                } catch(Exception ex){
                   System.out.println("ERRO: digite uma opção valida");
                   s.nextLine();
                   System.out.println("Deseja depositar em 1.conta corrente ou 2. conta poupança?");
                    c = s.nextInt();
                }
            }
            
               

                if (c == 1) {
                    System.out.println("Depositar em conta corrente");
                    int i = 0;

                while(i < 1 || i > 5){
                    try {
                        System.out.println("Digite o numero do cliente (1 a 5): ");
                        i = s.nextInt(); 
                    } catch (Exception ex) {
                        System.out.println("ERRO: digite uma opção valida");
                        s.nextLine();
                        System.out.println("Digite o numero do cliente (1 a 5): ");
                        i = s.nextInt();
                    }
                }
                    

                 

                    while (valor <= 0) {
                    try {
                        System.out.println("Digite o valor a ser depositado: ");
                        valor = s.nextDouble();
                    } catch (Exception e) {
                        System.out.println("ERRO: digite um valor acima de 0");
                        s.nextLine();
                        System.out.println("Digite o valor a ser depositado: ");
                        valor = s.nextDouble();
                    }

                    }
                     
                    
                    contas[i].depositar(valor);


                    

                } else if (c == 2) {
                    System.out.println("Depositar em conta poupança");
                    int i = 0;
                    
                    while(i < 1 || i > 5){
                        try {
                            System.out.println("Digite o numero do cliente (1 a 5): ");
                            i = s.nextInt(); 
                        } catch (Exception ex) {
                            System.out.println("ERRO: digite uma opção valida");
                            s.nextLine();
                            System.out.println("Digite o numero do cliente (1 a 5): ");
                            i = s.nextInt();
                        }
                    }
                   
                    while (valor <= 0) {
                        try {
                            System.out.println("Digite o valor a ser depositado: ");
                            valor = s.nextDouble();
                        } catch (Exception e) {
                            System.out.println("ERRO: digite um valor acima de 0");
                            s.nextLine();
                            System.out.println("Digite o valor a ser depositado: ");
                            valor = s.nextDouble();
                        }
    
                        }

                    
                    contasP[i].depositar(valor);
                }
                break;

            //op 2  Sacar 

            case 2:
                System.out.println("*** Sacar ***\n");
                
                valor = 0;

                int d = 0;
            while(d != 1 && d != 2){
                try{
                    System.out.println("Deseja Sacar em 1.conta corrente ou 2. conta poupança?");
                    d = s.nextInt();
                } catch(Exception ex){
                   System.out.println("ERRO: digite uma opção valida");
                   s.nextLine();
                   System.out.println("Deseja Sacar em 1.conta corrente ou 2. conta poupança?");
                    d = s.nextInt();
                }
            }
            
               

                if (d == 1) {
                    System.out.println("Sacar em conta corrente");
                    int i = 0;

                while(i < 1 || i > 5){
                    try {
                        System.out.println("Digite o numero do cliente (1 a 5): ");
                        i = s.nextInt(); 
                    } catch (Exception ex) {
                        System.out.println("ERRO: digite uma opção valida");
                        s.nextLine();
                        System.out.println("Digite o numero do cliente (1 a 5): ");
                        i = s.nextInt();
                    }
                }
                    

                 

                    while (valor <= 0) {
                    try {
                        System.out.println("Digite o valor a ser retirado: ");
                        valor = s.nextDouble();
                    } catch (Exception e) {
                        System.out.println("ERRO: digite um valor acima de 0");
                        s.nextLine();
                        System.out.println("Digite o valor a ser retirado: ");
                        valor = s.nextDouble();
                    }

                    }
                     
                    
                    contas[i].sacar(valor);


                    

                } else if (d == 2) {
                    System.out.println("Sacar em conta poupança");
                    int i = 0;
                    
                    while(i < 1 || i > 5){
                        try {
                            System.out.println("Digite o numero do cliente (1 a 5): ");
                            i = s.nextInt(); 
                        } catch (Exception ex) {
                            System.out.println("ERRO: digite uma opção valida");
                            s.nextLine();
                            System.out.println("Digite o numero do cliente (1 a 5): ");
                            i = s.nextInt();
                        }
                    }
                   
                    while (valor <= 0) {
                        try {
                            System.out.println("Digite o valor a ser retirado: ");
                            valor = s.nextDouble();
                        } catch (Exception e) {
                            System.out.println("ERRO: digite um valor acima de 0");
                            s.nextLine();
                            System.out.println("Digite o valor a ser retirado: ");
                            valor = s.nextDouble();
                        }
    
                        }

                    
                    contasP[i].sacar(valor);
                }
                break;

            //op 3 Ver saldo

            case 3:
                System.out.println("*** Ver saldo ***\n");
                ;
                int e = 0;
                while(e != 1 && e != 2){
                    try {
                        System.out.println("Deseja ver o saldo em 1.conta corrente ou 2. conta poupança?");
                        e = s.nextInt();
                    } catch (Exception ex) {
                        System.out.println("ERRO: digite uma opção valida");
                        s.nextLine();
                        System.out.println("Deseja ver o saldo em 1.conta corrente ou 2. conta poupança?");
                        e = s.nextInt();
                    }
                }
                if (e == 1) {
                    System.out.println("Ver saldo em conta corrente");

                    int i = 0;
                    
                    while(i < 1 || i > 5){
                        try {
                            System.out.println("Digite o numero do cliente (1 a 5): ");
                            i = s.nextInt(); 
                        } catch (Exception ex) {
                            System.out.println("ERRO: digite uma opção valida");
                            s.nextLine();
                            System.out.println("Digite o numero do cliente (1 a 5): ");
                            i = s.nextInt();
                        }
                    }

                if (contas[i] == null) {
                    System.out.println("Conta inexistente");
                } else{
                    contas[i].imrpimirExtrato();
                }
                    


                    

                } else if (e == 2) {
                    System.out.println("Ver saldo em conta poupança");

                    int i = 0;
                    
                    while(i < 1 || i > 5){
                        try {
                            System.out.println("Digite o numero do cliente (1 a 5): ");
                            i = s.nextInt(); 
                        } catch (Exception ex) {
                            System.out.println("ERRO: digite uma opção valida");
                            s.nextLine();
                            System.out.println("Digite o numero do cliente (1 a 5): ");
                            i = s.nextInt();
                        }
                    }

                    if (contasP[i] == null) {
                        System.out.println("Conta inexistente");
                    } else{
                        contasP[i].imrpimirExtrato();
                    }
                }
                break;
            case 4:
                System.out.println("Saindo...");
                break;

                default:
                    System.out.println("Opção inválida");
                    break;
        }
    }
        

        
    }
}
