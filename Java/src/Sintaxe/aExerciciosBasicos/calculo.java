package Sintaxe.aExerciciosBasicos;

import java.util.Scanner;

public class Calculo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Digite um número: ");
        double x = sc.nextDouble();

        System.out.print("Digite um número: ");
		double y = sc.nextDouble();

        System.out.print("Digite um número: ");
		double z = sc.nextDouble();
		double A, B, C;
		
		
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(z);
		System.out.println("Raiz quadrada de: " + x + " = " + A);
		System.out.println("Raiz quadrada de: " + y + " = " + B);
		System.out.println("Raiz quadrada de: " + z + " = " + C);
		
		sc.nextLine();
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado =" + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		sc.close();
		
		
		
		
		
	}

    
}
