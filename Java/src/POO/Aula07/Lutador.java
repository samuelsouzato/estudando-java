package POO.Aula07;

//Atributos
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    
    
    public Lutador(String no, String na, int id, double al, double pe, int vi,
        int de, int em) {

        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    //Getters e Sedders
    public String getNome(){
        return nome;
    }

    public void setNome(String no){
        this.nome = no;
    }

    public String getNacionalidade(){
        return nacionalidade;
    }

    public void setNacionalidade(String na){
        this.nacionalidade = na;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int id){
        this.idade = id;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double al){
        this.altura = al;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double pe){
        this.peso = pe;
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String ca){
        this.categoria = ca;
    }

    public int getVitorias(){
        return vitorias;
    }

    public void setVitorias(int vi){
        this.vitorias = vi;
    }

    public int getDerrotas(){
        return derrotas;
    }

    public void setDerrotas(int de){
        this.derrotas = de;
    }

    public int getEmpates(){
        return empates;
    }

    public void setEmpates(int em){
        this.empates = em;
    }


    //Métodos
    public void presentar(){

    }

    public void status(){

    }

    public void ganharLuta(){

    }

    public void perderLuta(){

    }

    public void empatarLuta(){

    }





}
