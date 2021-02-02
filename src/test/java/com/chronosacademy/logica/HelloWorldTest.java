package com.chronosacademy.logica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void test() {
		System.out.println("inicio");
		fail("Not yet implemented");
		
		System.out.println("teste");
	}
	
	@Test
	void test2() throws Exception {
		System.out.println("inicio");
		throw new Exception("Deu ruim!!");
		
		//System.out.println("teste");
	}
	
	@Test
	public void testHelloComValor() {
		HelloWorld hello = new HelloWorld();
		hello.setHello("Hello World");
		
		assertEquals("Hello World", hello.getHello());
	}
	
	@Test
	public void testHelloNulo() {
		HelloWorld hello = new HelloWorld();
		assertEquals(null, hello.getHello());
	}

}
