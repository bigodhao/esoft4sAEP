package Trabalho.CadastroUsuario;


public class Usuario {

    private String nome;
    private String cpf;
    private String endereco;
    private int dataNascimento;
    private String email;
    private String senha;

    public Usuario(String nome, String cpf, String endereco, int dataNascimento, String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senha = senha;
    }
    @Override
    public String toString() {
        return nome + cpf + endereco + dataNascimento + email + senha;
    }
    
}
