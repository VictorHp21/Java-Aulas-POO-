import java.text.DateFormat;
import java.text.SimpleDateFormat;  
import java.util.Date;  

public class Funcionario {
    protected String nome;
    protected Date nascimento;
    protected long cpf;
    protected Endereco endereco;

    public Funcionario(String nome, Date nascimento, long cpf, Endereco endereco){
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

     public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Nascimento: " + nascimento.toString());
         System.out.println("Estado: " + endereco.getCidade().getEstado().getNome());
        System.out.println("Endereço: " + endereco.getRua() + ", " + endereco.getNumero() + ", " + endereco.getBairro() + ", " + endereco.getCep() + ", "+ endereco.getCidade().getNome());
       
    }
}