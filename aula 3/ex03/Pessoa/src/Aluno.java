public class Aluno extends Pessoa {
    protected String Curso;
    private Aluno[]vetorAlunos;
    private int totalAlunos = 0;

    
    

    public Aluno (String nome, int idade, String Curso)
    {
        super(nome, idade);
        this.Curso = Curso;
    }

    public Aluno (int tamanho)
    {
        vetorAlunos = new Aluno[tamanho]; //alocar memoria para o vetor 
        totalAlunos = 0;
    }


    public void adicionarAluno(Aluno aluno) {
        if (totalAlunos < vetorAlunos.length) {
            vetorAlunos[totalAlunos] = aluno;
            totalAlunos++;
        } else {
            System.out.println("Não há mais espaço para adicionar novos alunos.");
        }
    }



    public void DefinirCurso(String Curso)
    {
        this.Curso = Curso;
    }

    public String retornaCurso()
    {
        return Curso;
    }

    public void retornaAlunos()
    {
        for(int h = 0; h < totalAlunos; h++)
        {
           System.out.println("Aluno " + (h + 1) + ": ");
           System.out.println("Nome  " + vetorAlunos[h].retornaNome());
           System.out.println("idade: "  + vetorAlunos[h].retornaIdade());
           System.out.println("Curso : "  + vetorAlunos[h].retornaCurso());
           System.out.println(); // Linha em branco para separar alunos
        }
    }

}
