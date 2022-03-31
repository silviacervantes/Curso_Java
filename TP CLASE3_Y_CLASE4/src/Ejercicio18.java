import java.util.Scanner;

/*
 * Dado un numero natural K determinar si es capicua.
 */
public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingresar un nro natural (>0):");
		int numero1 = teclado.nextInt();
		
		int digito = numero1;
		int numero2 = numero1;
		int numero3 = 0;
		
		while(numero2 > 0) {
			digito = numero2%10;
			numero3 = numero3*10+digito;
			numero2 = numero2/10;
		}
		
		if(numero1 == numero3) {
			System.out.print("El numero es capicua");
		}else {
			System.out.print("El numero no es capicua");
		}
		
	}

}
