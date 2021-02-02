package com.br.chronosacademy.findMovies;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FilmeTest {

	@Test
	public void testInstanciaFilmes() {
		Filme divertidamente = new Filme("Divertidamente", 1.45, "livre");
		assertEquals("Divertidamente", divertidamente.getNome());
	}
	
	@Test
	public void testInstanciaSemDados() {
		Filme filme = new Filme();
		assertEquals(null, filme.getClassificacao());
		
	}

}
