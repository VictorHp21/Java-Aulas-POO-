public class PessoaFisica extends Pessoa {

    //atributos

    private long cpf;

    //construtor

    public PessoaFisica (String nome, long cpf)
    {
        super(nome); //chamando o construtor da classe pai
        this.cpf = cpf;
    }

    //metodos

    public String getNome()
    {
        return "Pessoa Fisica: " + super.getNome() + " - CPF: " + cpf;
    }

    
}
