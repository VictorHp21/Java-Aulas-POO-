public class Principal {
    public static void main(String[] args) {
        //instanciar objetos
        PessoaFisica objFisica = new PessoaFisica("Ana Santos", 0142536562);
        PessoaJuridica objJuridica = new PessoaJuridica("Robson", 456789123);

        System.out.println("***** " + objFisica.getNome());
        System.out.println("***** " + objJuridica.getNome());
    }
}
