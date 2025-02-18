package Sintaxe.aExerciciosBasicos;

import java.util.Scanner;

//Peça um número ao usuário e informe se ele é par ou ímpar.

public class parOuImpar{
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int n1 = scanner.nextInt();

        if (n1 % 2 == 0 ){
            System.out.println("O número: " + n1 + " é PAR.");
        } else {
             System.out.println("O número: " + n1 + " é ÍMPAR");
        }
            

        
    }  
}
