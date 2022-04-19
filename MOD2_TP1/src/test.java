import java.util.ArrayList;
import java.util.Scanner;

public class test {
	public test() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado  = new Scanner(System.in);		

		// Test de clase persona
		//persona persona1= new persona("Silvia","Cervantes",123,"Av. ASuncion 1398");
		//persona1.verPesona();
		
		
		
		// Teste de clase serie
		//serie serie1 = new serie("Harrry Potter",1,"Aventura","J.R. Tolkien");
		//serie1.verSerie();
		//serie1.setTitulo(teclado.nextLine());
		//serie1.verSerie();
		
		// Test de clase NumerosEnteros
		//NumerosEnteros nro = new NumerosEnteros(5);
		//NumerosEnteros nro1 = new NumerosEnteros(3);
		//nro.suma(nro1);
		//nro.resta(nro1);
		//nro.multiplicacion(nro1);
		//nro.division(nro1);
		
		//Test de clsae Contador
		//Contador cont1 = new Contador(5);
		//Contador cont2 = new Contador();
		//cont2.copia(cont1);
		//for (int i=1; i< 10;i++) {
		//	cont1.decrementar();
		//	System.out.println("Vaor actual: "+cont1.get());	
		//}
		//cont1.incrementar();
		//System.out.println("Vaor actual: "+cont1.get());
		
		//Test Clase cuenta
		
		//Cuenta cuentaOrigen = new Cuenta("Silvia Cervantes","0001",0.13,100.30);
		//Cuenta cuentaDestino = new Cuenta("Verena","0002",0.20,14.36);
		//System.out.println("Saldo cuentaDestino queda en:"+cuentaDestino.saldo);
		//System.out.println("Saldo cuentaOrigen queda en:"+cuentaOrigen.saldo);
		//if(cuentaDestino.ingreso(15000.00)) {
		//	System.out.println("Saldo cuentaDestino queda en:"+cuentaDestino.saldo);
		//};
		//if(cuentaOrigen.reintegro(5.00)) {
		//	System.out.println("Saldo cuentaOrigen queda en:"+cuentaOrigen.saldo);
		//};
		//if(cuentaOrigen.transferencia(cuentaDestino, 10)) {
		//	System.out.println("Saldo cuentaOrigen "+cuentaOrigen.nCliente+" queda en:"+cuentaOrigen.saldo);
		//	System.out.println("Saldo cuentaDestino "+cuentaDestino.nCliente+" queda en:"+cuentaDestino.saldo);
		//}else {
		//	System.out.print("Saldo insuficiente");
		//}
		

		//PRUEBA CLSE DIRECTORCINE
		DirectorCine dire1 =  new DirectorCine("Pedro","Gomez",31);
		DirectorCine dire2 =  new DirectorCine("Juan","Suarez",55);
		DirectorCine dire3 =  new DirectorCine("Elena","Albucar",29);
		
		ArrayList<DirectorCine> Lista = new ArrayList();
		Lista.add(dire1);
		Lista.add(dire2);
		Lista.add(dire3);
		for (int i=0; i< Lista.size();i++) {
			System.out.println("--------");
			System.out.println(Lista.get(i).nombre);	
			System.out.println(Lista.get(i).apellido);
			System.out.println(Lista.get(i).edad);
		}
		
	}
	

}
