import java.util.Scanner;

/*
 * Dado un numero natural n mostrar sus digitos indivudualmente.
 */
public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingresar un nro natural (>0):");
		int numero = teclado.nextInt();
		while(numero>0) {
			System.out.println(numero%10);
			numero = numero/10;
		}
	}

}
