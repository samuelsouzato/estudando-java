package POO;

public class Caneta {
    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;

    public void status(){

        System.out.println("Modelo:" + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println(" está tampada?: " + this.tampada);
    }

    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    protected void tampar(){
        this.tampada = true;
    }
  
    void destampar(){
        this.tampada = false;
    }
}

