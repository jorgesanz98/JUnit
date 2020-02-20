package javadoc;

/**
 * Importamos el metodo scanner
 */

import java.util.Scanner;

/**
 * Este codigo es una calculadora,en la que puedes elegir una opcion,
 * despues te pide los numeros y realiza la operacion
 * @author Jorge Sanz
 * @version 1
 * @since 10/12/20109
 *
 */

public class CalculadoraModular 
{
	/**
	 * Iniciamos la aplicacion desde el metodo main
	 * @param args Es un metodo estatico
	 */
	public static void main(String[] args) 
	{
		boolean salir=false;//Ponemos salir a false para que entre en el bucle
		do {
			int opcion=verMenu();//Creamos la opcion enlazandolo con el metodo ver menu,que devuelve un int
			if(opcion==5)//Enlazamos la opcion 5 con salir a true para salir del bucle y no realizar ninguna operacion
			{
				salir=true;//Ponemos salir a true para salir del bucle
				System.out.println("Fin de programa");
			}
			else
				hacerOperaciones(opcion);//Si es otra opcion realizara la operacion indicada
		}while(!salir);
	}
	
	/**
	 * Este metodo imprime el menu en pantalla,
	 * y pide al usuario una opcion,esta la valida por si no es correcta
	 * @return un entero que es la opcion que llevara a cabo la operacion elegida
	 */
	
	public static int verMenu()
	{
		//imprime el menu en pantalla
		Scanner entrada = new Scanner(System.in);
		int opcion;
		System.out.println("MENU DE CALCULADORA");
		System.out.println("[1]-Suma");
		System.out.println("[2]-Resta");
		System.out.println("[3]-Multiplicacion");
		System.out.println("[4]-Division");
		System.out.println("[5]-Salir");
		System.out.println("Elige una opcion:");
		//valida la opcion,si no es valida vuelve a pedirla
		do{		
			opcion = entrada.nextInt();
			if(opcion < 1 || opcion > 5)
			{
				System.out.println("Error,elige una opcion valida:");
				opcion = entrada.nextInt();
			}
		}while (opcion < 1 || opcion > 5);
		//devuelve la opcion
		return opcion;
	}
	
	/**
	 * Recoge la opcion elegida,
	 * pide los numeros y si la opcion es una division y coincide el segundo numero con 0 lo vuelve a pedir,
	 * mediante un switch manda los numeros introducidos al metodo correspondiente
	 * y luego mientras el metodo verResultado imprime en pantalla el resultado de la operacion
	 * @param opcion es el entero recogido en el metodo verMenu y se utiliza para realizar la opcion elegida medinate el switch
	 */
	
	public static void hacerOperaciones(int opcion)
	{
		//introduce los numeros
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime los numeros");
		double num1 = entrada.nextFloat();
		double num2 = entrada.nextFloat();
		//si la opcion es una division y coincide el segundo numero con 0 lo vuelve a pedir
		while (opcion == 4 && num2 ==0) 
		{
			System.out.println("El segundo numero no puede ser 0,prueba otro");
			num2 = entrada.nextFloat();
		}
		//establece el resultado en 0
		double resultado=0;
		//realiza la operacion elegida
		switch (opcion)
		{
		//cambia el resultado por los datos que devuelve la opercion elegida
		case 1:resultado=hacerSuma(num1,num2);
			break;                                                                                       
		case 2:resultado=hacerResta(num1,num2);
			break;
		case 3:resultado=hacerMultiplicacion(num1,num2);
			break;
		case 4:resultado=hacerDivision(num1,num2);
			break;
		}
		//enseña en pantalla el resultado
		verResultado(resultado);
	}
	
	/**
	 * se pasa los numeros introducidos y realiza la operacion de suma,devolviendo el resultado
	 * @param num1 Primer numero introducido en el metodo hacer operaciones
	 * @param num2 Segundo numero introducido en el metodo hacer operaciones
	 * @return la suma del primer y segundo numero
	 */
	
	public static double hacerSuma(double num1,double num2)
	{
		return num1 + num2;
	}
	
	/**
	 * se pasa los numeros introducidos y realiza la operacion de resta,devolviendo el resultado
	 * @param num1 Primer numero introducido en el metodo hacer operaciones
	 * @param num2 Segundo numero introducido en el metodo hacer operaciones
	 * @return la resta del primer y segundo numero
	 */
	
	public static double hacerResta(double num1,double num2)
	{
		return num1 - num2;
	}
	
	/**
	 * se pasa los numeros introducidos y realiza la operacion de multiplicacion,devolviendo el resultado
	 * @param num1 Primer numero introducido en el metodo hacer operaciones
	 * @param num2 Segundo numero introducido en el metodo hacer operaciones
	 * @return la multiplicacion del primer y segundo numero
	 */
	
	public static double hacerMultiplicacion(double num1,double num2)
	{
		return num1 * num2;
	}
	
	/**
	 * se pasa los numeros introducidos y realiza la operacion de division,devolviendo el resultado
	 * @param num1 Primer numero introducido en el metodo hacer operaciones
	 * @param num2 Segundo numero introducido en el metodo hacer operaciones
	 * @return la division del primer y segundo numero
	 */
	
	public static double hacerDivision(double num1,double num2)
	{
		return num1 / num2;
	}
	
	/**
	 * se le pasa el resultado del metodo hacerOperaciones y lo imprime en pantalla con un syso
	 * @param resultado es el dato obtenido de la operacion realizada
	 */
	
	public static void verResultado(double resultado)
	{
		System.out.println(resultado);
	}
}
