import java.util.Scanner;

/*
 * Dado un numero k natural mayor a 10 mostrar todos los 
 * numeros primos que le anteceden. Por ejemplo si k=12 la 
 * salida sera {2,3,5,7,11}
 */

public class Ejercicio19 {

	public static boolean esprimo(int x) {
		boolean bandera = true;
		int i=2;
		while(i <= x/2) {
			if(x%i ==0) {
				bandera = false;
				i = x+1;
			}
			i=++i;
		}
		return bandera;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingresar numero natural mayor que 10:");
		int k = teclado.nextInt();
		
		//Primos que le anteceden
		System.out.println("Primos que le anteceden");
		for(int j=2;j<k;j++) {
			if( esprimo(j)) {
				System.out.println(j+" ");	
			}
						
			
		}
	}
}