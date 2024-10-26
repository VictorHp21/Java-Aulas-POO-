public class Contapoupança implements Conta {
    private double saldo;

    @Override
    public void depositar(double valor) {
       this.saldo += valor;
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
