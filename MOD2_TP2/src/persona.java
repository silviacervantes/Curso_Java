/*
 * Crear una clase llamada Persona con los atributos: Nombre, Apellido, DNI, 
 * Domicilio.Con los métodos: Constructor y un método que permita mostrar la 
 * información de la persona.
 */

public class persona {
	private String nombre;
	private String apellido;
	private int dni; 
	private String domicilio;
	public persona() {
		
	}
	public persona(String n, String a, int dni, String d ) {
		this.nombre = n;
		this.apellido = a;
		this.dni = dni;
		this.domicilio = d;
	}
	public void verPesona() {
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Apellido: "+this.apellido);
		System.out.println("DNI: "+this.dni);
		System.out.println("Domicilio: "+this.domicilio);
	}
	

}
