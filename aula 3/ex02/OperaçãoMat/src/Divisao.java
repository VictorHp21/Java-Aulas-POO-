public class Divisao extends OperacaoMat {
    //construtor

    public Divisao (double valor1, double valor2)
    {
        super(valor1, valor2);
    }

    //metodo

    public double div()
    {
        double div = valor1 / valor2;
        return div;
    }
}
