package POO.Aula06;

import javax.sound.sampled.SourceDataLine;

//Classe
public class ControleRemoto implements Controlador{

//Atributos
private int volume;
private boolean ligado;
private boolean tocando;


    //Construtor
    public ControleRemoto() {
        
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    //Métodos Especiais
    private void setVolume(int v) {
        this.volume = v;
    }

    private int getVolume() {
        return volume;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setTocando(boolean t) {
        this.tocando = t;
    }

    private boolean getTocando() {
        return tocando;
    }

    //Métodos Abstratos
    
    @Override
    public void ligar(){
        this.setLigado(true);
        
    }

    @Override
    public void desligar(){
        this.setLigado(false);
    }

    @Override
    public void abrirMenu(){
        if(this.getLigado()){
            System.out.println("----MENU----");
            System.out.println("Está ligado?: " + this.getLigado());
            System.out.println("Está tocando?: " + this.getTocando());
            System.out.print("Volume: " + this.getVolume());

        for (int i = 0; i <= this.getVolume(); i+=10) {
            System.out.print("|");
        }

        }else{
            System.out.println("Impossível abrir Menu com a TV desligada!!");
        }
            
    }

    @Override
    public void fecharMenu(){
        System.out.println(" ");
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume(){
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }else{
            System.out.println("Impossivel aumentar volume com a TV desligada!!");
        }
    }   

    @Override
    public void menosVolume(){
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }else{
            System.out.println("Impossivel diminuir volume com a TV desligada!!");
        }
    }

    @Override
    public void ligarMudo(){
        if (this.getLigado() && getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo(){
        if(this.getLigado() && getVolume() == 0){
           this.setVolume(50); 
        }
    }

    @Override
    public void play(){
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }else{
            System.out.println("Não consegui reproduzir!!");
        }
    }

    @Override
    public void pause(){
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }else{
            System.out.println("Não consegui pausar!!");
        }
    }




}
