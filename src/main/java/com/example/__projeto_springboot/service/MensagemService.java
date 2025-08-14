package com.example.__projeto_springboot.service;

import org.springframework.stereotype.Service;

import com.example.__projeto_springboot.Repository.MensagemRepository;

@Service
public class MensagemService {

    private final MensagemRepository mensagemRepository;

    public MensagemService(MensagemRepository mensagemRepository){
        this.mensagemRepository = mensagemRepository;
    }

    public String obterMensagme(){
        return mensagemRepository.obterMensagem();
    }
    
}
