import java.time.LocalDate;

public class Pessoa extends Universidade {
    private String nome;
    private  int idade;
    private int dia;
    private int mes;
    private  int ano;

    public Pessoa (String nomeUniversidade, String nome, int idade, int dia, int mes, int ano)
    {
        super(nomeUniversidade);
        this.nome = nome;
        this.idade = idade;
        this.dia =  dia;
        this.mes = mes;
        this.ano = ano;
    }

    public  int calcularIdade()
    {
         int anoAtual = LocalDate.now().getYear(); // Obtém o ano atual dinamicamente
         idade = anoAtual - ano;
        return idade;
        
    }

    public String getNome()
    {
        return nome;
    }

    public String retornaUniversidade()
    {
        return retornaNome();
    }

    public void exibirdados()
    {
        System.out.println("Nome: " + nome);
        System.out.println("idade " + calcularIdade() + "anos");
        System.out.println("Dia do nascimento: " + dia);
        System.out.println("mes do nascimento: " + mes);
        System.out.println("ano do nascimento: " + ano);
        System.out.println("Universidade em que trabalha: " + retornaUniversidade());


    }
}
