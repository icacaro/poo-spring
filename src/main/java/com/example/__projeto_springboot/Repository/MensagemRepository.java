package com.example.__projeto_springboot.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class MensagemRepository {
    public String obterMensagem() {
        return "olá do repositório";
    }
}
