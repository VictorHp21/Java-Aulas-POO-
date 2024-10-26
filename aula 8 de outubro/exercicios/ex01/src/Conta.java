abstract class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void SetSaldo(double valor)
    {
        this.saldo += valor;
    }

    public abstract void imrpimirExtrato();

    public abstract void total();
}
