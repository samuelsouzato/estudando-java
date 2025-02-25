package POO.Aula04;

public class Caneta {
    private String modelo;
    private String cor;
    private double ponta;
    private boolean tampada;
    

    //Método Construtor 
    public Caneta(boolean t,String m, String c, double p){
        this.tampada = true;
        this.cor = c;
        this.modelo = m;
        this.ponta = p;
    }

    //Getter de Modelo
    public String getModelo(){
        return modelo;
    }

    //Setter de Modelo
    public void setModelo(String m){
        this.modelo = m;
    }

    //Getter de Cor
    public String getCor(){
        return cor;
    }

    //Setter de Cor
    public void setCor(String c){
        this.cor = c;
    }

    //Getter de Ponta
    public double getPonta(){
        return ponta;
    }

    //Setter de Ponta
    public void setPonta(double p){
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("SOBRE A CANETA ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampada: " + this.tampada);
    }



}
