public class PessoaJuridica extends Pessoa{
    protected String cnpj;
    protected String inscricaoEstadual;
    protected int fundacao;

    public PessoaJuridica (int Id, String nome, String nomefantasia, String logradouro, int numero, String complemento, String bairro, String cep, String cidade, String uf, String cnpj, String inscricaoEstadual, int fundacao)
    {
        super(Id, nome, nomefantasia, logradouro, numero, complemento, bairro, cep, cidade, uf);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.fundacao = fundacao;
    }

    public String getCnpj()
    {
        return cnpj;
    }

    public String getinscricao()
    {
        return inscricaoEstadual;
    }

    public int getFundacao()
    {
        return fundacao;
    }
}