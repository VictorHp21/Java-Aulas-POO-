public class Empregado{
    private String nome;
    private int cpf;
    private float salario;

    

    //construtor

    public Empregado (String n, int cp, float s)
    {
        nome = n;
        cpf = cp;
        salario = s;
    }

    //metodos

    public String retornaNome()
    {
        return nome;
    }

    public long retornaCPF()
    {
        return cpf;
    }

    public float retornaSalario()
    {
        return salario;
    }



}
