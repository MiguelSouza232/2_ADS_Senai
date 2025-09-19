package controler;

import Model.Aluno;
import javax.swing.JOptionPane;

public class UsaClasses {

    public static void main(String[] args) {
        Aluno obj_aluno = new Aluno();

        //entrada de dados
        obj_aluno.setNome(JOptionPane.showInputDialog("Digite o nome: "));
        obj_aluno.setRa(JOptionPane.showInputDialog("Digite o ra: "));
        obj_aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: ")));
        obj_aluno.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota1: ")));
        obj_aluno.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota2: ")));

        double media = obj_aluno.calcularMedia(obj_aluno.getNota1(), obj_aluno.getNota2());
        boolean status = obj_aluno.verificarAprovacao(media);

        JOptionPane.showMessageDialog(null, "A media do aluno "
                + obj_aluno.getNome() + " é " + media
                + "\nSeu status é: " + ((status) ? "Aprovado" : "Reprovado"));
    }
}
