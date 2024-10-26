import java.util.Scanner;

public class principal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //declarar e instanciar o objeto
        Timevolei objetotime1 = new Timevolei();

        //inserir jogadores

        objetotime1.inserejogador("Anderson", 34, (float) 1.98);
        objetotime1.inserejogador("Flavio", 20, (float) 2.08);
        objetotime1.inserejogador("Robson", 20, (float) 1.99);
        objetotime1.inserejogador("Roberto", 31, (float) 1.91);
        objetotime1.inserejogador("Andre", 36, (float) 1.97);
        objetotime1.inserejogador("Leandro", 33, (float) 2.03);

        System.out.println("O Jogador de menor altura é: " + objetotime1.jogadormenoraltura());
        
        System.out.println("O maior jogador é: " + objetotime1.jogadormaisalto());

        //1 metodo ex3

        System.out.println("A media de idade dos jogadores é: " + objetotime1.mediaIdade());

        int idade = 0;
        float altura = 0;

        System.out.println("A partir de que idade deseja saber a altura: ");
        idade = scan.nextInt();
        System.out.println("O maior jogador acima dessa idade é: " + objetotime1.jogadorAlturaIdade(idade));

        System.out.println("Digite a idade para saber quantos jogadores sao dessa faxetaria: ");
        idade = scan.nextInt();
        System.out.println("No time há " + objetotime1.jogadorescertaidade(idade));

        System.out.println("Digite a altura: ");
        altura = scan.nextFloat();
        System.out.format("O numero de jogadores maiores que: %.2f são: %d", altura, objetotime1.jogadoresalturausuario(altura));




    }
}
