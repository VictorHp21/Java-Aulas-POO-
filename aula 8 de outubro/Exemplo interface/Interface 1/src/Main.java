public class Main {
    public static void main(String[] args) throws Exception {
       ContaCorrente cc = new ContaCorrente();

       cc.depositar(1200.20);
       cc.sacar(300);

       System.out.println("Saldo atual conta corrente: " + cc.getSaldo());

       ContaPoupanca cp = new ContaPoupanca();
       cp.depositar(550.20);
       cp.sacar(25);

       System.out.println("Saldo atual conta poupança: " + cp.getSaldo());
    }
}
