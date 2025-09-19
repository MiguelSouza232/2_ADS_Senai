package Model;

public class Aluno {

    private String nome;
    private String ra;
    private int idade;
    private double nota1, nota2;

    public double calcularMedia(double pN1, double pN2) {
        double media;
        media = (pN1 + pN2) / 2;
        return media;
    }

    public boolean verificarAprovacao(double pMedia) {
        if (pMedia >= 5) {
            return true;
        } else {
            return false;
        }
    }

    public void setNota1(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota1 = nota;
        } else {
            System.out.println("Nota invalida!");
        }
    }

    public double getNota1() {
        return this.nota1;
    }

    public void setNota2(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota2 = nota;
        } else {
            System.out.println("Nota invalida!");
        }
    }

    public double getNota2() {
        return this.nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() >= 2) {
            this.nome = nome;
        } else {
            System.out.println("Nome invalido!");
        }
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        if (ra.length() == 6) {
            this.ra = ra;
        } else {
            System.out.println("RA inválido!");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 18 && idade <= 100) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }
    }
}
