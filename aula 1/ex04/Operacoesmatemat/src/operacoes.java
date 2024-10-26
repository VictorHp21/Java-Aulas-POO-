public class operacoes{
    
    //atributos
    int numero1;
    int numero2;
    int numero3;

    //construtor
    operacoes (int n1, int n2, int n3)
    {
        numero1 = n1;
        numero2 = n2;
        numero3 = n3;
    }

    //metodos

    int somar()
    {
        int soma;
        soma = (numero1 + numero2) + numero3;
        return soma;
    }

    float media()
    {
        int m;
        m = (numero1 + numero2 + numero3) / 3;
        return m;
    }

    int subtrair()
    {
        int sub;
        sub = numero1 - numero2 - numero3;
        return sub;
    }

    int multiplicar()
    {
        int mult;
        mult = numero1 * numero2 * numero3;
        return mult;
    }

    int maior()
    {
        int maior;

        if((numero1 > numero2) && (numero1 > numero3))
            maior = numero1;
        else if ((numero2 > numero1) && (numero2 > numero3))
            maior = numero2;
        else maior = numero3;
        return maior;

    }





}
