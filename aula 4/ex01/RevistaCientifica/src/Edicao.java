import java.util.ArrayList;

public class Edicao {
    private int numero;

    private ArrayList <Artigo> Array_Artigo = new ArrayList<Artigo>(); //cria um arraylist de objetos Artigo.

    public Edicao (int numero)
    {
        this.numero = numero;
    }

    public void inserirArtigo (String Titulo)
    {
        Artigo objArtigo = new Artigo(Titulo);
        Array_Artigo.add(objArtigo);
    }

    public ArrayList<Artigo> getArray_Artigo()
    {
        return Array_Artigo;
    }

    public int getNumero()
    {
        return numero;
    }

}
