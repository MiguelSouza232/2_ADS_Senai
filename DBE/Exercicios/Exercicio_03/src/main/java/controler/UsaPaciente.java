package controler;

import model.Paciente;

public class UsaPaciente {
    public static void main(String[] args) {
        Paciente p1 = new Paciente();
        p1.setNome("Miguel Silva Souza");
        p1.setRg("33.222.111-1");
        p1.setEndereco("Rua Purus, 482");
        p1.setTelefone("1199999-9999");
        p1.setDataNascimento("10/04/2006");
        p1.setProfissao("Dev BeckEnd");
        p1.imprimirDados();

        Paciente p2 = new Paciente("Miguel Silva Souza", "33.222.111-1", "Rua Purus, 482", "1199999-9999", "10/04/2006", "Dev BeckEnd" );
        p2.imprimirDados();
    }
}