public class Professor extends Pessoa {
    protected double salario;
    
    public Professor (String nome, int cpf, int contador, double salario)
    {
       super(nome, cpf, contador);
       this.salario = salario;
    }
   
    public double getSalario()
    {
       return salario;
    }
   
    public void DadosProf()
    {
       
       super.Imprimir();
       System.out.println("Salario professor: " + salario);
   
    }
   }