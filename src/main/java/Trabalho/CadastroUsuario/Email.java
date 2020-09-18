package Trabalho.CadastroUsuario;

public class Email {
    private String email;

    public Email(String email){
        if (null == email || email.trim().split("@").length < 2) {
            throw new RuntimeException("O email deve contar pelo menos o @!");
        }
        this.email = email;
    }
    @Override
    public String toString() {
        return ", " + email + " ";
    }
}
