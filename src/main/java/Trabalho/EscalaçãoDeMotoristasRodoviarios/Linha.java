package Trabalho.EscalaçãoDeMotoristasRodoviarios;

public class Linha extends Papel {
    private int linha;
    private String caminho;
    private String pontoFinal;
    private Motorista motorista;

    public Linha(int linha, String caminho, String pontoFinal){
        super();
        this.linha = linha;
        this.caminho = caminho;
        this.pontoFinal = pontoFinal;
    }

    @Override
    public String getId() {
        return super.getId();
    }

    public String getCaminho() {
        return caminho;
    }

    public int getLinha() {
        return linha;
    }

    public String getPontoFinal() {
        return pontoFinal;
    }

    public Motorista getMotorista() {
        return motorista;
    }
    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    @Override
    public String toString() {
        return "CAMINHO: " + caminho + ", PONTO FINAL: " + pontoFinal + ", MOTORISTA: " + motorista;
    }


}
