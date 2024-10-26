public class SeguroDeVida implements Tributavel {

    private double saldo = 40000;
    private double valorMensal = 300;

    public boolean valorPago(double valor) {

        if (this.valorMensal == valor) {  
            return true;
        } else {
            return false;
        }
    }

    //pagar valor mensal
    //indenização

    @Override
    public double calculaTributos() {
        return 42; }

    public double obterSaldo() {
        return this.saldo - this.calculaTributos();
    }
    
}
