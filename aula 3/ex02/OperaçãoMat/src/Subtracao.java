public class Subtracao extends OperacaoMat {
    
    //construtor

    public Subtracao (double valor1, double valor2)
    {
        super(valor1, valor2);
        
    }

    //metodo
    public double subtracao()
    {
        double subtracao = valor1 - valor2;
        return subtracao;
    }
}
