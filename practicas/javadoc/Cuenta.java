package javadoc;

public abstract class Cuenta {
	private String nombreTitular;
	private String numCuenta;
	private double saldo;
	private double tipoDeInteres;
	
	public Cuenta() {
		
	}
	
	public Cuenta(String nombreTitular, String numCuenta, double saldo, double tipoDeInteres) {
		this.nombreTitular = nombreTitular;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.tipoDeInteres = tipoDeInteres;
	}
	
	public String getNombreTitular() {
		return nombreTitular;
	}
	
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}
	
	public String getNumCuenta() {
		return numCuenta;
	}
	
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	public void ingreso(double cantidad) {
		if(cantidad <= 0) {
			System.err.println("La canctidad tiene que ser mayor que 0");
			System.out.println("");
		}else {
			saldo += cantidad;
			System.out.println();
			System.out.println("***Ingreso realizado***");
		}
	}
	
	public void reintegro(double cantidad) {
		if(cantidad <= 0) {
			System.err.println("La canctidad tiene que ser mayor que 0");
			System.out.println("");
		}else if(cantidad > saldo){
			System.err.println("La cantidad supera el saldo");
			System.out.println("");
		}else {
			saldo -= cantidad;
			System.out.println("***Retirada realizada***");
		}
	
	}
	
	
	public double getTipoDeInteres() {
		return tipoDeInteres;
	}
	
	public void setTipoDeInteres(double tipoDeInteres) {
		this.tipoDeInteres = tipoDeInteres;
	}
	
	public String mostrarDatos() {
		return ("Titular: " + nombreTitular + "\nNúmero de cuenta: " + numCuenta + "\nSaldo: " + saldo + "€\nTipo de interés:" + tipoDeInteres + "%");
		
	}
	
	//metodos abstractos
	
	public abstract void comision();
	
	public abstract double interes();
}