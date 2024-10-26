public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private int cep;
    private Cidade cidade;

    public Endereco(String rua, String bairro, int numero, int cep, Cidade cidade) {
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.cep = cep;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro()
    {
        return bairro;
    }

    public int getCep()
    {
        return cep;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}