package br.com.java.spring.filmes;

import br.com.java.spring.filmes.controller.ConverteDados;
import br.com.java.spring.filmes.model.Filme;
import br.com.java.spring.filmes.service.FilmeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Scanner;

@SpringBootApplication
public class FilmesApplication implements CommandLineRunner{

	public static void exibeMenu(){

	}

	public static void main(String[] args) {
		SpringApplication.run(FilmesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scan = new Scanner(System.in);
		ConverteDados mapper = new ConverteDados();
		System.out.println("---------------------------------------------------------------");

		loop:
		while(true){
			exibeMenu();
			int opcao = scan.nextInt();

			switch(opcao){
				case 1:
					/*
					EXEMPLOS DE IDS VÁLIDOS:
					tt0083658 (Blade Runner)
					tt0276919 (Dogville)
					tt7282468 (Burning)
					tt6587046 (The Boy and The Heron)
					tt1659337 (The Perks of Being a Wallflower)
					 */
					System.out.println("Digite o ID de um filme: ");
					String id = scan.next();

					String filme = FilmeService.consultaFilme(id);
					var f = mapper.obterDados(filme, Filme.class);

					System.out.println(f);
					break;
				case 2:

					break;
				case 3:
					scan.close();
					break loop;
			}
		}

	}
}
