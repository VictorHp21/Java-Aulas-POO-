public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao (String placa, int ano, int eixos)
    {
        super(placa, ano);
        this.eixos = eixos;
    }

    public void SetEixos(int eixos)
    {
        this.eixos = eixos;
    }

    public int getEixos(){
        return eixos;
    }

    public void ExibirDados()
    {
        super.ExibirDados();
        System.out.println("Eixos: " + eixos);
    }
}
