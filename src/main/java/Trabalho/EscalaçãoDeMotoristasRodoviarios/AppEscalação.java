package Trabalho.EscalaçãoDeMotoristasRodoviarios;

public class AppEscalação {
    public static void main(String[] args) {
        Endereco unicesumarEndereço = new Endereco("pr", "Maringá", "Jardim Aclimação", "av. guedner", "1610", "faculdade");
        Motorista motoristaJoao = new Motorista("João Paulo ", 'D', unicesumarEndereço);
        Linha conjThais324 = new Linha(324, "Conjunto Habtacional João De Barro Thais", "Mercado Real");
        Linha pqHortencia713 = new Linha(713, "Parque hortencia 1", "Mercado Real");
        motoristaJoao.setLinhas(conjThais324);
        motoristaJoao.setLinhas(pqHortencia713);
        System.out.println(motoristaJoao.toString());
        for (Linha l : motoristaJoao.getLinhas()) {
            System.out.println(l.toString());
        }
    }
}
