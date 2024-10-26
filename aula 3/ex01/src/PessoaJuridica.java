public class PessoaJuridica extends Pessoa {
    //atributos
    private long cnpj;

    //construtor
    public PessoaJuridica (String nome, long cnpj)
    {
        super(nome); //chamando construtor classe pai
        this.cnpj = cnpj;
    }

    //metodos

    public String getNome()
    {
        return "Pessoa Juridica: " + super.getNome() + " -CNPJ: " + cnpj;
    }
}
