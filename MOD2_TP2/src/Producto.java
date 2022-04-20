import java.util.Date;

public class Producto {
	private String nombre;
	private double precio;
	private Date vencimiento;
	public Producto() {
		
	}
	public Producto(String n, double p,Date vto ) {
		this.nombre = n;
		this.precio = p;
		this.vencimiento = vto;
	}

}
