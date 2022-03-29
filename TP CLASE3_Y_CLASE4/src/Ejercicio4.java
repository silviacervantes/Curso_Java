import java.util.Scanner;

/*
 * Declarar dos variables, asignar un valor cualquiera y realizar 
 * las siguientes operaciones:
 * Mostrar la suma
 * Mostrar la multiplicacion
 * Mostrar la resta
 * Mostrar Division
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese 1er valor");
		int valor1 = teclado.nextInt();
		System.out.print("Ingrese 2do valor");
		int valor2 = teclado.nextInt();
		
		System.out.println("SUMA:" + (valor1+valor2));
		System.out.println("MULTIPLICACION:" + (valor1*valor2));
		System.out.println("DIVISION:" + (valor1/valor2));
		System.out.println("RESTA:" + (valor1-valor2));
	}

}
