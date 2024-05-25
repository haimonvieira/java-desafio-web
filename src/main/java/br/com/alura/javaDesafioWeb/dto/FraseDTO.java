package br.com.alura.javaDesafioWeb.dto;

/**
 * Armazena ar informações do banco de dados da tabelas 'frases'
 * @param titulo
 * @param frase
 * @param personagem
 * @param poster
 */
public record FraseDTO(String titulo,
        String frase,
        String personagem,
        String poster) {
}
