package Contador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContadorTest {

	@Test
	void testContador1() 
	{
		int x=1;
		int y=9;
		Contador ct1 = new Contador();
		int resultado = Contador.contador1(x, y);
	}

}
