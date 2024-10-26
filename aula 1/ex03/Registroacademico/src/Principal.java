import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Registroacademico objVictor = new Registroacademico("Victor", 2105, 2, 27.00);
        Registroacademico objAna = new Registroacademico("Ana", 3498, 4, 50.00);

        System.out.println("A mensalidade do Victor e: " + objVictor.calculamensalidade());
        System.out.println("A mensalidade de Ana e:" + objAna.calculamensalidade());
    }
}
