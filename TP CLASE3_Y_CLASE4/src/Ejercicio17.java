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
		int n = teclado.nextInt();
		//int numero1=0;
		//int numero2=0;
		
		//defino el tipo array para la lista
		int lista[] = new int[n];
		char resultado[] = new char[n];
		
		System.out.println("Ingrese la lista de numeros");
		for(int i=0;i<n;i++) {
			System.out.print("Elemento"+i+" : ");
			lista[i]= teclado.nextInt();
			int numero=lista[i];
			int contador = 0;
			//System.out.print(numero);
			while(numero>0) {
				if(((numero%10)%2)==0) {
					contador=contador+1;
				};
				numero=numero/10;
			}
			//System.out.print(contador);
			if((contador%2)==0&&contador!=0) {
				resultado[i] = 'P';
				//System.out.print("El numero "+numero1+" tiene "+cantidad+" de digitos pares");
			}
		}	
		System.out.println("Los numeros que tienen cantidad par de digitos pares es:");
		for(int j=0;j<n;j++) {
			//System.out.println(lista[j]);
			if(resultado[j]=='P') {
				System.out.println("Elemento"+j+": "+lista[j]);
			}
		}

	}

}
