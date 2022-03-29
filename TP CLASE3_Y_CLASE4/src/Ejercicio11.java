/*
 * Dado 3 numeros naturales que representan los lados de un 
 * triángulo, se pide determinar si el triángulo es Isosceles, 
 * Escaleno o Equilatero.
 */
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in); 
		
		System.out.print("Ingrese los lados del triangulo: ");
		int lado1 = teclado.nextInt();
		int lado2 = teclado.nextInt();
		int lado3 = teclado.nextInt();
		
		if((lado1==lado2) && (lado2==lado3)){
			System.out.print("El triangulo es equilatero");
		}	
		else {
		if ((lado1 == lado2 )||(lado1==lado3)||(lado2==lado3)) {
					System.out.print("El triangulo es isoceles");
				}else {
					System.out.print("El triangulo es escaleno");
				}
				
			}
		
	
	}

}
