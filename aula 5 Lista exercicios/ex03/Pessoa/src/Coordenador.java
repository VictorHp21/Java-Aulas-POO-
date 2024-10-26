public class Coordenador extends Professor {
    protected String Curso;

    public Coordenador (String nome, int cpf, int contador, double salario, String curso)
    {
        super(nome, cpf, contador, salario);
        this.Curso = curso;
    }

    public double getSalarioCoolaborador()
    {
        System.out.println("/// Coordenador: ");
        super.getSalario();
        return salario;
    }

     public void DadosCoordenador()
 {
    super.Imprimir();

    System.out.println("Curso coordenador: " + Curso);
    System.out.println("Salario coordenador: " + salario);


 }
}