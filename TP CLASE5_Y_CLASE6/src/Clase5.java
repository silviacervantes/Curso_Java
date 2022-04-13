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
		//ejercicio6();
		//ejercicio7();
		//ejercicio8();
		ejercicio9();
	}
	
	/*
	 * Crear un array de 10 de n�meros enteros, con valores solicitados por 
	 * teclado. Mostrar por consola el �ndice y el valor de cada elemento. 
	 * Realizar dos m�todos, uno para el ingreso de datos y otro para la salida 
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
	 * Crear un vector de 20 n�meros reales correspondientes a los pesos de 20 
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
	 * Crear un vector de 10 n�meros reales, con valores solicitados al usuario. 
	 * Por otro lado solicitar una posici�n entre 0 y 9. Eliminar el elemento 
	 * situado en esa posici�n sin dejar hueco. Visualizar el vector resultante.
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
	 * Generar 20 n�meros enteros entre 1 y 100 de forma aleatoria y contar 
	 * cu�ntos de esos n�meros enteros son divisibles entre 5.
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
	 * Dada una lista de n�meros enteros, separarla en dos listas ordenadas 
	 * de menor a mayor: la primera con los n�meros pares y la segunda con 
	 * los n�meros impares.
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
	 * Escriba un programa que determine si una palabra es pal�ndromo. 
	 * Pal�ndromo: palabra o expresi�n que es igual si se lee de izquierda a 
	 * derecha que de derecha a izquierda, por ejemplo, arenera.
	 */
	
	public static void ejercicio6() {
		//esPalindromo("CASAC");
		esPalindromo2("ADasdjf");
	}
	
	public static void esPalindromo(String cadena) {
		int i=0;
		int longitud = cadena.length();
		boolean bandera = true;
		String letra1;
		String letra2;
		
		while ((i<(longitud-1)/2)&& bandera) {
			//System.out.println(cadena.charAt(i));
			letra1 = cadena.substring(i,i+1);
			letra2 = cadena.substring(longitud-1-i,longitud-i);
			if( !letra1.equals(letra2)) {
				bandera = false;
			}
			++i;
		}
		if (!bandera) {
			System.out.print(cadena+" ==> NO ES Palindromo");
		}else {
			System.out.print(cadena+" ==> ES Palindromo");
		}
	}


public static void esPalindromo2(String cadena) {
	int i=0;
	int longitud = cadena.length();
	boolean bandera = true;
	char letra1;
	char letra2;
	
	while ((i<(longitud-1)/2)&& bandera) {
		System.out.println(cadena.charAt(i));
		letra1 = cadena.charAt(i);
		letra2 = cadena.charAt(longitud-1-i); 
		if(letra1 !=letra2) {
			bandera = false;
		}
		++i;
	}
	if (!bandera) {
		System.out.print(cadena+" ==> NO ES Palindromo");
	}else {
		System.out.print(cadena+" ==> ES Palindromo");
	}
}

/*
 * Escriba un programa que determine la cantidad de vocales y consonantes 
 * de una palabra
 */

public static void ejercicio7() {
	int vocales;
	int consonantes;
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Ingrese una palabra:");
	String palabra = teclado.next();
	
	vocales = nro_vocales(palabra);
	consonantes = nro_consonantes(palabra);
	
	System.out.println("Cantidad de vocales: "+vocales);
	System.out.println("Cantidad de consonantes: "+consonantes);
	
}

public static int nro_vocales(String cadena) {
	int cant_vocales=0;
	char[] vocalSearch = {'A','E','I','O','U','a','e','i','o','u'}; 
    
    for(int i=0; i<cadena.length(); i++){
        char letra = cadena.charAt(i);
        for(int j=0; j<vocalSearch.length; j++){
            if(vocalSearch[j] == letra){
                ++cant_vocales; 
            }
        }
    }
    return cant_vocales;
}
                
public static int nro_consonantes(String cadena) {
	int cant_consonantes=0;
	char[] consonantesSearch = {'B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z','�','b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z','�'}; 
	
    for(int i=0; i<cadena.length(); i++){
        char letra = cadena.charAt(i);
        for(int j=0; j<consonantesSearch.length; j++){
            if(consonantesSearch[j] == letra){
                ++cant_consonantes; 
            }
        }
    }
    return cant_consonantes;
}

/*
 * Ingrese 10 nombres de personas en un vector, luego ingrese un nombre 
 * cualquiera y b�squelo en el vector, si el nombre aparece en el vector 
 * mostrar "Nombre encontrado" en caso contrario "Nombre no encontrado".
 */

public static void ejercicio8() {
	String[] nombres = new String[3];
	nombres = cargarVector();
	Scanner teclado = new Scanner(System.in);
	System.out.println("Ingrese el nombre a buscar:");
	String nombre = teclado.next();
	if(nombreSearch(nombre,nombres)) {
		System.out.print("Se econtro");
	}else {
		System.out.print("No se encontro");
	}
	
}

public static String[] cargarVector() {
	Scanner teclado = new Scanner(System.in);
	String[] nombres = new String[3];
	
	for(int i=0;i<3;i++) {
		System.out.print("Ingrese nombre "+i);
		nombres[i] = teclado.next();
	}
	return nombres;
}

public static boolean nombreSearch(String nombre, String[] nombres) {
	boolean b = false;
	for(int i=0;i<3;i++) {
		if(nombres[i].equals(nombre)) {
			b = true;
			break;
		}
	}
	return b;
}

/*
 * Crear una matriz de 3�3 con los n�meros del 1 al 9. Mostrar por pantalla, 
 * tal como aparece en la matriz.
 */
public static void ejercicio9() {
	int[][] matriz = new int[3][3];
	cargar_matriz(matriz);
	mostrar_matriz(matriz);
}

public static void cargar_matriz(int[][] matriz) {
	int m=0;
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			matriz[i][j]= ++m;
		}
		
	}
}
public static void mostrar_matriz(int[][] matriz) {
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.print(matriz[i][j]+"\t"); 
		}
		System.out.println();
	}
}
/*
 * 
 */
}
