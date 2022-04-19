/* 
 * Crea una clase llamada Contador que contenga un único atributo entero 
 * llamado cont. La clase tendrá los siguientes constructores: 
 *  Constructor por defecto Constructor con parámetros para inicializar el 
 *  contador con un valor no negativo. Si el valor inicial que se recibe es 
 *  negativo el contador tomará el valor cero como valor inicial. Constructor 
 *  copia. Además de los métodos getter y setter, la clase contendrá los métodos: 
 *  incrementar: incrementa el contador en una unidad. decrementar:
 *  decrementa el contador en una unidad. El contador nunca podrá tener 
 *  un valor negativo. Si al decrementar se alcanza un valor negativo el 
 *  contador toma el valor cero.
 */
public class Contador {
	int cont;
	public Contador() {
		// TODO Auto-generated constructor stub
	}
	public Contador(int inicial) {
		if(inicial < 0) {
			this.cont = 0;
		}else {
			this.cont = inicial;
		}
	}
	public void copia(Contador contador1) {
		this.cont = contador1.cont;
	}
	public void set(int cont1) {
		this.cont = cont1;
	}
	public int get() {
		return this.cont;
	}
	public void incrementar() {
		this.cont++;
	}
	public void decrementar() {
		if(this.cont >0) {
			this.cont--;
		}
	}
}
