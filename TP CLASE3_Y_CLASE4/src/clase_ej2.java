import java.util.Scanner;

public class clase_ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el numero1");
		Scanner teclado=new Scanner(System.in);
		int num1 = teclado.nextInt();
		
		System.out.println("Ingrese el numero2");
		//Scanner teclado=new Scanner(System.in);
		int num2 = teclado.nextInt();
		int resultado = 0;
		while((num1=(num1-num2)) >= 0) {
			resultado = ++resultado;
		}
		System.out.print("El resultado es:"+resultado);
	}

}
