public class Multiplicacao extends OperacaoMat {
    //construtor
    public Multiplicacao (double valor1, double valor2)
    {
        super(valor1, valor2);
    }

    //metodo

    public double mult()
    {
        double mult = valor1 * valor2;
        return mult;
    }

}
