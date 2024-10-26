import java.util.ArrayList;
import java.util.List;

public class Continente{
    protected String nomeContinente;
    protected List<Pais> paises;
    protected int populacaoTotalContinente;

    public Continente(String nomeContinente) {
        this.nomeContinente = nomeContinente;
         this.paises = new ArrayList<>(); // Inicializa a lista
    }

    public String getNomeContinente() {
        return nomeContinente;    
    }

    public List<Pais> getPaises() {
        return paises;
    }

    public void adcPaises(Pais pais) {
        this.paises.add(pais); 
    }

    public double getDimensaoTotal() {
        double dimensaoTotal = 0;
        for (Pais pais : paises) {
            dimensaoTotal += pais.getDimensaoPais();
        }
        return dimensaoTotal;
    }

   public int getPopulaçãoTotal() {
        int populacaoTotal = 0;
        for (Pais pais : paises) {
            populacaoTotal += pais.getPopulacaoPais();
        }
        this.populacaoTotalContinente = populacaoTotal;
        return populacaoTotal;
        
   }

   public String maiorPopulacao() {
        int maiorPopulacao = 0;
        String paisComMaiorPopulacao = "";
        for (Pais pais : paises) {
            if (pais.getPopulacaoPais() >= maiorPopulacao) {
                maiorPopulacao = pais.getPopulacaoPais();
                paisComMaiorPopulacao = pais.getNomePais();
            }
        }
        return paisComMaiorPopulacao;
            }


    public String menorPopulacao() {
        int menorPopulacao = paises.get(0).getPopulacaoPais();
        String paisComMenorPopulacao = "";
        for (Pais pais : paises) {
            if (pais.getPopulacaoPais() <= menorPopulacao) {
                menorPopulacao = pais.getPopulacaoPais();
                paisComMenorPopulacao = pais.getNomePais();
            }
        }
        return paisComMenorPopulacao;
    }

    public String menorDimensao() {
        double menorDimensao = paises.get(0).getDimensaoPais();
        String paisComMenorDimensao = "";
        for (Pais pais : paises) {
            if (pais.getDimensaoPais() <= menorDimensao) {
                menorDimensao = pais.getDimensaoPais();
                paisComMenorDimensao = pais.getNomePais();
            }
        }
       return paisComMenorDimensao;
    }

    public String maiorDimensao() {
        double maiorDimensao = paises.get(0).getDimensaoPais();
        String paisComMaiorDimensao = "";
        for (Pais pais : paises) {
            if (pais.getDimensaoPais() >= maiorDimensao) {
                maiorDimensao = pais.getDimensaoPais();
                paisComMaiorDimensao = pais.getNomePais();
            }
        }
       return paisComMaiorDimensao;
    }

}