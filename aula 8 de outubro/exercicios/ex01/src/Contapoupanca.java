public class Contapoupanca extends Conta{

    @Override
    public void imrpimirExtrato() {
        
        System.out.println("Saldo: " + this.getSaldo());
    }

    @Override
    public void total() {
      System.out.println("Total + " + this.getSaldo());
    }
    
}
