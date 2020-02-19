package javadoc;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CuentaCorriente extends Cuenta 
{
	private int transacciones;
	private double importePorTrans;
	private int transExentas;
	
	public CuentaCorriente(String nombreTitular, String numCuenta, double saldo, double tipoDeInteres, double importePorTrans, int transExentas) {
		super(nombreTitular, numCuenta, saldo, tipoDeInteres);
		transacciones = 0;
		this.importePorTrans = importePorTrans;
		this.transExentas = transExentas;
	}

	public int getTransacciones() 
	{
		return transacciones;
	}

	public void setTransacciones(int transacciones) 
	{
		this.transacciones = transacciones;
	}

	public double getImportePorTrans() 
	{
		return importePorTrans;
	}

	public void setImportePorTrans(double importePorTrans) 
	{
		this.importePorTrans = importePorTrans;
	}

	public int getTransExentas() 
	{
		return transExentas;
	}

	public void setTransExentas(int transExentas) 
	{
		this.transExentas = transExentas;
	}
	
	public int decrementarTransacciones()
	{
		return transacciones--;
	}

	public void ingreso(double cantidad) 
	{
		super.ingreso(cantidad);
		transacciones++;
	}
	
	public void reintegro(double cantidad) 
	{
		super.reintegro(cantidad);
		transacciones++;
	
	}
	
	public int getDiaMes() 
	{
		GregorianCalendar fecha = new GregorianCalendar();
		return fecha.get(Calendar.DAY_OF_MONTH);
	}
	
	public double interes() 
	{
		final int tramo300 = 300000;
		double cantidadIntereses = 0;
		if(getDiaMes()==1)
		{
			if(getSaldo() <= tramo300) 
			{
				cantidadIntereses = getSaldo()*0.005;
			}else 
			{
				cantidadIntereses = (getSaldo()-tramo300)*getTipoDeInteres() + (tramo300*0.005);
			}
			ingreso(cantidadIntereses);
		}
		return cantidadIntereses;
	}
	
	public void comision() 
	{
		double cuotaComision = 0;
		cuotaComision = (transacciones - transExentas)*importePorTrans;
		if(getDiaMes()==1) {
			reintegro(cuotaComision);
			transacciones = 0;
		}
		
	}

	public String mostrarDatos() 
	{
		return super.mostrarDatos() + "\nNúmero de transacciones: " + transacciones + "\nImporte por transacción: " + importePorTrans + "€\nTransacciones exentas: " + transExentas;
				
	}
	

}
