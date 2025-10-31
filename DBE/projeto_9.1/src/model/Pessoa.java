package model;

public abstract class Pessoa {
    protected String nomeCompleto;
    protected int idade;

    public Pessoa(String nc, int i) {
        this.setNomeCompleto(nc);
        this.setIdade(i);
    }

    public Pessoa() {
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String argNomeCompleto) {
        if(argNomeCompleto.length() > 5){
            this.nomeCompleto = argNomeCompleto;
        } else {
            System.out.println("Nome incompleto!");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int argIdade) {
        if(argIdade >= 18){
            this.idade = argIdade;
        } else {
            System.out.println("Idade inválida!");
        }
    }
}