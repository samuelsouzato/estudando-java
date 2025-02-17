package Sintaxe.cVetores;

public class estrutura {
    public static void main(String[] args) {

        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000L;
        float f = 10.5f; 
        double d = 20.5;
        char c = 'A';
        String str = "Samuel";
        boolean bool = true;
        
        int[] colecaoDeInteiros = {1, 2, 3, 4, 5};

        String[] nomesArr = new String [10];

        nomesArr [0] = "Sam";

        nomesArr [2] = "Soares";

        System.out.println(nomesArr[2] + colecaoDeInteiros[2]);


    }
}
