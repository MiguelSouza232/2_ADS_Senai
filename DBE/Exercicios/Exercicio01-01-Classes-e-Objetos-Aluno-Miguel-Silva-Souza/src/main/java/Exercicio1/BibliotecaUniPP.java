package Exercicio1;

public class BibliotecaUniPP {
    public static void main(String[] args) {
        Livro l1 = new Livro("Java Básico", "Autor A", 300);
        Livro l2 = new Livro("POO em Prática", "Autor B", 250);
        Livro l3 = new Livro("Estruturas de Dados", "Autor C", 400);

        // Simular leitura parcial
        l1.ler(100);

        // Simular empréstimo
        l2.emprestar();

        // Simular devolução
        l3.emprestar();
        l3.devolver();

        // Exibir informações
        l1.exibirInformacoes();
        l2.exibirInformacoes();
        l3.exibirInformacoes();
    }
}

