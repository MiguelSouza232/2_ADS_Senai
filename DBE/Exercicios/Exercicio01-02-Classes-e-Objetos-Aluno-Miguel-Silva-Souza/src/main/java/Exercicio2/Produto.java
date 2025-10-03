package Exercicio2;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Métodos
    public void comprar(int qtd) {
        quantidade += qtd;
    }

    public void vender(int qtd) {
        if (qtd <= quantidade) {
            quantidade -= qtd;
            System.out.println("Venda realizada de " + qtd + " unidades de " + nome);
        } else {
            System.out.println("Estoque insuficiente para vender " + qtd + " unidades de " + nome);
        }
    }

    public double calcularValorTotal() {
        return preco * quantidade;
    }

    public boolean estoqueBaixo() {
        return quantidade < 5;
    }

    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor Total em Estoque: R$" + calcularValorTotal());
        System.out.println("Estoque Baixo: " + (estoqueBaixo() ? "Sim" : "Não"));
        System.out.println("--------------------------");
    }
}

