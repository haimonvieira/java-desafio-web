package br.com.alura.javaDesafioWeb.controller;

import br.com.alura.javaDesafioWeb.dto.FraseDTO;
import br.com.alura.javaDesafioWeb.services.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * É aqui que o Front-end pega os dados
 */
@RestController
public class FraseController {

    @Autowired
    private FraseService service;

    //Endpoint
    @GetMapping("/series/frases")
    public FraseDTO obterFrases(){

        return service.obterFraseAleatoria();

    }


}
