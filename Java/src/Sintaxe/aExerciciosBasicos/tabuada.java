package Sintaxe.aExerciciosBasicos;

import java.util.Scanner;

//Peça um número e exiba a tabuada dele de 1 a 10

public class tabuada {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o número que deseja a tabuado: ");
        int n1 = scanner.nextInt();

        for (int i = 1; i <= 10; i++ ){
            System.out.println( n1 + " X " + i + " = " + (n1 * i) );
        }

        scanner.close();




    }
    
}
