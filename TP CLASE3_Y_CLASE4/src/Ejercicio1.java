
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");
		String nombre = teclado.nextString();

		System.out.print("Ingrese edad: ");
		Scanner edad = teclado.nextInt();
		
		System.out.print("Mi nombre es:" +nombre+ " y mi edad es:" +edad+ "a�os.");

	}

}
