public class Aluno {

   private String nome;
   private float nota1;
   private float nota2;
   private float nota3;
   private float media;

    //construtor
    public Aluno(String n, float n1, float n2, float n3)
    {
        nome = n;
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
        media = 0;
    }

    //metodos

    private float Somar()
    {
        float soma = nota1 + nota2 + nota3;
        return soma;
    }

    private float Calculamedia()
    {
        media = Somar() / 3;
        return media;
    }

    public String Resultadofinal()
    {
        String resultado = "";
        float media = Calculamedia();
        if (media >= 6)
            resultado = "Aprovado!";
        else if ((media >=4) && (media <6))
            resultado = "Recuperação!!";
            else resultado = "Reprovado!!!";
        return resultado;
    }

    public String retornome()
    {
        return nome;
    }

}
