import java.util.Scanner;

/*
 * Declarar dos variables de tipo entero, asignar un valor y 
 * mostrarla por pantalla.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Ingrese 1er valor: ");
		int valor1= teclado.nextInt();

		System.out.print("Ingrese 2do valor: ");
		int valor2= teclado.nextInt();

		System.out.println("Primer valor es: "+valor1);
		System.out.println("Segundo valor es: "+valor2);
	}

}
