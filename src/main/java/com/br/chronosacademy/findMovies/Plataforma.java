package com.br.chronosacademy.findMovies;

import java.util.ArrayList;
import java.util.List;

public class Plataforma {

	private String nome;
	private String url;
	private boolean ativo = true;
	private double valor;
	private Long qtdAssinantes;
	private List<Filme> filmes = new ArrayList<>();

	
	
	@Override
	public String toString() {
		return "Plataforma [nome=" + nome + ", url=" + url + ", ativo=" + ativo + ", valor=" + valor
				+ ", qtdAssinantes=" + qtdAssinantes + ", filmes=" + filmes + "]";
	}

	public Plataforma(String nome, String url, double valor, Long qtdAssinantes) {
		this.nome = nome;
		this.url = url;
		this.valor = valor;
		this.qtdAssinantes = qtdAssinantes;
	}
	
	public Plataforma() {
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public boolean isAtivo() {
		return ativo;
	}


	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public Long getQtdAssinantes() {
		return qtdAssinantes;
	}


	public void setQtdAssinantes(Long qtdAssinantes) {
		this.qtdAssinantes = qtdAssinantes;
	}

	public List<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}
	
	
	
	
}
