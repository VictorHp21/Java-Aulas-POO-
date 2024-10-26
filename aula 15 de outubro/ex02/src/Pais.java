class Pais {
    private String nomePais;
    private double dimensaoPais;
    private int populacaoPais;

    public Pais(String nomePais, double dimensaoPais, int populacaoPais) {
        this.nomePais = nomePais;
        this.dimensaoPais = dimensaoPais;
        this.populacaoPais = populacaoPais;
    }

    public String getNomePais() {
        return nomePais;
    }

    public double getDimensaoPais() {
        return dimensaoPais;
    }

    public int getPopulacaoPais() {
        return populacaoPais;
    }
}