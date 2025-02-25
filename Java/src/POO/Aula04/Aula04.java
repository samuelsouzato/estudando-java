package POO.Aula04;

public class Aula04 {
    public static void main(String[] args) {
        System.out.println(" ");

        //Meu objeto com Parâmetros do meu método construtor
       Caneta c1 = new Caneta(true, "Bic", "Azul ", 0.7);
       c1.status();
       
       Caneta c2 = new Caneta (false,"Faber Castell", "Preta", 0.5);
       c2.status();
    }

    
}
