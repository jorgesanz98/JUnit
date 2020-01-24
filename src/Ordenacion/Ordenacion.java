package Ordenacion;

import java.util.Scanner;

public class Ordenacion 
{
	public Ordenacion()
	{	
	}
	int num1;
	int num2;
	int num3;
	public static void ordenacion3(int num1,int num2,int num3)
	{
		/*Scanner entrada = new Scanner(System.in);
		 * System.out.println("Numero 1:");
		 * int num1 = entrada.nextInt();
		System.out.println("Numero 2:");
		int num2 = entrada.nextInt();
		System.out.println("Numero 3:");
		int num3 = entrada.nextInt();
		 */
		
		String resultado="";
		
		if(num1>num2 && num2>num3)
			resultado = num1+">"+num2+">"+num3;
		else if(num1>num3 && num3>num2)
			resultado = num1+">"+num3+">"+num2;
		else if(num2>num3 && num3>num1)
			resultado = num2+">"+num3+">"+num1;
		else if(num2>num1 && num1>num3)
			resultado = num2+">"+num1+">"+num3;
		else if(num3>num2 && num2>num1)
			resultado = num3+">"+num2+">"+num1;
		else if(num3>num1 && num1>num2)
			resultado = num3+">"+num1+">"+num2;	
		
		System.out.println(resultado);
	}
}
