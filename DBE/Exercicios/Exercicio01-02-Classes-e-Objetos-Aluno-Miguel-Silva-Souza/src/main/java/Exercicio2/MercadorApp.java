package Exercicio2;

public class MercadorApp {
    public static void main(String[] args) {
        Produto p1 = new Produto("Arroz", 25.0, 10);
        Produto p2 = new Produto("Feijão", 8.5, 3);
        Produto p3 = new Produto("Açúcar", 4.0, 20);

        // Exibir informações iniciais
        p1.exibirInformacoes();
        p2.exibirInformacoes();
        p3.exibirInformacoes();

        // Simular vendas
        p1.vender(2);
        p2.vender(1);

        // Simular reposição
        p2.comprar(10);

        // Exibir informações após operações
        p1.exibirInformacoes();
        p2.exibirInformacoes();
        p3.exibirInformacoes();
    }
}

