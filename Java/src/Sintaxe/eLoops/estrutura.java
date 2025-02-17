package Sintaxe.eLoops;

import java.util.ArrayList;

public class estrutura {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Sam");
        nomes.add("Melissa");
        nomes.add("Jose");
        nomes.add("leo");


        /* var de interação; condição para o loop parar; manipulação para var de interação
    for(int i = 0;         i < nomes.size();                    i++){} */
    
      for(int i = 0; i <nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        for (String nome: nomes){
            System.out.println(nome);
        }

        int contador = 6;
        while (contador < 10){
            System.out.println("Usando while");
            contador++;
        }

        

    }
}
