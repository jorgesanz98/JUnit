package javadoc;

import java.util.Scanner;

import agendalistas.ContactoLista;
/**
 * Esto es un sistema de cuentas de un banco
 * @author alumno
 * @version numero1
 * @since 05/01/2020
 */
public class Banco 
{
	//Atributos o miembros dato
	Cuenta array[];
	int numElem;
	
	//Constructor
	public Banco()
	{
		numElem = 0;
		array = new Cuenta[numElem];
	}
	//////////////////////////////////////////////////////
	
	/**
	 * Este metodo introduce un elemento mas al array
	 * @param aux
	 */
	
	public void unElementoMas(Cuenta aux[])
	{
		array = new Cuenta[numElem + 1];
		for(int i = 0; i < numElem;i++)
		{
			array[i]=aux[i];
		}
		numElem++;
	}
	//////////////////////////////////////////////////////
	
	/**
	 * Este metodo inserta una cuenta en una posicion,
	 * comprobando antes si es valida.
	 * @param pos
	 * @param cuenta
	 */
	
	public void insertarEn(int pos, Cuenta cuenta)
	{
		if(pos >= 0 && pos<numElem)
		{
			array[pos]= cuenta;
		}
		else
			System.out.println("Posicion no valida");
	}
	//////////////////////////////////////////////////////
	
	/**
	 * Este metodo elimina un elemento del array
	 * @param aux
	 */
	
	public void unElementoMenos(Cuenta aux[])
	{
		array = new Cuenta[numElem - 1];
		int k=0;
		for(int i = 0; i < numElem;i++)
		{
			if(aux[i] != null)
			{
				array[k]= aux[i];
				k++;
			}
		}
		numElem--;
	}
	//////////////////////////////////////////////////////
	
	/**
	 * Este metodo marca un elemento del array,
	 * que posteriormente elimina con el metodo unElementoMenos 
	 * @param posicion
	 * @return
	 */
	
	public boolean marcar(int posicion)
	{
		array[posicion]=null;
		unElementoMenos(array);
		return true;
	}
	//////////////////////////////////////////////////////
	
	/**
	 * Este metodo comprueba si el numero de elementos del array es igual a 0,
	 * y devuelve un boolean true
	 * @return
	 */
	
	public boolean noHayCuenta()
	{
		return (numElem==0);
	}
	//////////////////////////////////////////////////////
	
	/**
	 * Este metodo imprime en pantalla un menu principal,
	 * en el que se pide la opcion que se desea ejecutar,
	 * devolviendo asi un valor de un numero entero
	 * @return
	 */
	
	public int verMenu()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("-------------------------------------");
		System.out.println("BIENVENIDO A LA CAIXA");
		System.out.println("-------------------------------------");
		System.out.println("[1]-CONSULTAR SALDO");
		System.out.println("[2]-INGRESO");
		System.out.println("[3]-REINTEGRO");
		System.out.println("[4]-ALTAS");
		System.out.println("[5]-BAJAS");
		System.out.println("[6]-MANTENIMIENTO");
		System.out.println("[7]-SALIR");
		System.out.println("Elige una opcion:");
		System.out.println("-------------------------------------");
		boolean opcionValida;
		int opcion;
		do{		
			opcion = sc.nextInt();
			opcionValida=(opcion>0 && opcion<8);
			if(!opcionValida)
			{
				System.out.println("Error,elige una opcion valida:");
			}
		}while (!opcionValida);
		return opcion;
	}
	//////////////////////////////////////////////////////
	
	/**
	 * Este metodo imprime en pantalla el tipo de cuenta que queremos dar de alta
	 * @return
	 */
	
	public int menuTipoDeCuenta()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("-------------------------------------");
		System.out.println("ELIGE EL TIPO DE CUENTA: ");
		System.out.println("-------------------------------------");
		System.out.println("[1]-CUENTA AHORRO");
		System.out.println("[2]-CUENTA CORRIENTE");
		System.out.println("[3]-CUENTA CORRIENTE CON INTERESES");
		System.out.println("Elige una opcion:");
		System.out.println("-------------------------------------");
		boolean opcionValida;
		int opcion;
		do{		
			opcion = sc.nextInt();
			opcionValida=(opcion>0 && opcion<4);
			if(!opcionValida)
			{
				System.out.println("Error,elige una opcion valida:");
			}
		}while (!opcionValida);
		return opcion;
	}
	//////////////////////////////////////////////////////
	
	/**
	 * En este metodo hacemos una busqueda comparando elemento a elemento,
	 * si lo encuentra devuelve la posicion de este,
	 * sino devuelve un -1
	 * @param cuenta
	 * @return
	 */
	
	public int busquedaSecuencial(Cuenta cuenta)
	{
		for(int i=0;i<numElem;i++)
		{
			if((cuenta.getNumCuenta()).equals(array[i].getNumCuenta()))
			{
				return i;
			}
		}
		return -1;
	}
	//////////////////////////////////////////////////////
	
	/**
	 * Este metodo es donde arranca la apliacion,
	 * contiene otros metodos como el de ver menu y
	 * otros que realizan operaciones
	 */
	
	public void arrancaAplicacion()
	{
		boolean salir=false;
		do {
			int opcion=verMenu();
			salir=(opcion==7);
			if(!salir)
			{
				switch (opcion) 
				{
				case 1: 
					visualizarCuenta();
					break;
				case 2: 
					ingreso();
					break;
				case 3: 
					reintegro();
					break;
				case 4:
					nuevaCuenta();
					break;
				case 5: 
					eliminarCuenta();
					break;
				case 6:
					mantenimiento();
					break;
				}
			}
			else
				System.out.println("Hasta la proxima!");
		}while(!salir);
	}
	//////////////////////////////////////////////////////
	
	/**
	 * ESte metodo visualizar la cuenta elegida,
	 * comparando el numero de cuenta de cada elemento con el numero de cuenta buscado
	 */
	
	public void visualizarCuenta()
	{
		boolean encontrado=false;
		Scanner sc=new Scanner(System.in);
		if(noHayCuenta())
			System.err.println("No hay ninguna cuenta");
		else
		{
			System.out.println("Numero de cuenta:");
			String numCuentaBuscado=sc.nextLine();
			for(int i=0;i<numElem;i++)
			{
				encontrado=(numCuentaBuscado.equals(array[i].getNumCuenta()));
				if(encontrado)
				{
					System.out.println("-------------------------------------");
					System.out.println("***Cuenta***\n"+array[i].mostrarDatos());
					System.out.println("-------------------------------------");
					encontrado=true;
				}
			}
			if(!encontrado)
			{
				System.out.println("-------------------------------------");
				System.out.println("Cuenta no encontrada");
				System.out.println("-------------------------------------");
			}
		}	
	}
	//////////////////////////////////////////////////////
	
	/**
	 * Este metodo sirve para crear cuentas,
	 * te pide los datos que tienen en comun y dependiendo de la opcion elegida
	 * te devuelve el tipo de cuenta creada
	 * @return Una nueva cuenta con los datos elegidos
	 */
	
	public Cuenta introDatosCuenta()
	{
		Cuenta cuenta = null;
		int opcion=menuTipoDeCuenta();
		Scanner sc=new Scanner(System.in);
		System.out.println("***Introduzca los datos***");
		System.out.println("Nombre del titular: ");
		String nombreTitular=sc.nextLine();
		System.out.println("Numero de Cuenta: ");
		String numCuenta=sc.nextLine();
		System.out.println("Saldo: ");
		double saldo=sc.nextDouble();
		double tipoDeInteres;
		if(opcion==1)
		{
			tipoDeInteres=0.01;
			double cuotaMantenimiento=10;
			cuenta = new CuentaAhorro(nombreTitular, numCuenta, saldo, tipoDeInteres, cuotaMantenimiento);
		}
		else
		{
			double importePorTrans;
			int transExentas;
			if(opcion==2)
			{
				tipoDeInteres=0.002;
				importePorTrans=3;
				transExentas=5;
				cuenta = new CuentaCorriente(nombreTitular, numCuenta, saldo, tipoDeInteres, importePorTrans, transExentas);
			}
			else if(opcion==3)
			{
				tipoDeInteres=3.5;
				importePorTrans=30;
				transExentas=5;
				cuenta = new CuentaCorrienteConIn(nombreTitular, numCuenta, saldo, tipoDeInteres, importePorTrans, transExentas);
			}
		}
		return cuenta;
	}
	//////////////////////////////////////////////////////
	
	/**
	 * Este metodo crea la cuenta con los datos recogidos en introDatos,
	 * anade un elemento al array, y antes de anadirla comprueba si la cuenta
	 * ya existia previamente
	 */
	
	public void nuevaCuenta()
	{
		Cuenta cuenta=introDatosCuenta();
		int posicion = busquedaSecuencial(cuenta);
		boolean existe = (posicion!=-1);
		if(existe)
			System.err.println("Cuenta ya existente");
		else
			anadirCuenta(cuenta);
	}
	//////////////////////////////////////////////////////
	
	/**
	 * Este metodo crea un elemento al array
	 * y lo inserta en la posicion indicada
	 * @param cuenta
	 */
	
	public void anadirCuenta(Cuenta cuenta)
	{
		unElementoMas(array);
		insertarEn(numElem-1,cuenta);
	}
	//////////////////////////////////////////////////////
	
	/**
	 * Este metodo comprueba si existe una cuenta,si existe una cuenta y el numero de cuenta coincide,
	 * pide una cantidad por teclado y con la funcion de ingrseo de la clase cuenta se suma la cantidad
	 * al saldo
	 */
	
	public void ingreso()
	{
		boolean cuentaEncontrada=false;
		Scanner sc=new Scanner(System.in);
		if(noHayCuenta())
			System.err.println("***No hay ninguna cuenta***");
		else
		{
			System.out.println("Numero de cuenta:");
			String numCuentaBuscado=sc.nextLine();
			for(int i=0;i<numElem;i++)
			{
				if(numCuentaBuscado.equals(array[i].getNumCuenta()))
				{
					cuentaEncontrada=true;
					System.out.println("Introduce la cantidad a ingresar:");
					double cantidad=sc.nextDouble();
					array[i].ingreso(cantidad);
				}
			}
			if(!cuentaEncontrada)
			{
				System.out.println("-------------------------------------");
				System.err.println("***Cuenta no encontrada***");	
				System.out.println("-------------------------------------");
			}
		}	
	}
	//////////////////////////////////////////////////////
	
	/**
	 * Este metodo comprueba si existe una cuenta,si existe una cuenta y el numero de cuenta coincide,
	 * pide una cantidad por teclado y con la funcion de reintegro de la clase cuenta se retira la cantidad
	 * al saldo
	 */
	
	public void reintegro()
	{
		boolean cuentaEncontrada=false;
		Scanner sc=new Scanner(System.in);
		if(noHayCuenta())
			System.err.println("***No hay ninguna cuenta***");
		else
		{
			System.out.println("Numero de cuenta:");
			String numCuentaBuscado=sc.nextLine();
			for(int i=0;i<numElem;i++)
			{
				if(numCuentaBuscado.equals(array[i].getNumCuenta()))
				{
					cuentaEncontrada=true;
					System.out.println("Introduce la cantidad a retirar:");
					double cantidad=sc.nextDouble();
					array[i].reintegro(cantidad);
				}
			}
			if(!cuentaEncontrada)
			{
				System.out.println("-------------------------------------");
				System.err.println("***Cuenta no encontrada***");	
				System.out.println("-------------------------------------");
			}
		}	
	}
	//////////////////////////////////////////////////////
	
	/**
	 * Este metodo comprueba si hay cuenta o no,en caso de que haya cuenta y coincida con la cuenta buscada,
	 * se llama al metodo marcar previamente creado que elimina la cuenta del array. 
	 */
	
	public void eliminarCuenta()
	{
		boolean encontrado=false;
		Scanner sc=new Scanner(System.in);
		if(noHayCuenta())
			System.err.println("No hay ninguna cuenta");
		else
		{
			System.out.println("Numero de cuenta:");
			String numCuentaBuscado=sc.nextLine();
			for(int i=0;i<numElem;i++)
			{
				encontrado=(numCuentaBuscado.equals(array[i].getNumCuenta()));
				if(encontrado)
				{
					if(marcar(i))
						System.out.println("Cuenta eliminada");
					encontrado=true;
				}
			}
			if(!encontrado)
			{
				System.out.println("Cuenta no encontrada");
			}
		}	
	}
	//////////////////////////////////////////////////////
	
	/**
	 * Este metodo calcula los intereses y comisiones de la cuenta elegida
	 */
	
	public void mantenimiento()
	{
		boolean encontrado=false;
		Scanner sc=new Scanner(System.in);
		if(noHayCuenta())
			System.err.println("No hay ninguna cuenta");
		else
		{
			System.out.println("Numero de cuenta:");
			String numCuentaBuscado=sc.nextLine();
			for(int i=0;i<numElem;i++)
			{
				encontrado=(numCuentaBuscado.equals(array[i].getNumCuenta()));
				if(encontrado)
				{
					encontrado=true;
					array[i].comision();
					System.out.println(array[i].interes());
				}
			}
			if(!encontrado)
			{
				System.out.println("Cuenta no encontrada");
			}
		}
	}
}
	