package Trabalho.EscalaçãoDeMotoristasRodoviarios;

import java.util.UUID;

public class Papel {
    private String id;

    public Papel(){
        id = UUID.randomUUID().toString();
    }
    
    public String getId() {
        return id;
    }
}
