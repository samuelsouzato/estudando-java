package Sintaxe.dArrayList;

import java.util.ArrayList;

public class estrutura {
    public static void main(String[] args) {


        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Sam");
        nomes.add("Melissa");
        nomes.add("Jose");
        nomes.add("leo");

        nomes.remove(2);

        System.out.println(nomes.get(2));

    }
}
