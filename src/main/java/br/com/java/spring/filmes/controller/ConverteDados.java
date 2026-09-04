package br.com.java.spring.filmes.controller;

import br.com.java.spring.filmes.model.Filme;
import tools.jackson.databind.ObjectMapper;

public class ConverteDados{
    private ObjectMapper mapper = new ObjectMapper();

    public <T> T obterDados(String json, Class<T> classe) {
        return mapper.readValue(json, (Class<T>) Filme.class);
    }
}
