public class PessoaFisica extends Pessoa{
    protected String cpf;
    protected String rg;
    protected String genero;
    protected String nascimento;

    public PessoaFisica (int Id, String nome, String nomefantasia, String logradouro, int numero, String complemento, String bairro, String cep, String cidade, String uf, String cpf, String rg, String genero, String nascimento)
    {
        super(Id, nome, nomefantasia, logradouro, numero, complemento, bairro, cep, cidade, uf);
        this.cpf = cpf;
        this.genero = genero;
        this.nascimento = nascimento;
    }

    public String getCpf()
    {
        return cpf;
    }

    public String getRg()
    {
        return rg;
    }

    public String getNascimento()
    {
        return nascimento;
    }

    public void SetCpf(String cpf)
    {
        this.cpf = cpf;
    }

    public void Setgenero(String genero)
    {
        this.genero = genero;
    }

    public void SetNascimento(String nascimento)
    {
        this.nascimento = nascimento;
    }





}
