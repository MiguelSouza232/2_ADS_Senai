package model;

public class Produto {
    private int codigo;
    private String descricao;
    private double valor;

    public Produto(int c, String d, double v) {
        this.setCodigo(c);
        this.setDescricao(d);
        this.setValor(v);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int argCodigo) {
        //aceitar apenas códigos entre 1 e 100000
        if (argCodigo >= 1 && argCodigo <= 100000) {
            this.codigo = argCodigo;
        } else {
            System.out.println("Código Inválido");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String argDescricao) {
        //aceitar apenas produtos com o nome entre 3 e 10 caracteres (inclusive)
        if (argDescricao.length() >= 3 && argDescricao.length() <= 10) {
            this.descricao = argDescricao;
        } else {
            System.out.println("Descrição Inválida");
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double argVlr) {
        //aceitar apenas produtos com valores positivos
        if (argVlr > 0) {
            this.valor = argVlr;
        } else {
            System.out.println("Valor Inválido");
        }
    }

    public String print() {
        String ret;
        ret = "Código: " + this.codigo +
                "\nDescrição: " + this.descricao +
                "\nValor: " + this.valor;
        return ret;
    }
}
