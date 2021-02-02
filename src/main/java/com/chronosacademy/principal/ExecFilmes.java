package com.chronosacademy.principal;

import java.util.ArrayList;
import java.util.List;

import com.br.chronosacademy.findMovies.Filme;
import com.br.chronosacademy.findMovies.Plataforma;

public class ExecFilmes {

	public static void main(String[] args) {
		
		Plataforma netflix = new Plataforma("Netflix", "www.netflix.com", 45.90, 6000000L);
		
		Filme oPoco = new Filme("O Poço", 1.30, "+16");
		Filme birdBox = new Filme("Bird Box", 2.0, "+16");
		
		List<Filme> filmes = new ArrayList<>();
		
		filmes.add(oPoco);
		filmes.add(birdBox);
		
		netflix.setFilmes(filmes);
		
		System.out.println(netflix.toString());
		
		for(int i = 0; i < netflix.getFilmes().size(); i++) {
			String nomeFilme = netflix.getFilmes().get(i).getNome();
			System.out.println(nomeFilme);
		}

		for (Filme filme : netflix.getFilmes()) {
			String nomeFilme = filme.getNome();
			System.out.println(nomeFilme);
		}

	}

}
