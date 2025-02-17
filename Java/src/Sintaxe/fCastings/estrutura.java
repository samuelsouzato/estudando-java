package Sintaxe.fCastings;

public class estrutura {
    public static void main(String[] args) {
        
        double resultado = 0.0;
        int resultadoInt = (int) resultado; //fazendo um casting "explicito" de "double" para "int"

        int meuInt = 10;
        double meuDouble = meuInt; //fazendo casting "implicito" de "int" para "double"


        //fazendo casting "explicito" de "String" para "int"
        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString); // "Integer" é uma classe que possui o método "parseInt", onde vai parciar de String para Int.

         
        //fazendo casting "explicito" de "Int" para "String"
        String minhaString = String.valueOf(meuInt2);

       

    }
    
}
