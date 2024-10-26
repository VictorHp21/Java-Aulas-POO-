public class Circulo extends Figura {

    private double raio;

    public Circulo(double raio, String cor) {
        super(cor);
        this.raio = raio;
    }
        

    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String getCor() {
       return cor;
    }


    

}
