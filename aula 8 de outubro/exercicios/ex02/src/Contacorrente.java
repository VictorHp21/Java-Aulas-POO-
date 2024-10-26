public class Contacorrente implements Conta {
    private double saldo;
    private double taxaOperacao = 0.45;

    @Override
    public void depositar(double valor) {
      this.saldo += valor - taxaOperacao;
    }

    @Override
    public void sacar(double valor) {
     this.saldo -= valor;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    public void imrpimirExtrato() {
      System.out.println("Saldo: " + this.getSaldo());
  }
}
