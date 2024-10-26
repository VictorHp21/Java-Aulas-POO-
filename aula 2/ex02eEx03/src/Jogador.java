public class Jogador {
   private String nome;
    private int idade;
    private float altura;

    public Jogador (String n, int i, float alt)
    {
        nome = n;
        idade = i;
        altura = alt;
    }
    public String retornaNome()
    {
        return nome;
    }

    public float retornaAltura()
    {
        return altura;
    }

    public int retornaIdade()
    {
        return idade;
    }

}
    


