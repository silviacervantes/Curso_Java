import java.util.Scanner;

/*
 * Dados tres números, mostrarlos ordenados ascendentemente
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado =  new Scanner(System.in);
		
		System.out.print("Ingrese tres numeros:");
		int valor1 = teclado.nextInt();
		int valor2 = teclado.nextInt();
		int valor3 = teclado.nextInt();
		int mayor, menor, intermedio;
		
 		
		if(valor1 > valor2) {
			mayor = valor1;
			menor= valor2;
			intermedio = valor2;
		}else {
			mayor=valor2;
			menor=valor1;
			intermedio=valor1;
		};
		if (valor3 > mayor){
			intermedio = mayor;
			mayor = valor3;
		}else {
			if(valor3 < menor) {
				intermedio=menor;
				menor=valor3;
			}else {
				intermedio = valor3;
			}	
		}
		
			System.out.print(mayor+" "+intermedio+" "+menor);
		
		
	}

}
