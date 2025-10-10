package exercicio1;

public class Poupanca extends Conta {

    private int aniversario;

    public Poupanca(String banco, int agencia, int conta, int aniversario) {
        super(banco, agencia, conta);
    }

    public int getAniversario(){
        return aniversario;
    }

    public void setAniversario(int aniversario) {
        if (aniversario >= 1 && aniversario <= 30){
            this.aniversario = aniversario;
        }else{
            System.out.println("Aniversário Inválido");
        }
    }

    public String toString(){
//        return "Banco: " + super.getBanco() +
//                "\nAgência: " + super.getAgencia() +
//                "\nConta: " + super.getConta() +
//                "\nSaldo: " + super.getSaldo() +
//                "\nAniversario: " + this.aniversario();
        return super.toString() + "\nAniversário: " + this.aniversario;
    }
}
