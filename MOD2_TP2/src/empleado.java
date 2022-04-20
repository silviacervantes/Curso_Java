public class empleado extends persona{
	private double sueldoBasico;
	public empleado() {
		
	}
	public empleado(String nombre,String apellido,int dni,String domicilio,double sbas) {
		super(nombre,apellido,dni,domicilio);
		this.sueldoBasico = sbas;
	}
	public double calculoSueldo(double horas) {
		return this.sueldoBasico * horas;
	}
	
	public void verEmpleado() {
		super.verPesona();
		System.out.println( "Sueldo: " + this.sueldoBasico);
	}
}
