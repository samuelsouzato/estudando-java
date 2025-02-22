package Sintaxe.aExerciciosBasicos;

import java.util.Scanner;

public class SomaAte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" ");
        System.out.print("Digite um numero, e irei somar todos os numeros até chegar ao seu desejado: ");
        int n = sc.nextInt();
        
        int soma = 0;
    
    for(int i = 1; i <= n; i++){
        soma += i;

        if (i != n) {
            System.out.print(i + " + "); 
        } else {
            System.out.print(i + " = ");
        }
    }
   
    System.out.println(soma);

    sc.close();

    }
}
