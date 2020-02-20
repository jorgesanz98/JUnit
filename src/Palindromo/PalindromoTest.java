package Palindromo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Palindromo.Palindromo.palindromo;

class PalindromoTest {

	@Test
	void test() 
	{
		Palindromo p1 = new Palindromo();
		boolean resultado=(p1.palindromo("Arroz"));
		try {
		if(resultado)
			System.out.println("Es un palindromo");
		else
			System.out.println("No es un palindromo");
		}
		catch (Exception e) {fail();}
		boolean esperado=false;
		assertEquals(resultado,esperado);
		
		Palindromo p2 = new Palindromo();
		boolean resultado2=(p2.palindromo("abba"));
		try {
		if(resultado2)
			System.out.println("Es un palindromo");
		else
			System.out.println("No es un palindromo");
		}
		catch (Exception e) {fail();}
		boolean esperado2=true;
		assertEquals(resultado2,esperado2);
		
	}

}
