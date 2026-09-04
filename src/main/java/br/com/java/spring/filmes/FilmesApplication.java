package br.com.java.spring.filmes;

import br.com.java.spring.filmes.model.Filme;
import br.com.java.spring.filmes.service.FilmeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tools.jackson.databind.ObjectMapper;

@SpringBootApplication
public class FilmesApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(FilmesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("---------------------------------------------------------------");
		ObjectMapper mapper = new ObjectMapper();

		String filme = FilmeService.consultaFilme("tt0083658");
		System.out.println(filme);

		var f = mapper.readValue(filme, Filme.class);

		System.out.println(f);

	}
}
