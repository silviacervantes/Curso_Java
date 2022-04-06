import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Clase5 {

	public static void main(String[] args) {
		//ejercicio1();
		//ejercicio2();
		//ejercicio3();
		//ejercicio4();
		//ejercicio5();
		ejercicio6();
	}
	
	/*
	 * Crear un array de 10 de números enteros, con valores solicitados por 
	 * teclado. Mostrar por consola el índice y el valor de cada elemento. 
	 * Realizar dos métodos, uno para el ingreso de datos y otro para la salida 
	 * de datos.
	 */
	
	public static void ejercicio1() {
		int[] array = new int[10];
		crear_array(array);
		mostrar_array(array);
	}
	public static void crear_array(int[] array2) {
		Scanner teclado  = new Scanner(System.in);
		for (int i=0; i< array2.length;i++) {
			System.out.print("Ingrese el elemento "+i+ ":");
			array2[i] = teclado.nextInt();
		}
	}
	
	public static void mostrar_array(int[] array3) {
		for (int i=0; i < array3.length;i++) {
			System.out.println(array3[i]);
		}
	}
	
	/*
	 * Crear un vector de 20 números reales correspondientes a los pesos de 20 
	 * personas. Obtener el peso mayor, el menor, el peso medio y visualizar un 
	 * mensaje si hay alguna persona con un peso mayor de 100 kg.
	 */
	
	public static void ejercicio2() {
		double[] pesos = new double[20];
		ingresar_pesos(pesos);
		realizar_calculos(pesos);
	}
	public static void ingresar_pesos(double[] peso) {
		for(int i=1;i<peso.length;i++) {
			Scanner teclado  = new Scanner(System.in);
			System.out.print("Ingresar el peso de la  persona "+i+": ");
			peso[i] = teclado.nextDouble();
		}
	}
	public static void realizar_calculos(double[] pesos) {
		double menor = pesos[1];
		double mayor = pesos[1];
		double suma = pesos[1];
		for(int i=2;i<pesos.length;i++) {
			suma = suma+pesos[i];
			if(pesos[i]<menor) {
				menor = pesos[i];
			}else {
				if(pesos[i]>mayor) {
					mayor=pesos[i];
				}
			}
		}
		System.out.println("El menor peso es "+menor);
		System.out.println("El mayor peso es "+mayor);
		System.out.println("El peso promedio es "+(suma/pesos.length));
		
	}
	
	/*
	 * Crear un vector de 10 números reales, con valores solicitados al usuario. 
	 * Por otro lado solicitar una posición entre 0 y 9. Eliminar el elemento 
	 * situado en esa posición sin dejar hueco. Visualizar el vector resultante.
	 */
	
	public static void ejercicio3() {
		ArrayList <Double> vector = new ArrayList <Double> ();
		int posicion;
		Scanner teclado = new Scanner(System.in);
		
		cargar_vector(vector);
		System.out.println("Ingrese la posicion del elemento a quitar :");
		posicion=teclado.nextInt();
		vector.remove(posicion);
		System.out.print(vector);
		
		
	}
	
	public static void cargar_vector(ArrayList<Double> vector) {
		Scanner teclado = new Scanner(System.in);
			for(int i=0;i<10;i++){
				System.out.println("Cargar valor "+i+":");
				vector.add(teclado.nextDouble());	
			}
		}

	/*
	 * Generar 20 números enteros entre 1 y 100 de forma aleatoria y contar 
	 * cuántos de esos números enteros son divisibles entre 5.
	 */
	
	public static void ejercicio4(){
		int numero;
		int contador = 0;
		for(int i=0;i<20;i++) {
			numero = (int)(Math.random()*100);
			System.out.println(numero);
			if(numero%5 == 0) {
				++contador;
			}
		}
		System.out.print("Hay "+contador+" numeros divisibles por 5.");
	}
	
	/*
	 * Dada una lista de números enteros, separarla en dos listas ordenadas 
	 * de menor a mayor: la primera con los números pares y la segunda con 
	 * los números impares.
	 */
	
	public static void ejercicio5() {
		ArrayList<Integer> lista = new ArrayList<Integer>(); 
		int longitud;
		System.out.println("Ingrese la longitud de la lista: ");
		Scanner teclado = new Scanner(System.in);
		longitud=teclado.nextInt();
		ingresar_lista(lista,longitud);
		lista.sort(null);
		System.out.println("numeros ingresados ordenados: "+lista);
		separar_listas(lista);
	}
	public static void ingresar_lista(ArrayList<Integer> lista, int lon) {
		Scanner teclado = new Scanner(System.in);
		//int valor;
		System.out.println("Ingrese los numeros de la lista:");
		for(int i=0;i<lon;i++) {
			//valor = teclado.nextInt();
			lista.add(teclado.nextInt());
		}
	}
	public static void separar_listas(ArrayList<Integer> lista) {
		ArrayList<Integer> pares = new ArrayList<Integer>();
		ArrayList<Integer> impares = new ArrayList<Integer>();
		for(int i=0;i<lista.size();i++) {
			if((lista.get(i) % 2 )== 0) {
				//es par
				pares.add(lista.get(i));
			}else {
				// es impar
				impares.add(lista.get(i));
			}
		}
		System.out.println("Lista de pares: "+pares);
		System.out.println("Lista de impares: "+impares);
	}
	
	/*
	 * Escriba un programa que determine si una palabra es palíndromo. 
	 * Palíndromo: palabra o expresión que es igual si se lee de izquierda a 
	 * derecha que de derecha a izquierda, por ejemplo, arenera.
	 */
	
	public static void ejercicio6() {
		esPalindromo("HOLOH");
	}
	
	public static void esPalindromo(String cadena) {
		int i=0;
		int longitud = cadena.length();
		boolean bandera = true;
		while ((i<(longitud))&& bandera) {
			System.out.println(cadena.substring(i,i+1));
			System.out.println(cadena.substring(longitud-i-1,longitud-i));

			if(cadena.substring(i,i+1) != cadena.substring(longitud-i-1,longitud-i)) {
				bandera = false;
			}
			++i;
		}
		if (!bandera) {
			System.out.print(cadena+" NO ES Plindromo");
		}else {
			System.out.print(cadena+" ES Plindromo");
		}
	}
}

