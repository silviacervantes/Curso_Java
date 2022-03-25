
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Realizar un programa en donde se muestren los diferentes operadores 
		// que existen en Java. Utilizar bloques de comentarios para 
		// estructurar el mismo.
		
		int valor1 = 10;
		int valor2 = 15;
		int resultado1;
		boolean resultado2;
		
		
		System.out.print("\n Valor1 = 10 y Valor2 = 15");
		
		// Operador SUMA
		resultado1 = valor1 + valor2;
		System.out.print("\n Resultado Operador Suma: " + resultado1);
		// Operador MULTIPLICATIVA
		resultado1 = valor1 * valor2;
		System.out.print("\n Resultado Operador Multiplicativa: " + resultado1);
		// Operador RESTO DE LA DIVISION
		resultado1 = valor2 % valor1;
		System.out.print("\n Resultado Operador RESTO DIVISION: " + resultado1);

		//Operador Incremento
		resultado1 = ++valor1;
		System.out.print("\n Resultado Operador Incremento: " + resultado1);
		//Operador Relacional
		resultado2 = valor1>valor2;
		System.out.print("\n Resultado Operador relacional valor1 > valor2 : " + resultado2);
		
		//Operador Asignacion
				resultado1 += valor2;
				System.out.print("\n Resultado Operador Asignacion += : " + resultado1);
		
	}

}
