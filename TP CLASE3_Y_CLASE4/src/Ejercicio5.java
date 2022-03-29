import java.util.Scanner;

/*
 * Declare un variable de tipo entero y asigne un valor cualquiera,
 *  determine si el numero es par o impar y muestre un mensaje con 
 *  esa informacion. mensaje: "El numero... es (par o impar)"

 */
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese un numero: ");
		int valor1 = teclado.nextInt();
		
		if( (valor1%2)==0) {
			System.out.print(valor1+" ES PAR");
		}
		else {
			System.out.print(valor1+" ES IMPAR");
		};
	};

}
