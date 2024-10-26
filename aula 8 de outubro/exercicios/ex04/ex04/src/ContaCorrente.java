public class ContaCorrente extends Conta implements Tributavel {

    public double saldo = 300000;
    @Override
    public double calculaTributos() { //metodo da interface Tributavel
        double taxa = 0.01; //valor da taxa
        //valor * porcentagem / 100
        double tributos = this.saldo * taxa;
        return tributos;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public double obterSaldo() {
        return this.saldo - this.calculaTributos();
    }
    
}
