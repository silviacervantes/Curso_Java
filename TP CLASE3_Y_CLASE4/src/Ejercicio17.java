import java.util.Scanner;

/*
 * Dada un lista de numero naturales mostrar aquellos 
 * que tengan una cantidad par de digitos pares
 */

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingresar la cantidad de numeros (>0):");
		int cantidad = teclado.nextInt();
		int numero1=0;
		int numero2=0;
		
		for(int i=1;i<=cantidad;i++) {
			int contador=0;
			numero1 = teclado.nextInt();
			numero2=numero1;
			while(numero2>0) {
				if(((numero2%10)/2)==0) {
					contador=contador+1;
				}
				numero2=numero2/10;
			}
			if((contador%2)==0&&contador!=0) {
				System.out.print("El numero "+numero1+" tiene "+cantidad+" de digitos pares");
			}
			
			//while numero
		}

	}

}
