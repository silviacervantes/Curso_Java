/*
 * Declarar tres variables de tipo entero, asignar un valor 
 * cualquiera y mostrar el mayor y el menor.
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor1 = 5;
		int valor2 = 20;
		int valor3 = 50;
		int mayor;
		int menor;
		
		//Calculo del mayor
		if (valor1 > valor2) {
			mayor =  valor1;
			menor = valor2;
			
		}
		else {
			mayor = valor2;
			menor = valor1;
		};
		
		//Mayor
		if (valor3 > mayor){
			mayor=valor3;
		};
		//Menor
		if(menor > valor3) {
			menor = valor3;
		}
		System.out.println("El MAYOR es:"+mayor);
		System.out.println("El menor es:"+menor);
	};	
}
