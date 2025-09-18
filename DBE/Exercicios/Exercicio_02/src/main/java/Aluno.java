
public class Aluno {

    String nome, curso;
    int ano, disciplinas;
    double media;

    double calcularSemestresConcluidos() {
        int semestres;
        semestres = this.disciplinas / 5;
        return semestres;
    }

    boolean aprovado() {
        if (this.media >= 6) {
            return true;
        } else {
            return false;
        }
    }

    void imprimir() {
        System.out.println("Nome: " + this.nome
                        + "\nCurso: " + this.curso
                        + "\nAno: " + this.ano
                        + "\nDisciplinas: " + this.disciplinas
                        + "\nMédia: " + this.media
                        + "\nSemestres Concluídos: " + this.calcularSemestresConcluidos()
                        + "\nAluno aprovado? " + (this.aprovado() ? "Sim":"Não")
                        + "\n\n");
    }
}
