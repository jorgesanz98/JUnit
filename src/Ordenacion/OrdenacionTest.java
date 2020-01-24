package Ordenacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OrdenacionTest {

	@Test
	void test() 
	{
		Ordenacion od1 = new Ordenacion();
		od1.ordenacion3(3,2,1);
	}
	@Test
	void test1() 
	{
		Ordenacion od1 = new Ordenacion();
		od1.ordenacion3(3,1,2);
	}
	@Test
	void test2() 
	{
		Ordenacion od1 = new Ordenacion();
		od1.ordenacion3(1,3,2);
	}
	@Test
	void test3() 
	{
		Ordenacion od1 = new Ordenacion();
		od1.ordenacion3(2,3,1);
	}
	@Test
	void test4() 
	{
		Ordenacion od1 = new Ordenacion();
		od1.ordenacion3(1,2,3);
	}
	@Test
	void test5() 
	{
		Ordenacion od1 = new Ordenacion();
		od1.ordenacion3(2,1,3);
	}
}
