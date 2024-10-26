public class Contador{
    public int valor;

    public Contador (int valor)
    {
        this.valor = valor;
    }

    public  void zerarValor()
    {
        valor = valor - valor;

       
    }

    public void incrementar(int valorAincrementar)
    {
        valor = valor + valorAincrementar;

        
    }

    public int RetornaValor()
    {
        return valor;
    }
}