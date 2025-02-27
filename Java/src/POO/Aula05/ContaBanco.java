package POO.Aula05;

public class ContaBanco {
    
    // Atributos da classe ContaBanco
    public int numConta;        // Número da conta
    protected String tipo;      // Tipo da conta (CC ou CP)
    private String dono;        // Nome do dono da conta
    private float saldo;        // Saldo da conta
    private boolean status;     // Status da conta (ativa ou inativa)

    // Método para mostrar o estado atual da conta
    public void estadoAtual() {
        System.out.println(" ");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + getStatus());
    }
    
    // Construtor da classe
    public ContaBanco() {
        this.setSaldo(0);       // Inicializa o saldo como 0
        this.setStatus(false);  // Inicializa a conta como fechada (status = false)
    }

    // Método para abrir uma conta
    public void abrirConta(String t) {
        this.setTipo(t);       // Define o tipo de conta (CC ou CP)
        this.setStatus(true);  // Abre a conta (status = true)
        if (t == "CC") {       // Se for Conta Corrente
            this.setSaldo(50);  // Saldo inicial de R$ 50
        } else if (t == "CP") { // Se for Conta Poupança
            setSaldo(150);      // Saldo inicial de R$ 150
        }
        System.out.println(" ");
        System.out.println("Conta aberta com Sucesso!!");
    }

    // Método para fechar a conta
    public void fecharConta() {
        if (this.getSaldo() > 0) {  // Verifica se ainda há saldo na conta
            System.out.println("Conta não pode ser fechada, porque ainda tem dinheiro!!");
        } else if (this.getSaldo() < 0) {  // Verifica se há débito
            System.out.println("Conta não pode ser fechada, pois tem débito!!");
        } else {
            this.setStatus(false);  // Fecha a conta (status = false)
            System.out.println("Conta fechada com Sucesso!!");
        }
    }

    // Método para depositar um valor na conta
    public void depositar(float v) {
        if (this.getStatus()) {  // Verifica se a conta está ativa
            this.setSaldo(getSaldo() + v);  // Adiciona o valor ao saldo
            System.out.println("Depósito realizado na conta de '" + this.getDono() + "'!! ");
        } else {
            System.out.println("Impossível depositar em uma conta fechada!!");
        }
    }   

    // Método para sacar um valor da conta
    public void sacar(float v) {
        if (this.getStatus()) {  // Verifica se a conta está ativa
            if (this.getSaldo() >= v) {  // Verifica se há saldo suficiente
                this.setSaldo(this.getSaldo() - v);  // Subtrai o valor do saldo
                System.out.println("Saque realizado na conta de '" + this.getDono() + "'!! ");
            } else {
                System.out.println("Saldo insuficiente!!");
            }
        } else {
            System.out.println("Impossível sacar");
        }
    }

    // Método para pagar a mensalidade da conta
    public void pagarMensal() {
        int v = 0;  // Valor da mensalidade
        if (this.getTipo() == "CC") {  // Se for Conta Corrente
            v = 12;  // Mensalidade de R$ 12
        } else if (this.getTipo() == "CP") {  // Se for Conta Poupança
            v = 20;  // Mensalidade de R$ 20
        }
        if (this.getStatus()) {  // Verifica se a conta está ativa
            this.setSaldo(this.getSaldo() - v);  // Subtrai o valor da mensalidade do saldo
            System.out.println("Mensalidade paga com Sucesso por '" + this.getDono() + "'!! ");
        } else {
            System.out.println("Impossível pagar!!");
        }    
    }

    // Getters e Setters para acessar e modificar os atributos

    public void setNumConta(int numConta) {
        this.numConta = numConta;  // Define o número da conta
    }
    
    public int getNumConta() {
        return this.numConta;  // Retorna o número da conta
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;  // Define o tipo da conta
    }
    
    public String getTipo() {
        return this.tipo;  // Retorna o tipo da conta
    }
   
    public void setDono(String dono) {
        this.dono = dono;  // Define o nome do dono da conta
    }
    
    public String getDono() {
        return this.dono;  // Retorna o nome do dono da conta
    }
       
    public void setSaldo(float saldo) {
        this.saldo = saldo;  // Define o saldo da conta
    }
    
    public float getSaldo() {
        return this.saldo;  // Retorna o saldo da conta
    }

    public void setStatus(boolean status) {
        this.status = status;  // Define o status da conta (ativa ou inativa)
    }
    
    public boolean getStatus() {
        return this.status;  // Retorna o status da conta
    }
}