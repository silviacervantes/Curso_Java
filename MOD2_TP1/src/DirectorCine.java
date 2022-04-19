/*
 * Crea una clase DirectorCine con los atributos nombre (String), apellido(String)
 *  y edad (int). Crea los métodos get y set para los atributos. Crea el método 
 *  constructor que tenga como parámetros cada uno de sus atributos. 
 */
public class DirectorCine {
	String nombre;
	String apellido;
	int edad;
	
	public DirectorCine() {
		// TODO Auto-generated constructor stub
	}
	public DirectorCine(String n, String a, int e) {
		this.nombre=n;
		this.apellido=a;
		this.edad=e;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setNombre(String n) {
		this.nombre=n;
	}
	public void setApellido(String a) {
		this.apellido=a;
	}
	public void setEdad(String e) {
		this.edad=e;
	}
}
