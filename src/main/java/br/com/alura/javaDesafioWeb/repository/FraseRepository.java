package br.com.alura.javaDesafioWeb.repository;

import br.com.alura.javaDesafioWeb.models.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Faz consultas no pgAdmin
 */

public interface FraseRepository extends JpaRepository<Frase, Long> {

    //Mostra apenas uma frase aleatoriamente
    @Query("SELECT f FROM Frase f order by function('RANDOM') LIMIT 1")
    Frase obterFraseAleatoria();

}
