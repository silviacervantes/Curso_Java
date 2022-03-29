import java.util.Scanner;

/*
 * Dado un numero natural N se desea conocer sus divisores y la suma 
 * de todos ellos. No considerar el 1 si mismo
 */
public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingresar un nro natural (>0):");
		int numero = teclado.nextInt();
		int suma = 0;
		for(int i=2;i<=numero;i++) {
			if(numero%i ==0) {
				System.out.println(i);
				suma = suma+i;
			}
		}
		System.out.print("La suma de todos sus divisores es: " +suma);
	}

}
