public class ContaPoupanca extends Conta{

    private double saldo = 250000;

    

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public double obterSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }
    
}