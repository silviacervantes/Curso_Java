/* Realizar un programa que muestre el uso del operador lógico. 
 * Pruebe al menos 5 ejemplos.
 */

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		La negación (!) devuelve true si el operando es false.
		El Y lógico (&&) devuelve false si uno de los operandos es false.
		El O lógico (||) devuelve true si uno de los operandos es true.
		 */
	
		int valor1 = 15;
		int valor2 = 10;
		boolean valor3 =false;
		boolean valor4 = true;
		boolean resultado;
		
		System.out.print("Operadores LOGICOS");
		System.out.print("\nResultado NEGACION(!) de " +valor3+ "==>"+ !valor3);
		resultado = 15>3 && 10==8;
		System.out.print("\nResultado 1 ==>"+ resultado);
		
		resultado = 15!=3 && 10>8;
		System.out.print("\nResultado 2 ==>"+ resultado);
		
		resultado = 15>3 || 5==8; //(Alt+154 pipe |)
		System.out.print("\nResultado 3 ==>"+ resultado);
		
		
		
		
		
	}

}
