
public class Cuenta {
	private String titular;
	private double cantidad;
	
	public Cuenta(String nombre) {
		this.titular = nombre;
	}
	public Cuenta(String nombre, double cant) {
		this.titular = nombre;
		this.cantidad = cant;
	}
	
	public void mostrar() {
		System.out.println("Titular: "+this.titular);
		System.out.println("Cantidad: "+this.cantidad);
	}
	public void ingresar(double cant) {
		this.cantidad = this.cantidad + cant;
	}
	public void retirar(double cant) {
		this.cantidad = this.cantidad - cant;
	}
}
