package com.chronosacademy.logica;

public class HelloWorld {

	String hello;
	private Integer numero;
	
	public HelloWorld() {
		
	}
	
	public HelloWorld(String hello, Integer numero) {
		this.hello = hello;
		this.numero = numero;
	}
	
	public HelloWorld(String hello) {
		this.hello = hello;
	}
	

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String _hello) {
		hello = _hello;
	}
	
	
	
}
