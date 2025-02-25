package POO.Aula04;

public class Caneta {
    public String modelo;
    private double ponta;

    //Método Construtor 
    public Caneta(String m, double p){
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

    //Getter de Ponta
    public double getPonta(){
        return ponta;
    }

    //Setter de Ponta
    public void setPonta(double p){
        this.ponta = p;
    }



}
