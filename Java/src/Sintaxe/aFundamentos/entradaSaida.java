package Sintaxe.aFundamentos;

import java.util.Scanner;

public class entradaSaida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Criando o Scanner para entrada de dados

        System.out.print("Digite seu nome: "); // Equivalente ao "escreva" no Portugol
        String nome = scanner.nextLine(); // Equivalente ao "leia" para texto

        System.out.print("Digite sua Idade: ");
        int idade = scanner.nextInt(); // Equivalente ao "leia" para números inteiros

        System.out.println("Seu nome é: " + nome + " e vc tem " + idade + " anos de idade!!");
       

        scanner.close(); // Fechando o Scanner para evitar vazamento de recursos


    }
}
