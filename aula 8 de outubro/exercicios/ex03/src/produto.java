public class produto implements Iproduto {
    private String nome;
    private float valor;

    public produto(String nome, float custo){
        this.nome = nome;
        this.valor = custo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public float getCusto() {
        return valor;
    }
}
