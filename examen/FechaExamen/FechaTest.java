package FechaExamen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FechaTest {

	@Test
	void testGetFechaConFormato() 
	{
		Fecha fecha = new Fecha();
		System.out.println(fecha.getFechaConFormato(1));
	}
	@Test
	void testGetFechaConFormato2()
	{
		Fecha fecha = new Fecha();
		System.out.println(fecha.getFechaConFormato(2));
	}
	@Test
	void testGetFechaConFormato3()
	{
		Fecha fecha = new Fecha();
		System.out.println(fecha.getFechaConFormato(3));
	}
	@Test
	void testGetFechaConFormato4()
	{
		Fecha fecha = new Fecha();
		System.out.println(fecha.getFechaConFormato(4));
	}

}
