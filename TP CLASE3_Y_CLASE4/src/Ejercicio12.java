import java.util.Scanner;

/*
 * Dada un lista con las edades de N deportistas, se necesita 
 * informar la edad promedio de los deportistas de la lista; 
 * cual es la menor y la mayor edad ingresada.
 */

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingresar la cantidad de deportistas: ");
		int cantidad = teclado.nextInt();
		int total = 0;
		System.out.println("Ingrese las edades ");
		for(int i=1; i<=cantidad;i++) {
			int edad = (int)(Math.random()*28);
			//int edad = teclado.nextInt();
			System.out.println(edad);
			total = total + edad;
		}
		System.out.print("El promedio de las edades es de: "+((float)total/cantidad));
		
	}

}
