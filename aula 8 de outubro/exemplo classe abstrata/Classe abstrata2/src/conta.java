abstract class conta{
    private double saldo;

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public abstract void imrpimirExtrato(); //metodo abstrato

}