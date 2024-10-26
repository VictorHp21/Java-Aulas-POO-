import java.util.List;

public class Colaborador extends PessoaFisica {
    protected String ctps;
    protected String pis;
    protected String tituloeleitor;
    protected boolean reservita;
    protected String estadoCivil;
    protected int numDependentes;
    protected boolean ativo;
    protected String setor;
    protected String cargo;
    protected float salario;
    protected String telefone1;
    protected String telefone2;
    protected String emailPessoal;
    protected String emailCorporativo;


    protected List<Colaborador> equipeColaborador;


    public Colaborador (int Id, String nome, String nomefantasia, String logradouro, int numero, String complemento, String bairro, String cep, String cidade, String uf, String cpf, String rg, String genero, String nascimento, String ctps, String pis, String tituloeleitor, boolean reservita,
     String estadoCivil, int numDependentes, boolean ativo, String setor, String cargo, float salario, String telefone1, String telefone2, String emailPessoal, String emailCorporativo)
     {
        super(Id, nome, nomefantasia, logradouro, numero, complemento, bairro, cep, cidade, uf, cpf, cargo, genero, nascimento);
        this.ctps = ctps;
        this.pis = pis;
        this.tituloeleitor = tituloeleitor;
        this.reservita = reservita;
        this.estadoCivil = estadoCivil;
        this.numDependentes = numDependentes;
        this.ativo = ativo;
        this.setor = setor;
        this.cargo = cargo;
        this.salario = salario;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.emailPessoal = emailPessoal;
        this.emailPessoal = emailPessoal;
     }

     public String getNome()
     {
      return nome;
     }

     public Object[] getdados()
     {
         return new Object[] {ctps,
              pis,
              tituloeleitor,
              reservita,
              estadoCivil,
              numDependentes,
              ativo,
              setor,
              cargo,
              salario,
              telefone1,
              telefone2,
              emailPessoal,
              emailCorporativo};
     }

   /*
   public void SetDados(Object[] dados)
     {
         this.Id = (int) dados[0];
         this.nome = (String) dados[1];
         this.nomefantasia = (String) dados[2];
         this.logradouro = (String) dados[3];
         this.numero = (int) dados[4];
         this.complemento = (String) dados[5];
         this.bairro = (String) dados[6];
         this.cep = (String) dados[7];
         this.cidade = (String) dados[8];
         this.uf = (String) dados[9];
     } */  

     public void Admitir(Colaborador colaborador)
     {
         equipeColaborador.add(colaborador);
     }

     public void Demitir(List <Colaborador> equipeColaborador, String nome)
     {
      for (Colaborador colaborador: equipeColaborador )
      {
         if(colaborador.getNome().equals(nome))
         {
            colaborador.remove(colaborador);
         }
      }
     }

   private void remove(Colaborador colaborador) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'remove'");
   }

}
