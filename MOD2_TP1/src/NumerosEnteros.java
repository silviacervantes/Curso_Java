/*
 * Crear una clase NumerosEnteros y redefinir las operaciones elementales 
 * (+, -, *, /).Esta clase tendr� los m�todos suma (), resta(), multiplicaci�n() 
 * y divisi�n() que recibir�n como par�metros otro objeto de la misma clase 
 * NumerosEnteros.
 */
public class NumerosEnteros {
	private int nro;
	private int resultado;
	public NumerosEnteros() {
		// TODO Auto-generated constructor stub
	}
	public NumerosEnteros(int x) {
		this.nro = x;
	}
	public void suma(NumerosEnteros entero1) {
		this.resultado = this.nro+entero1.nro;
		System.out.println("SUMA: "+this.resultado);
	}
	public void resta(NumerosEnteros entero1) {
		this.resultado = this.nro-entero1.nro;
		System.out.println("RESTA: "+this.resultado);
	}
	public void multiplicacion(NumerosEnteros entero1) {
		this.resultado = this.nro*entero1.nro;
		System.out.println("MULTIPLICACION: "+this.resultado);
	}
	public void division(NumerosEnteros entero1) {
		this.resultado = this.nro/entero1.nro;
		System.out.println("DIVISION: "+this.resultado);
	}

}
