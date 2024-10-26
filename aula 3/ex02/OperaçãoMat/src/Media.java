public class Media extends OperacaoMat {
    //construtor

    public Media (double valor1, double valor2)
    {
        super(valor1, valor2);
    }

    //metodo

    public double med()
    {
        double med = (valor1 + valor2) / 2;
        return med;
    }
}
