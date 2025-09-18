public class UsaClasses {
    public static void main(String[] args) {
        Aluno obj_a1 = new Aluno();
        obj_a1.nome = "João";
        obj_a1.curso = "ADS";
        obj_a1.ano = 2024;
        obj_a1.disciplinas = 15;
        obj_a1.media = 7.2;
        
        Aluno obj_a2 = new Aluno();
        obj_a2.nome = "Maria";
        obj_a2.curso = "Engenharia de Automação";
        obj_a2.ano = 2023;
        obj_a2.disciplinas = 40;
        obj_a2.media = 6.8;
        
        Aluno obj_a3 = new Aluno();
        obj_a3.nome = "Paulo";
        obj_a3.curso = "ADS";
        obj_a3.ano = 2025;
        obj_a3.disciplinas = 15;
        obj_a3.media = 7.2;
        
        obj_a1.imprimir();
        obj_a2.imprimir();
        obj_a3.imprimir();
    }
}
