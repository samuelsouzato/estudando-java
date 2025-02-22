package Sintaxe.aExerciciosBasicos;

import java.util.Scanner;

//Solicite três números e determine qual é o maior deles.

public class NumeroMaior {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        System.out.println("Digite o terceiro número: ");
        int n3 = scanner.nextInt();

        if(n1 >= n2 && n1 >= n3){
            System.out.println("Os números digitados foram: " + n1 + ", " + n2 + " e " + n3 + ". O maior entre eles é: " + n1);

        }else if (n2 >= n1 && n2 >= n3){
            System.out.println("Os números digitados foram: " + n1 + "," + n2 + " e "+ n3 + ". O maior entre eles é: " + n2);
            
        }else
        System.out.println("Os números digitados foram: " + n1 +", " + n2 + " e " + n3 + ". O maior entre eles é: " + n3);
        






    }
}
