package br.com.java.spring.filmes.controller;
import java.io.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public abstract class SalvaFilme {

    public static void salvar(String titulo){
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime nowInBrasilia = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        try{
            FileWriter escrita = new FileWriter("filmes.txt", true);
            escrita.write("%s (salvo em %s, %s )".formatted(titulo, now, nowInBrasilia));
            escrita.close();

            System.out.println("Título de Filme salvo com sucesso!");
        }catch(IOException e){
            System.out.println("Ocorreu um erro ao salvar o título do filme");
            e.printStackTrace();
        }
    }

    public static void listar() throws IOException {
        FileReader leitura = new FileReader("filmes.txt");
        BufferedReader bufferedReader = new
                BufferedReader(leitura);
        String linha;
        while ((linha = bufferedReader.readLine()) != null) {
            System.out.println(linha);
        }
        bufferedReader.close();
        leitura.close();
    }
}
