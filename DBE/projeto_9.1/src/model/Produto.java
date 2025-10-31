package model;

public class Produto implements IImprimivel, ISeguranca {
    private String descricao;
    private int quantidade;

    public Produto(String d, int q) {
        this.setDescricao(d);
        this.setQuantidade(q);
    }

    public Produto() {}

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String argDescricao) {
        if(argDescricao.length() >= 3){
            this.descricao = argDescricao.toUpperCase();
        } else{
            System.out.println("Descrição inválida");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String formatoString() {
        return "Descrição: " + this.descricao + nlin +
                "Quantidade: " + this.quantidade;
    }

    @Override
    public void formatoSystemOut() {
        System.out.println("Descrição: " + this.descricao + nlin +
                            "Quantidade: " + this.quantidade);
    }

    @Override
    public boolean validar() {
        if(this.descricao != null && this.quantidade > 0){
            return true;
        } else {
            return false;
        }
    }
}