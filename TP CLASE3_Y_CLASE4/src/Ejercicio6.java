import java.util.Scanner;

/*
 * Declare dos variables de tipo flotante, asigne un valor a 
 * cada una, calcule el promedio y muestrelo por consola.
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado =  new Scanner(System.in);
		
		System.out.print("Ingrese un valor (separador decimal \",\"): ");
		float valor1 = teclado.nextFloat();
		
		System.out.print("Ingrese un valor (separador decimal \",\"): ");
		float valor2 = teclado.nextFloat();
		
		float promedio;
		promedio = (valor1 + valor2)/2;
		System.out.print("PROMEDIO es:" +promedio);
	}

}
