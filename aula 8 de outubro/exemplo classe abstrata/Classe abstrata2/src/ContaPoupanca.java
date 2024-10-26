public class ContaPoupanca extends conta{
    public ContaPoupanca(double saldo){
        this.setSaldo(saldo);
    }

    @Override
    public void imrpimirExtrato() {
      System.out.println("### Extrato da conta ###");

      System.out.println("Saldo:" + this.getSaldo());
    }
    
}