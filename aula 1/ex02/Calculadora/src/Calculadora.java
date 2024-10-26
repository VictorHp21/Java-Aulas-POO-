public class Calculadora{
    //atributos
    int numero1;
    int numero2;

    //construtor
    Calculadora(int n1, int n2)
    {
        numero1 = n1;
        numero2 = n2;
    }

    //metodos
    float media()
    {
        float m;
        m = (numero1 + numero2)/ 2;
        return m;
    }

    int multiplica()
    {
        int m;
        m = numero1 * numero2;
        return m;
    }

}
