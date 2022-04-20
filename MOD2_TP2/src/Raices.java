import java.lang.reflect.Array;

/*
 * obtenerRaices(): imprime las 2 posibles soluciones
● obtenerRaiz(): imprime una única raíz, que será cuando solo tenga una
solución posible.
● getDiscriminante(): devuelve el valor del discriminante (double), el
discriminante tiene la siguiente fórmula, (b^2)-4ac
● tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
● tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
● calcular(): mostrará por consola las posibles soluciones que tiene nuestra
ecuación, en caso de no existir solución, mostrarlo también.
Fórmula ecuación 2º grado: (-b±√((b^2)-(4ac)))/(2*a)
Solo varía el signo delante de -b
 */
public class Raices {
	private double a;
	private double b;
	private double c;
	
	public Raices() {
		
	}
	public Raices(int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public double getDiscriminante() {
		//(b*b)-(4*a*c))
		return (this.b*this.b)-(4*this.a*this.c);
	}
	public boolean tieneRaices() {
		if(this.getDiscriminante()>0) {
			return true;
		}else {
			return false;
		}
	}
	public boolean tieneRaiz() {
		if(this.getDiscriminante()==0) {
			return true;
		}else {
			return false;
		}

	}
	public double obtenerRaiz() {
		double resultado = 0;
		if(this.tieneRaiz()) {
			resultado = -this.b/(2*this.a);
		}
		return resultado;
	}
	
	public double [] obtenerRaices() {
		double [] resultado = new double[2];
		if(this.tieneRaices()) {
			resultado[0] = (-this.b+Math.sqrt(this.getDiscriminante()))/2*this.a;
			resultado[1] = (-this.b-Math.sqrt(this.getDiscriminante()))/2*this.a;
		}
		return resultado;
	}
	public void calcular() {
		//double[] resultado = new double[];
		if(this.tieneRaiz()) {
			System.out.println("Tiene unica solucion: "+this.obtenerRaiz());
		}
		if(this.tieneRaices()) {
			System.out.println("Raiz 1: "+this.obtenerRaices()[0]);
			System.out.println("Raiz 2: "+this.obtenerRaices()[1]);

		}
		if(!this.tieneRaiz()&&!this.tieneRaices()) {
			System.out.println("Raices imaginarias.");
		}
		
	}
	
}
