public static void main ejercicio1() {
	Persona pesona1 = new Persona("Silvia","Cervantes",28738569,"Mz 603C Casa9 Pereyra Rozas");
	persona1.


/*
 * Crear una clase llamada Persona con los atributos: Nombre, Apellido, DNI, 
 * Domicilio.Con los métodos: Constructor y un método que permita mostrar la 
 * información de la persona.

 */

public class Persona {
	//Atributos
	private String nombre;
	private String apellido;
	private double dni;
	private String domicilio;
	
	//METODOS
	//Constructor
	public Persona(String n, String a, double dni, String d) {
		this.nombre=n;
		this.apellido=a;
		this.dni=dni;
		this.domicilio=d;
	}
	//
	
	public mostrarInfo String() {
		return ( this.apellido+" "+this.nombre+" "+this.dni+" "+this.domicilio);
	}
	
}

}
