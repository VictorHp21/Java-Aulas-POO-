public class Livros{
    private String titulo;
    private int qtdpaginas;
    private int pagsLidas;

    public Livros (String t, int qtd, int pgs)
    {
        titulo = t;
        qtdpaginas = qtd;
        pagsLidas = pgs;
    }

    //metodos GET, retornam um atributo privado.

    public String retornaTitulo()
    {
        return titulo;
    }

    public int retornaQtdpaginas()
    {
        return qtdpaginas;
    }

    public int retornaPaginaslidas()
    {
        return pagsLidas;
    }

    //metodos set, alteram o valor de um atributo privado

    public String AlterarTitulo(String t)
    {
        titulo = t;
        return titulo;
    }

    public void Alterarqtdpaginas(int qtd)
    {
        qtdpaginas = qtd;
        return;
    }

    public void Alterarpaginaslidas(int pgs)
    {
        pagsLidas = pgs;
        return;
    }

    //metodo verificar progresso

    public double VerificarProgresso()
    {
        double porcentagem = 0;
        porcentagem = (pagsLidas * 100) / qtdpaginas;
        return porcentagem;
    }

    public double VerificarProgresso(int pgs, int qtd)
    {
        double porcentagem = 0;
        porcentagem = (pgs * 100) / qtd;
        return porcentagem;
    }

}
