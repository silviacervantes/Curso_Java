import java.util.Scanner;

/*
 * Dado un natural K. Generar y mostrar todos los numeros enteros pares 
 * comprendidos en el intervalos [-K,K]. Considerar K mayor que 1.
 */

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingresar un nro natural (>0):");
		int numero = teclado.nextInt();
		
/*		for(int i=numero; i>0;i--) {
			if((i%2)==0) {
				System.out.println(-i);
			}
		}
		for(int i=1; i<numero;i++) {
			if((i%2)==0) {
				System.out.println(i);
			}
		}
*/
		for(int i=-numero; i<=numero;i++) {
			if((i%2)==0 && (i!=0)) {
				System.out.println(i);
			}
		}
		
	}

}
