package Exercicio1;

public class Livro {
    private String titulo;
    private String autor;
    private int paginas;
    private int paginasLidas;
    private boolean emprestado;

    // Construtor
    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.paginasLidas = 0;
        this.emprestado = false;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getPaginasLidas() {
        return paginasLidas;
    }

    public void setPaginasLidas(int paginasLidas) {
        if (paginasLidas <= this.paginas) {
            this.paginasLidas = paginasLidas;
        }
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    // Métodos
    public void ler(int qtd) {
        if (paginasLidas + qtd > paginas) {
            paginasLidas = paginas;
        } else {
            paginasLidas += qtd;
        }
    }

    public double verProgresso() {
        return ((double) paginasLidas / paginas) * 100;
    }

    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro \"" + titulo + "\" foi emprestado.");
        } else {
            System.out.println("Livro \"" + titulo + "\" já está emprestado.");
        }
    }

    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro \"" + titulo + "\" foi devolvido.");
        } else {
            System.out.println("Livro \"" + titulo + "\" não estava emprestado.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
        System.out.println("Páginas Lidas: " + paginasLidas);
        System.out.printf("Progresso: %.2f%%\n", verProgresso());
        System.out.println("Emprestado: " + (emprestado ? "Sim" : "Não"));
        System.out.println("--------------------------");
    }
}

