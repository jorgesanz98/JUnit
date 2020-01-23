package Contador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContadorTest {

	@Test
	void testContador1() 
	{
		int resultado;
		int x=1;
		int y=9;
		Contador ct1 = new Contador();
		resultado = ct1.contador1(x, y);
	}
	@Test
	void testContador2() 
	{
		int esperado=-1;
		int x=-1;
		int y=9;
		Contador ct2 = new Contador();
		int resultado = ct2.contador1(x, y);
		assertEquals(esperado, resultado);
	}
}
