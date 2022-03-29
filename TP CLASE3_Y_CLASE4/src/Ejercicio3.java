import java.util.Scanner;

/*
 * Declarar tres variables de tipo entero, asignar un valor 
 * cualquiera y mostrar el mayor y el menor.
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese el 1er valor: ");
		int valor1 = teclado.nextInt();
		System.out.print("Ingrese el 2do valor: ");
		int valor2 = teclado.nextInt();
		System.out.print("Ingrese el 3er valor: ");
		int valor3 = teclado.nextInt();
		
		int mayor;
		int menor;
		
		//Calculo del mayor
		if (valor1 > valor2) {
			mayor =  valor1;
			menor = valor2;
			
		}
		else {
			mayor = valor2;
			menor = valor1;
		};
		
		//Mayor
		if (valor3 > mayor){
			mayor=valor3;
		};
		//Menor
		if(menor > valor3) {
			menor = valor3;
		}
		System.out.println("El MAYOR es:"+mayor);
		System.out.println("El menor es:"+menor);
	};	
}
