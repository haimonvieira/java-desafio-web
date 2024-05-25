package br.com.alura.javaDesafioWeb.services;

import br.com.alura.javaDesafioWeb.dto.FraseDTO;
import br.com.alura.javaDesafioWeb.models.Frase;
import br.com.alura.javaDesafioWeb.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Classe de serviço que fornece dados ao FraseController
 */
@Service
public class FraseService {

    @Autowired
    private FraseRepository repository;

    public FraseDTO obterFraseAleatoria() {

        //Recebendo o tipo Frase do FraseRepository
        Frase frase = repository.obterFraseAleatoria();

        //transformando Frase em FraseDTO
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(),
                frase.getPoster());


    }
}
