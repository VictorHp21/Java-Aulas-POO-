public class Veiculo{
    protected String placa;
    protected int ano;

    public Veiculo (String placa, int ano)
    {
        this.placa = placa;
        this.ano = ano;
    }

    public void SetPlaca(String placa)
    {
        this.placa = placa;
    }

    public void SetAno(int ano)
    {
        this.ano = ano;
    }

    public String GetPlaca()
    {
        return placa;
    }

    public int GetAno()
    {
        return ano;
    }

    public void ExibirDados()
    {
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);

    }
}
