import java.util.Scanner;

/*
 * Declare dos variables base y altura,que representan la base 
 * y la altura de un triangulo.Asigne un valor cualquiera a cada 
 * una y muestre la superficie del mismo.
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in); 
		
		System.out.print("Ingrese base: ");
		int base = teclado.nextInt();
		
		System.out.print("Ingrese altura: ");
		int altura = teclado.nextInt();
		
		System.out.print("La superficie del triangulo es: "+ (base*altura/2));
	}

}
