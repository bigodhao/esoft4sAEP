package Trabalho.CadastroUsuario;

public class Endereco {
    private String estado;
    private String cidade;
    private String bairro;
    private String logradouro;
    private String número;
    private String complemento;

    public Endereco(String estado, String cidade, String bairro, String logradouro, String número, String complemento) {
        if(validar(estado)){
            this.estado = estado;
        }else{
            throw new RuntimeException("O campo não pode ser vazio!");
        }
        if(validar(cidade)){
            this.cidade = cidade;
        }else{
            throw new RuntimeException("O campo não pode ser vazio!");
        }
        if(validar(bairro)){
            this.bairro = bairro;
        }else{
            throw new RuntimeException("O campo não pode ser vazio!");
        }
        if(validar(logradouro)){
            this.logradouro = logradouro;
        }else{
            throw new RuntimeException("O campo não pode ser vazio!");
        }
        if(validar(número)){
            this.número = número;
        }else{
            throw new RuntimeException("O campo não pode ser vazio!");
        }
        this.complemento = complemento;
    }
    
    @Override
    public String toString() {
        return "Endereço [estado=" + estado + ", cidade=" + cidade + ", bairro=" + bairro + ", logradouro=" + logradouro + ", número=" + número + ", complemento=" + complemento + "] ";
    }
    private static boolean validar(String valor){
        if (valor == null){
            return false;
        }else{
            return true;
        }
    }
}
