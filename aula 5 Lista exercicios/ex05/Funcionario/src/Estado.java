import java.util.ArrayList;
import java.util.List;

public class Estado {
    private String nomeEstado;
    private String sigla;
   

    public Estado(String nomeEstado, String sigla) {
        this.nomeEstado = nomeEstado;
        this.sigla = sigla;
   
    }

    public String getNome() {
        return nomeEstado;
    }

    public void setNome(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

     public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    
}