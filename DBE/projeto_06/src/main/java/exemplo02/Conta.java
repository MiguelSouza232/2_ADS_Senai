package exemplo02;

public class Conta {
    private int numero;
    private int agencia;
    private double saldo;

    public Conta(int numero, int agencia) {
        this.setAgencia(agencia);
        this.setNumero(numero);
        this.setSaldo(100);
    }
    
    public Conta(int numero){
        this.agencia = 1500;
        this.setNumero(numero);
        this.setSaldo(0);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        //aceitar conta com numero entre 10000 e 20000
        if (numero >= 10000 && numero <= 20000) {
            this.numero = numero;
        } else {
            System.out.println("Número inválido!");
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        //sceitar agencia com número entre 1 e 9999
        if (agencia >= 1 && agencia <= 9999) {
            this.agencia = agencia;
        } else {
            System.out.println("Agência inválido!");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //criar um método para depositar valor na conta com retorno booleano
    public boolean depositar(double valor){
        if (valor > 0) {
            this.setSaldo(this.saldo + valor);
            return true;
        } else{
            System.out.println("Valor de depósito inválido");
            return false;
        }
    }
    
    //criar um método para sacar um valor da conta com retorno booleano
    public boolean sacar(double saque){
        if (saque > 0 && this.saldo >= saque) {
            this.setSaldo(this.saldo - saque);
            return true;
        } else {
            System.out.println("Saque não permitido");
            return false;
        }
    }
    
    public String imprimirDados(){
        return("Agência: " + this.agencia
                + "\nConta: " + this.numero
                + "\nSaldo: " + this.saldo);
    }
    
}
