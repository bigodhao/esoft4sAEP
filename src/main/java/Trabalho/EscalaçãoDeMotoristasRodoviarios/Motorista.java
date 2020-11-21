package Trabalho.EscalaçãoDeMotoristasRodoviarios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Motorista extends Papel {
    private String nome;
    private char tipoDaCarteira;
    private Endereco endereco;
    private Set<Linha> linhas = new HashSet<>();;

    public Motorista(String nome, char tipoDaCarteira, Endereco endereco){
        super();
        this.nome = nome;
        this.tipoDaCarteira = tipoDaCarteira;
        this.endereco = endereco;
    }

    public void setLinhas(Linha linha) {
        linhas.add(linha);
        linha.setMotorista(this);

    }

    public List<Linha> getLinhas() {
        return new ArrayList<>(linhas);
    }

    public char getTipoDaCarteira() {
        return tipoDaCarteira;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {        
        return "NOME: " + nome + ", TIPO DE CARTEIRA: " + tipoDaCarteira + ", " + endereco.toString();
    }

    @Override
    public String getId() {
        // TODO Auto-generated method stub
        return super.getId();
    }
}
