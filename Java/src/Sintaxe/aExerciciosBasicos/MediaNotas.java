package Sintaxe.aExerciciosBasicos;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Média de notas de 4 bimestres: ");
        System.out.println(" ");

        System.out.print("Nota do primeiro bimeste: ");
        double n1 = sc.nextDouble();

        System.out.print("Nota do segundo bimeste: ");
        double n2 = sc.nextDouble();

        System.out.print("Nota do terceiro bimeste: ");
        double n3 = sc.nextDouble();

        System.out.print("Nota do quarto bimeste: ");
        double n4 = sc.nextDouble();

        double media = (n1 + n2+ n3 + n4) / 4;

        System.out.printf("A media das suas notas é: %.1f%n",media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }

        sc.close();


    }
    
}
