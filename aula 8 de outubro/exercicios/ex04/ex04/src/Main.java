import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Conta contaC = new ContaCorrente();
        Conta contaP = new ContaPoupanca();
        SeguroDeVida seguro = new SeguroDeVida();

        Scanner input = new Scanner(System.in);

        System.out.println("--- Bem vindo! --- \n\n");

        int opcao = 0;
        String valorString = "";
        double valorDouble = 0;
        boolean tentativa = false;

        while(opcao != 4) {
            System.out.println("*** MENU *** \n");
            System.out.println("1-Acessar conta corrente\n");
            System.out.println("2-Acessar conta poupança\n");
            System.out.println("3-Seguro de vida\n");
            System.out.println("4-Sair\n");

            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("\nAcessando conta corrente\n");
                    System.out.println("Qual operação deseja realizar?\n1-Sacar\n2-Depositar\n3-Obter saldo " );
                    int opcao2 = input.nextInt();
                        if(opcao2 == 1)
                        {
                            while(tentativa == false)
                            {
                                try {
                                    System.out.println("Qual valor deseja sacar? ");
                                    valorString = input.next();
    
                                    if(!valorString.matches("-?\\d+(\\.\\d+)?")) //se não for um número
                                    {
                                        throw new Exception("Custo invalido");
                                    } else {
                                        valorDouble = Double.parseDouble(valorString); 
                                            if(valorDouble > contaC.obterSaldo()){
                                                throw new Exception("Valor acima do saldo");


                                            }  else if (valorDouble < 0) {
                                                throw new Exception("Custo invalido");
                                            }
                                             else  {
                                                contaC.sacar(valorDouble);
                                                tentativa = true; 
                                                
                                            }
                                                                        
                                    }
    
                                } catch (Exception e) {
                                    System.out.println("Erro: " + e);
                                     tentativa = false;
                                }  
                            }
                            
                        } else if (opcao2 == 2)
                            {
                            tentativa = false;
                                while(tentativa == false)
                                {
                                    try {
                                        System.out.println("Qual valor deseja depositar? ");
                                    valorString = input.next();

                                    if(!valorString.matches("-?\\d+(\\.\\d+)?")) //se não for um número
                                    {
                                        throw new Exception("Custo invalido");
                                    } else {
                                        valorDouble = Double.parseDouble(valorString);
                                        contaC.depositar(valorDouble);
                                        tentativa = true;

                                    }
                                    
                                    } catch (Exception e) {
                                        System.out.println("Erro" + e);
                                    }
                                }
                            } else if(opcao2 == 3)
                            {
                                System.out.println("O saldo da conta corrente é: " + contaC.obterSaldo());
                            }
                break;
                case 2:
                System.out.println("\nAcessando conta Poupança\n");
                System.out.println("Qual operação deseja realizar?\n1-Sacar\n2-Depositar\n3-Obter saldo " );
                int opcao3 = input.nextInt();
                if(opcao3 == 1)
                {
                    tentativa = false;
                    while(tentativa == false)
                    {
                        try {
                            System.out.println("Qual valor deseja sacar? ");
                            valorString = input.next();

                            if(!valorString.matches("-?\\d+(\\.\\d+)?")) //se não for um número
                            {
                                throw new Exception("Custo invalido");
                            } else {
                                valorDouble = Double.parseDouble(valorString); 
                                    if(valorDouble > contaC.obterSaldo()){
                                        throw new Exception("Valor acima do saldo");
                                    } else {
                                        contaP.sacar(valorDouble);
                                        tentativa = true; 
                                        
                                    } 
                                                                
                            }

                        } catch (Exception e) {
                            System.out.println("Erro: " + e);
                             tentativa = false;
                        }  
                    }
                    
                } else if (opcao3 == 2)
                    {
                    tentativa = false;
                        while(tentativa == false)
                        {
                            try {
                                System.out.println("Qual valor deseja depositar? ");
                            valorString = input.next();

                            if(!valorString.matches("-?\\d+(\\.\\d+)?")) //se não for um número
                            {
                                throw new Exception("Custo invalido");
                            } else {
                                valorDouble = Double.parseDouble(valorString);
                                contaP.depositar(valorDouble);
                                tentativa = true;

                            }
                            
                            } catch (Exception e) {
                                System.out.println("Erro" + e);
                            }
                        }
                    } else if(opcao3 == 3)
                    {
                        System.out.println("O saldo da conta poupança é: " + contaP.obterSaldo());
                    }
        break;
               case 3:
                System.out.println("Acessando seguro de vida...");
                System.out.println("Qual operação deseja realizar?\n1-Pagar Seguro\n2-Consultar Saldo\n" );

                int opcao4 = input.nextInt();
                if(opcao4 == 1)
                {
                tentativa = false;
                    while(tentativa == false) {
                        try {
                            System.out.println("Qual valor deseja pagar?");
                            valorString = input.next();
                           
                             if(!valorString.matches("-?\\d+(\\.\\d+)?")) //se não for um número
                            {
                                throw new Exception("Custo invalido");
                            } else {
                                valorDouble = Double.parseDouble(valorString);
                                 if(seguro.valorPago(valorDouble) == false){
                                    throw new Exception("Valor maior ou menor que o valor de pagamento (R$ 300,00)");
                                 } else {
                                    tentativa = true;
                                 }
                            }
                        } catch (Exception e) {
                            System.out.println("Erro: " + e);
                             tentativa = false;
                        }
                                                }

                } else if (opcao4 == 2)
                    {
                        System.out.println("O saldo a receber do seguro é: " + seguro.obterSaldo());
                    }
                   

                break;

                case 4:
                    System.out.println("Saindo do sistema...");
                    opcao = 4;
                    break;
                default:
                System.out.println("Opção invalida");
                break;
        }

       
       

    }
 }
}
