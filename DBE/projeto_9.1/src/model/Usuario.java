package model;

public class Usuario extends Pessoa implements IImprimivel, ISeguranca {
    private String nomeUsuario;
    private String senha;

    public Usuario(String nu, String s) {
        this.setNomeUsuario(nu);
        this.setSenha(s);
    }

    public Usuario() {}

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String argNomeUsuario) {
        if(argNomeUsuario.length() > 3 && argNomeUsuario.length() < 10){
            this.nomeUsuario = argNomeUsuario;
        } else{
            System.out.println("Nome de usuário inválido!");
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String argSenha) {
        if(argSenha.length() == 8){
            this.senha = argSenha;
        } else {
            System.out.println("A senha não possui 8 caracteres");
        }
    }

    @Override
    public String formatoString() {
        return "Usuário: " + this.nomeUsuario + nlin + "Senha: " + this.senha;
    }

    @Override
    public void formatoSystemOut() {
        System.out.println("Usuário: " + this.nomeUsuario + nlin + "Senha: " + this.senha);
    }

    @Override
    public boolean validar() {
        if(this.nomeUsuario != null && this.senha != null){
            return true;
        } else {
            return false;
        }
    }
}