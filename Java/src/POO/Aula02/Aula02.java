package POO.Aula02;

public class Aula02 {
    public static void main(String[] args) {
        System.out.println(" ");
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5;

        c1.tampar();
        c1.status();
        c1.rabiscar();

        System.out.println(" ");

        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
        
       

    }
}