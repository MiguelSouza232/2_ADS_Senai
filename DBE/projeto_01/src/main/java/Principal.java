/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 25170626
 */
public class Principal {
    public static void main(String[] args) {
        //variáveis
        String nome;
        int idade;
        double renda;
        
        //entradas
        nome = "Miguel";
        idade = 19;
        renda = 600.00;
        
        //processamento
        //renda = renda + ((renda * 10)/100);
        
        
        //saída
        System.out.println("A renda do " + nome + " é de " + renda);
        double bonus = bonificar();
        renda = renda + bonus;
        atualizarRenda(renda);
    }
    
    static void atualizarRenda(double argRenda){
        double rendaAtualizada = argRenda + ((argRenda * 10)/100);
        System.out.println("Renda atualizada é " + rendaAtualizada);
    }
    
    static double bonificar() {
        //System.out.println("O bônus é de: " + 100);
        return 100.0;
    }
    
}
