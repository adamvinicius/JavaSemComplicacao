package com.br.chronosacademy.findMovies;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlataformaTest {

	@Test
	public void testConstrutorAtivo() {
		Plataforma netflix = new Plataforma("Netflix", "www.netflix.com", 45.90, 300000000L);
		boolean ativo = netflix.isAtivo();
		assertTrue(ativo);
	}
	
	@Test
	public void testGettersSetters() {
		Plataforma disneyPlus = new Plataforma();
		disneyPlus.setAtivo(false);
		disneyPlus.setNome("Disney+");
		disneyPlus.setQtdAssinantes(3000000000L);
		disneyPlus.setUrl("www.disney.com");
		disneyPlus.setValor(25.90);
		
		assertFalse(disneyPlus.isAtivo());
		assertEquals("Disney+", disneyPlus.getNome());
		assertEquals(3000000000L, disneyPlus.getQtdAssinantes());
		assertEquals("www.disney.com", disneyPlus.getUrl());
		assertEquals(25.90, disneyPlus.getValor());
		
		
	}

}
