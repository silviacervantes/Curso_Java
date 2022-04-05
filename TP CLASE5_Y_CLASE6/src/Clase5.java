import java.lang.reflect.Array;
import java.util.Scanner;

public class Clase5 {
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
	}
*/	
	/*
	 * Crear un array de 10 de números enteros, con valores solicitados por 
	 * teclado. Mostrar por consola el índice y el valor de cada elemento. 
	 * Realizar dos métodos, uno para el ingreso de datos y otro para la salida 
	 * de datos.
	 */
	public static void main(String[] args) {
		int[]array = new int[10];
		crear_array();
		mostrar_array();
		
	}
	public static void crear_array() {
		Scanner teclado  = new Scanner(System.in);
		for (int i=0; i< Array.getLength(array);i++ ) {
			array[i] = teclado.nextInt();
		}
	}
	
	public static void mostrar_array() {
		for (i=0; i < Array.getLength(array);i++) {
			System.out.println(array[i]);
		}
	}
	
}
