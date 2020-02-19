package javadoc;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CuentaAhorro extends Cuenta{
	private double cuotaMantenimiento;
	
	public CuentaAhorro(String nombreTitular, String numCuenta, double saldo, double tipoDeInteres, double cuotaMantenimiento) {
		super(nombreTitular, numCuenta, saldo, tipoDeInteres);
		this.cuotaMantenimiento = cuotaMantenimiento;

	}
	
	public double getCuentaMantenimiento() {
		return cuotaMantenimiento;
	}

	public void setCuentaMantenimiento(double cuentaMantenimiento) {
		this.cuotaMantenimiento = cuentaMantenimiento;
	}
	
	public int getDiaMes() {
		GregorianCalendar fecha = new GregorianCalendar();
		return fecha.get(Calendar.DAY_OF_MONTH);
	}

	public double interes() {
		double cantidadDeIntereses = 0;
		if(getDiaMes()==1) {
			cantidadDeIntereses = (getSaldo()*getTipoDeInteres())/12;
			ingreso(cantidadDeIntereses);
		}
		return cantidadDeIntereses;
	}
	
	public void comision() {
		if(getDiaMes()==1) {
			reintegro(cuotaMantenimiento);
		}
		
	}

	public String mostrarDatos() {
		return super.mostrarDatos() + "\nCuota mantenimiento: " + cuotaMantenimiento;
		
	}
}
