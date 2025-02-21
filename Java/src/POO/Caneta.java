package POO;

public class Caneta {
    String cor;
    double ponta;
    boolean tampada;

    // Construtor
    public Caneta(String cor, double ponta) {
        this.cor = cor;
        this.ponta = ponta;
        this.tampada = true; // A caneta começa tampada
    }

    // Método para escrever
    public void escrever(String texto) {
        if (tampada) {
            System.out.println("Erro! A caneta está tampada.");
        } else {
            System.out.println("Escrevendo: " + texto);
        }
    }

    // Método para tampar a caneta
    public void tampar() {
        tampada = true;
        System.out.println("A caneta foi tampada.");
    }

    // Método para destampar a caneta
    public void destampar() {
        tampada = false;
        System.out.println("A caneta foi destampada.");
    }

    // Método para mostrar o estado atual da caneta
    public void mostrarEstado() {
        System.out.println("Cor: " + cor);
        System.out.println("Ponta: " + ponta);
        System.out.println("Está tampada? " + (tampada ? "Sim" : "Não"));
    }
}

    class Main {
    public static void main(String[] args) {
        // Criando um objeto Caneta
        Caneta minhaCaneta = new Caneta("Azul", 0.7);

        // Mostrando o estado inicial da caneta
        minhaCaneta.mostrarEstado();

        // Tentando escrever com a caneta tampada
        minhaCaneta.escrever("Olá, mundo!");

        // Destampando a caneta e tentando escrever novamente
        minhaCaneta.destampar();
        minhaCaneta.escrever("Agora sim, estou escrevendo!");

        // Tampando a caneta novamente e mostrando o estado final
        minhaCaneta.tampar();
        minhaCaneta.mostrarEstado();
    }
}
