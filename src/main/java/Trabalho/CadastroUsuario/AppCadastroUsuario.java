package Trabalho.CadastroUsuario;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class AppCadastroUsuario {
    
    public static void main(String[] args) {
        List<Usuario> usuarios = new ArrayList<>();
        
        Nome nomeDigitado = new Nome(JOptionPane.showInputDialog(null, "Digite o nome: "));
        Cpf cpfDigitado = new Cpf(JOptionPane.showInputDialog(null, "Digite o CPF: "));
        Endereco enderecoDigitado = new Endereco("paraná", "maringá", "parq. hortência", "pion", "444", "casa");
        Usuario novoUsuario = new Usuario(nomeDigitado.getValor(), cpfDigitado.getValor(), enderecoDigitado.toString(), 27072001, "jpaulofranca10@gmail.com", "12345");
        usuarios.add(novoUsuario);
    }
    
}
