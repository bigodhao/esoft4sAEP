package Trabalho.EscalaçãoDeMotoristasRodoviarios;

public class Linha extends Papel {
    private Motorista motorista;
    private String caminho;
    private String pontoFinal;

    public Linha(Motorista motorista, String caminho, String pontoFinal){
        super();
        this.motorista = motorista;
        this.caminho = caminho;
        this.pontoFinal = pontoFinal;
        this.motorista.getLinhas();
    }

    @Override
    public String getId() {
        // TODO Auto-generated method stub
        return super.getId();
    }

    public String getCaminho() {
        return caminho;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public String getPontoFinal() {
        return pontoFinal;
    }


}
