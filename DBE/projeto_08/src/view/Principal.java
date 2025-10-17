package view;

import model.*;

public class Principal {
    public static void main(String[] args) {
//        Produto p1 = new Produto(1,"Celular", 5000);
//        System.out.println(p1.print());
//        Eletronico e1 = new Eletronico(1, "Iphone", 5000, 110);
//        System.out.println(e1.print());
//        Vestuario v1 = new Vestuario(1, "Calça", 100, "Capri ", "Azul", "GG");
//        System.out.println(v1.print());
//        Roupa r1 = new Roupa(1, "Calça", 100, "Capri ", "Azul", "GG", "Jeans");
//        System.out.println(r1.print());
        Calcado c1 = new Calcado(1, "Tênis", 800, "Jogging ", "Verde", "44", "Borracha", "Couro", "Nylon");
        System.out.println(c1.print());
    }
}
