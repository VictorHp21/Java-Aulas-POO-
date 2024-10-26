public class retangulo{
    //atributos
   private double lado1;
   private double lado2;
   private double area;
   private double perimetro;

    //construtor
    retangulo (double ld1, double ld2)
    {
        lado1 = ld1;
        lado2 = ld2;
        //area = ar;
        //perimetro = per;
    }

    //metdos

    public double calcularArea()
    {
        double area;
        area = (lado1 * lado2);
        return area;
    }

    public double calcularPerimetro()
    {
        double perimetro;
        perimetro = (2 * lado1 + 2 * lado2);
        return perimetro;
    }



}