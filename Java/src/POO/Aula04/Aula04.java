package POO.Aula04;

public class Aula04 {
    public static void main(String[] args) {

        //Meu objeto com Parâmetros do meu método construtor
       Caneta c1 = new Caneta("BIC", 0.10);
       c1.setModelo("BIC");
       c1.setPonta(0.9);
       
         System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
    }
}
