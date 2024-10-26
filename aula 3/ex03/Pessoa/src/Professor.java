public class Professor extends Pessoa {
    protected String formacao;
    private Professor[]vetorProfessor;
    private int totalProfessor = 0;

    public Professor (String nome, int idade, String formacao)
    {
      super(nome, idade);
      this.formacao = formacao;
    }

    public Professor (int tamanho2)
    {
        vetorProfessor = new Professor[tamanho2]; //alocar memoria para o vetor 
        totalProfessor = 0;
        
    }

    public void definirFormacao(String formacao)
    {
        this.formacao = formacao;
    }

    public String retornaFormacao()
    {
        return formacao;
    }
    
}
