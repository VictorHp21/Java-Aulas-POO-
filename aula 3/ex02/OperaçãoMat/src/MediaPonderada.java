public class MediaPonderada extends Media {
    //atributos
    private double peso1;
    private double peso2;
    //construtor

    public MediaPonderada (double valor1, double valor2, double peso1, double peso2)
    {
        super(valor1, valor2);
        this.peso1 = peso1;
        this.peso2 = peso2;
    }

    //metodo

    public double mediap()
    {
        double mediap = ((valor1 * peso1) + (valor2 * peso2)) / (valor1 + valor2);
        return mediap;
    }
}
