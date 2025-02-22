package Sintaxe.aExerciciosBasicos;

import java.util.Scanner;

//Crie um programa que peça dois números inteiros ao usuário e exiba a soma deles.

public class Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        int soma = n1 + n2;

        System.out.print("A soma de: " + n1 + " e " + n2 + " é igual a: " + soma);

        scanner.close();





    }
}
