import java.util.Date;

public class Vendedor extends Funcionario {
   private float salario;

    public Vendedor (String nome, Date nascimento, long cpf, Endereco endereco, float salario ) {
        super(nome, nascimento, cpf, endereco);
        this.salario = salario;
        
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Salario: " + salario);
    }
}