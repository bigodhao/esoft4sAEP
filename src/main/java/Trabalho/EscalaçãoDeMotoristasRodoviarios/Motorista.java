package Trabalho.EscalaçãoDeMotoristasRodoviarios;

import java.util.List;

public class Motorista extends Papel {
    private String nome;
    private char tipoDaCarteira;
    private List<Linha> linhas;

    public Motorista(String nome, char tipoDaCarteira){
        super();
        this.nome = nome;
        this.tipoDaCarteira = tipoDaCarteira;
    }

    public void setLinhas(List<Linha> linhas) {
        this.linhas = linhas;
    }

    public List<Linha> getLinhas() {
        return linhas;
    }

    public char getTipoDaCarteira() {
        return tipoDaCarteira;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String getId() {
        // TODO Auto-generated method stub
        return super.getId();
    }
}
