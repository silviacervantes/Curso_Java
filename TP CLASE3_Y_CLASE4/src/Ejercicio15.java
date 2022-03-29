import java.util.Scanner;

/*
 * Dado un numero natural N. Determinar si este es primo.
 */
public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		boolean bandera = true;
		System.out.print("Ingresar un nro natural (>0):");
		
		int numero = teclado.nextInt();
		int i=2;
		
		while(bandera && i<numero) {
			if(numero%i ==0) {
				bandera = false;
			}
			i=++i;
		}
		if(bandera) {
			System.out.print("Es PRIMO");
		}else {
			System.out.print("NO es PRIMO");
		}
		
	}

}
