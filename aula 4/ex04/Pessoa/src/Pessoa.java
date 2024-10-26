public class Pessoa
{
    protected int Id;
    protected String nome;
    protected String nomefantasia;
    protected String logradouro;
    protected int numero;
    protected String complemento;
    protected String bairro;
    protected String cep;
    protected String cidade;
    protected String uf;

    public Pessoa (int Id, String nome, String nomefantasia, String logradouro, int numero, String complemento, String bairro, String cep, String cidade, String uf)
    {
        this.Id = Id;
        this.nome = nome;
        this.nomefantasia = nomefantasia;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }

    public Object[] getdados()
    {
        return new Object[] {Id, nome, nomefantasia, logradouro, numero, complemento, bairro, cep, cidade, uf};
    }

    public void SetDados(Object[] dados)
    {
        this.Id = (int) dados[0];
        this.nome = (String) dados[1];
        this.nomefantasia = (String) dados[2];
        this.logradouro = (String) dados[3];
        this.numero = (int) dados[4];
        this.complemento = (String) dados[5];
        this.bairro = (String) dados[6];
        this.cep = (String) dados[7];
        this.cidade = (String) dados[8];
        this.uf = (String) dados[9];
    }
}