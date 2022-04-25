import java.time.LocalDate;
import java.util.Date;

public class Producto {
	private String nombre;
	private double precio;
	private LocalDate vencimiento;
	public Producto() {
		
	}
	public Producto(String n, double p,LocalDate vto ) {
		this.nombre = n;
		this.precio = p;
		this.vencimiento = vto;
	}
	public void mostrarProducto() {
		System.out.println("Nombre:"+this.nombre);
		System.out.println("Precio:"+this.precio);
		System.out.println("Vencimiento:"+this.vencimiento);

	}
	public double getPrecio() {
		return this.precio;
	}
	public LocalDate getVencimiento() {
		return this.vencimiento;
	}
}
