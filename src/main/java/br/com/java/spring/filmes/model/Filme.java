package br.com.java.spring.filmes.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record Filme(
        @JsonAlias("imdbID") String id,
        @JsonAlias("Title") String nome,
        @JsonAlias("Year") String ano,
        @JsonAlias("Genre") String genero,
        @JsonAlias("Runtime") String duracao
) {}
