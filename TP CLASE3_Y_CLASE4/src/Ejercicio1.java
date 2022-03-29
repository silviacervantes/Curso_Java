import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");
		String nombre = teclado.nextLine();

		System.out.print("Ingrese edad: ");
		int edad = teclado.nextInt();
		
		System.out.print("Mi nombre es:" +nombre+ " y mi edad es:" +edad+ "años.");

	}

}
