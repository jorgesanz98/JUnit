package CirculoExamen;

import java.lang.Math;

/**
 * Esta clase utiliza el objeto circulo,que tiene un centro en las cordenadas x,y y un radio,
 * en la clase podemos observar distintos metodos para operar con el objeto.
 * @author alumno
 * @version Esta es la segunda version del ejercicio
 * @since 05/02/2020
 */

public class Circulo {
	//Datos
	double centroX;
	double centroY;
	double radio;
	
	/**
	 * Este metodo es el constructor de la clase
	 * @param cx Se refiere al dato centroX de la clase Circulo
	 * @param cy Se refiere al dato centroY de la clase Circulo
	 * @param r Se refiere al dato radio de la clase Circulo
	 */

	public Circulo(double cx, double cy, double r) {
		centroX = cx;
		centroY = cy;
		radio = r;
	}
	
	/**
	 * Este metodo calcula el perimetro del circulo,hemos cambiado la formula utilizando la clase math.lang,
	 * que nos ayuda con las formulas como obtener PI.
	 * @return devuelve un dato de tipo double que es el perimetro
	 */

	public double getCircunferencia() {
		return 2*(Math.PI*radio);
	}

	/**
	 * Este metodo calcula el area del circulo,hemos cambiado la formula utilizando la clase math.lang,
	 * que nos ayuda con las formulas como elevar al cuadrado o incluso obtener PI.
	 * @return devuelve un dato de tipo double que es el area
	 */
	
	public double getArea() {
		return Math.PI * Math.pow(radio,2);
	}

	/**
	 * Este metodo calcula el diametro del circulo
	 * @return devuelve un dato de tipo double que es el diametro cel circulo
	 */
	
	public double getDiametro() {
		return 2 * radio;
	}

	/**
	 * Este metodo mueve el centro del circulo introduciendo los siguientes parametros
	 * @param deltaX es el dato de la distancia que deseas mover el punto X,
	 * por lo tanto se sumara o restara al punto anterior que ya habia en X
	 * @param deltaY es el dato de la distancia que deseas mover el punto Y,
	 * por lo tanto se sumara o restara al punto anterior que ya habia en Y
	 */
	
	public void mover(double deltaX, double deltaY) {
		centroX = centroX + deltaX;
		centroY = centroY + deltaY;
	}

	/**
	 * Este metodo lo que hace es aunmentar o disminuir el radio del circulo,
	 * haciendo asi que sea mas grande o mas pequeño
	 * @param s es el dato por el que se multiplica el radio para escalar
	 */
	
	public void escalar(double s) {
		radio = radio * s;
	}
}
