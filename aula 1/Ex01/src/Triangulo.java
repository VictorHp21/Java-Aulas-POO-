public class Triangulo {
   //atributos
    float lado1;
    float lado2;
    float lado3;

    //construtor
    Triangulo (float primeiro, float segundo, float terceiro)
    {
        lado1 = primeiro;
        lado2 = segundo;
        lado3 = terceiro;
    }

    //metodos
    boolean verificaequila() 
    {
        boolean result;
        if ((lado1 == lado2) && (lado2 == lado3))
            result = true;
        else 
            result = false;
        return result;
    }

    float calculaperimetro()
    {
        float result = lado1 + lado2 + lado3;
        return result;
    }

}
