package javadoc;

public class CuentaCorrienteConIn extends CuentaCorriente {
	

	public CuentaCorrienteConIn(String nombreTitular, String numCuenta, double saldo, double tipoDeInteres, double importePorTrans, int transExentas) {
		super(nombreTitular, numCuenta, saldo, tipoDeInteres, importePorTrans, transExentas);
		
	}
	
	public double intereses() 
	{
		int saldoMinimo = 300000;
		double cantidadIntereses = 0;
		if(getDiaMes()==1)
		{
			if(getSaldo() >= saldoMinimo) 
			{
				cantidadIntereses = getSaldo()*getTipoDeInteres();
			}
			ingreso(cantidadIntereses);
		}
		return cantidadIntereses;
	}
	
	
}
