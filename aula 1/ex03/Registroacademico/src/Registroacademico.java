public class Registroacademico{

    //atributos com ENCAPSULAMENTO
    private String nomeAluno; //nome do aluno
    private int numeroMatricula;  //n da matricula
    private int codigoCurso; //codigo do curso
    private double percentualcobranca; //percentual em relação ao preço cheio, de 0 a 100%

    //construtor
    Registroacademico(String n, int m, int c, double p)
    {
        nomeAluno = n;
        numeroMatricula = m;
        codigoCurso = c;
        percentualcobranca = p;
    }

    //metodo
    public double calculamensalidade()
    {
        double mensalidade = 0;
        //determinação do valor cheio da mensalidade, dependendo do curso

        if (codigoCurso == 1)//redes
            mensalidade = 450.00;
        if (codigoCurso == 2) //ciencia da computação
            mensalidade = 500.00;
        if (codigoCurso == 3) //engenharia
            mensalidade = 550.00;
        if (codigoCurso == 4) //quimica
            mensalidade = 327.00;

        //calculado o desconto. se o percentual for 0, a mensalidade também sera.
        if (percentualcobranca == 1)
            mensalidade = 450.00;
        else mensalidade = mensalidade * 100 / percentualcobranca;

        return mensalidade;
    }
}
