package Sintaxe.bCondicionais.Exercício;

//Crie um programa que leia dois números inteiros e diga qual deles é o maior. Se ambos forem iguais, deve exibir "Os números são iguais".
public class comparacaoDeNumeros {
    public static void main(String[] args) {
     
        int n1 = 22;
        int n2 = 18;

        if(n1 > n2){
            System.out.println( n1 + " é maior que " + n2);
        }else if(n1 < n2){
            System.out.println( n1 + " é menor que " + n2);
        }else{
            System.out.println("Os dois numeros são iguais"); 
        }



    }
}
