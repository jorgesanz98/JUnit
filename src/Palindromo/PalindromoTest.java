package Palindromo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Palindromo.Palindromo.palindromo;

class PalindromoTest {

	@Test
	void test() 
	{
		Palindromo p1 = new Palindromo();
		try {
		if(p1.palindromo("Arroz"))
			System.out.println("Es un palindromo");
		else
			System.out.println("No es un palindromo");
		}
		catch (Exception e) {fail();}
		
		Palindromo p2 = new Palindromo();
		try {
		if(p2.palindromo("abba"))
			System.out.println("Es un palindromo");
		else
			System.out.println("No es un palindromo");
		}
		catch (Exception e) {fail();}
		
	}

}
