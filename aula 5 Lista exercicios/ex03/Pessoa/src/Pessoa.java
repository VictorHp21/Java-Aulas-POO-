public class Pessoa {
    protected String nome;
    protected int cpf;
    protected static int contador;

    public Pessoa (String nome, int cpf,  int contador)
    {
        this.nome = nome;
        this.cpf = cpf;
        Pessoa.contador = contador;
    }

    public int getcpf(){
        return cpf;
    }

    public String getNome()
    {
        return nome;
    }

    public void Imprimir()
    {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        //System.out.println("Nome: " + nome);

    }


}