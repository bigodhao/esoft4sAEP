package Trabalho.CadastroUsuario;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class AppCadastroUsuario {
    
    public static void main(String[] args) {
        List<Usuario> usuarios = new ArrayList<>();
        
        Nome nomeDigitado = new Nome(JOptionPane.showInputDialog(null, "Digite o nome: "));
        Cpf cpfDigitado = new Cpf(JOptionPane.showInputDialog(null, "Digite o CPF: "));
        Date dataDigitada = new Date(27,07,2001);
        Endereco enderecoDigitado = new Endereco("paraná", "maringá", "parq. hortência", "pion", "444", "casa");
        Email emailDigitado = new Email(JOptionPane.showInputDialog(null, "Digite o email: "));
        Usuario novoUsuario = new Usuario(nomeDigitado.toString(), cpfDigitado.toString(), enderecoDigitado.toString(), dataDigitada.toString(), emailDigitado.toString(), "12345");
        usuarios.add(novoUsuario);
        System.out.println(novoUsuario);
    }
    
}
