package view;

import model.Produto;
import model.Usuario;

public class UsaClasses {
    public static void main(String[] args) {
//        Usuario user1 = new Usuario("miguel", "12345678");
//        System.out.println(user1.formatoString());
//        System.out.println(user1.validar());

        Produto p1 = new Produto("Sapato", 1);
        System.out.println(p1.formatoString());
        System.out.println(p1.validar());
    }
}
