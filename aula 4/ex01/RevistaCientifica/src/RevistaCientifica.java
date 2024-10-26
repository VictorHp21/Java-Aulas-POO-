import java.util.ArrayList;

public class RevistaCientifica {
    private int numero;
    private String Titulo;
    private ArrayList<Edicao> Array_Edicao = new ArrayList<Edicao>(); //cria um arraylist de objetos Edicao

    public RevistaCientifica (int numero, String Titulo)
    {
        this.numero = numero;
        this.Titulo = Titulo;
    }

    public void InserirEdicao (Edicao objEdicao)
    {
        Array_Edicao.add(objEdicao);
    }

    public ArrayList<Edicao> getArray_Edicao()
    {
        return Array_Edicao;
    }

}
