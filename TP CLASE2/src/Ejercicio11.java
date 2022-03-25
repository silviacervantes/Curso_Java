/* Realizar un programa que muestre el uso del operador relacional. 
 * Pruebe al menos 5 ejemplos.
*/

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valor1 = 60;
		int valor2 = 8;
		boolean resultado;

		System.out.print("valor1=" +valor1+ " valor2=" +valor2);

		resultado = valor1 > valor2;
		System.out.print("\n\nOperador relacional valor1 > valor2 ==>" + resultado);
		//otro modo de realizar lo mismo
		System.out.print("\nOperador relacional valor1 > valor2 ==>" + (valor1>valor2)); 

		resultado = valor1 < valor2;
		System.out.print("\nOperador relacional valor1 < valor2 ==>" + resultado);
		
		resultado = valor1 == valor2;
		System.out.print("\nOperador relacional valor1 == valor2 ==>" + resultado);

		resultado = valor1 != valor2;
		System.out.print("\nOperador relacional valor1 != valor2 ==>" + resultado);

	}

}
