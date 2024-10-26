public class Alunos{
    //atributos
    private String nome;
    private double nota1;
    private double nota2;

    private Alunos[]vetorAlunos;
    private int totalAlunos = 0;
    private String resultado;

    //construtor

    public Alunos(int tamanho)
    {
        vetorAlunos = new Alunos[tamanho]; //alocar memoria para o vetor 
        totalAlunos = 0;
    }

    public Alunos(String n, double n1, double n2)
    {
        nome = n;
        nota1 = n1;
        nota2 = n2;
       
    }

    

    //metodos

    public void inserirNotas(String n, double n1, double n2)
    {
        if (totalAlunos < vetorAlunos.length) {
            vetorAlunos[totalAlunos] = new Alunos(n, n1, n2);
            totalAlunos++;
        } else {
            System.out.println("Não é possível adicionar mais alunos. O vetor está cheio.");
        }
    }

    public String retornaNome()
    {
        return nome;
    }

    public double retornaNota1()
    {
        return nota1;
    }

    public double retornaNota2()
    {
        return nota2;
    }




    public double calcularMedia()
    {
       
        double notas = 0;

        for(int h = 0; h < totalAlunos; h++)
        {
           notas += vetorAlunos[h].retornaNota1();
           notas += vetorAlunos[h].retornaNota2();
        }
        double media = notas / (totalAlunos * 2);

        return media;

    }

    public double media2(double valor)
    {
        double notas = 0;
        int notasAcima = 0;

        for(int h = 0; h < totalAlunos; h++)
        {
          if(vetorAlunos[h].retornaNota1() > valor)
          {
            notas += vetorAlunos[h].retornaNota1();
            notasAcima++;
          }
           if(vetorAlunos[h].retornaNota2() > valor)
          {
            notas += vetorAlunos[h].retornaNota1();
            notasAcima++;
          }
        }
        double media2 = notas / notasAcima;
        return media2;

    }

    public String resultado()
    {
       //tem que consertar esse metodo
        int notas = 0;

        for(int h = 0; h < totalAlunos; h++)
        {
           notas += vetorAlunos[h].retornaNota1();
           notas += vetorAlunos[h].retornaNota2();

           double media = notas / 2;

            if(media < 4)
            {
                String resultado = "Reprovado";
            }
            else {
                String resultado = "Aprovado";
            }
            
            System.out.println("O Aluno: " + vetorAlunos[h].retornaNome());
            System.out.println("Está: " + vetorAlunos[h].resultado());

        }
        return resultado;
    }

}
