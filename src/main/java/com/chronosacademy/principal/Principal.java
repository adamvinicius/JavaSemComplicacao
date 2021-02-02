package com.chronosacademy.principal;

import com.chronosacademy.logica.HelloWorld;

public class Principal {

		
	public static void main(String[] args) {
		
		HelloWorld hello = new HelloWorld();
		hello.setHello("Hello World");
		
		System.out.println(hello.getHello());
		
		System.out.println(hello.getNumero());
		
		hello = new HelloWorld("Bom dia", 10);
		
		System.out.println(hello.getHello());
		
		System.out.println(hello.getNumero());
		
		hello = new HelloWorld("Bom dia");
		
		System.out.println(hello.getHello());
		
		System.out.println(hello.getNumero());
		
	}

	
	
	
	
	
	

}
