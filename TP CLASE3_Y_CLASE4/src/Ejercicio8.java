/*
 * Calcular la cantidad de minutos que hay existen en una cantidad 
 * de segundos ingresada por el usuario.
 */

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);
		System.out.print("Ingrese una cantidad de segundos:");
		int valor1=teclado.nextInt();
		System.out.print ("Corresponde a "+(valor1/60)+" minutos" );
		//System.in.read();
	}

}
