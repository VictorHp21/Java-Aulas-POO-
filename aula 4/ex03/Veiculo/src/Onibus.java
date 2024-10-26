public class Onibus extends Veiculo {
    private int Assentos;

    public Onibus (String placa, int ano, int Assentos)
    {
        super(placa, ano);
        this.Assentos = Assentos;
    }

    public void SetAssentos(int Assentos)
    {
        this.Assentos = Assentos;
    }

    public int GetAssentos()
    {
        return Assentos;
    }

    public void ExibirDados()
    {
        super.ExibirDados();
        System.out.println("Assentos: " + Assentos);
    }
}
