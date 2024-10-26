public class Pessoa{
    protected String nome;
    protected int idade;

    //construturo

    public Pessoa (String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }

       // Construtor sem parâmetros
       public Pessoa() {
        // Inicialize com valores padrão, se necessário
    }


    //metodos

    public void definirNome(String nome){
        this.nome = nome;
    }

    public void definirIdade(int idade){
        this.idade = idade;
    }




    public String retornaNome()
    {
        return nome;
    }

    public int retornaIdade()
    {
        return idade;
    }


}

