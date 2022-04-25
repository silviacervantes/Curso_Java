import java.time.LocalDate;
import java.util.Date;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//prueba raices
		Raices raiz1 = new Raices(4,1,1);
		System.out.println(raiz1.getDiscriminante());
		System.out.println(raiz1.tieneRaices());
		System.out.println(raiz1.obtenerRaiz());
		System.out.println(raiz1.obtenerRaices()[0]+" "+raiz1.obtenerRaices()[1]);
		raiz1.calcular();
		
		//Cuenta
		Cuenta cuenta1 = new Cuenta("Silvia Cervantes");
		cuenta1.mostrar();
		cuenta1.ingresar(123.90);
		cuenta1.retirar(12.76);
		cuenta1.mostrar();
		
		// EMPLEADO
		System.out.println("DATOS DE EMPLEADO");
		System.out.println("=================");
		persona persona1 = new persona("Silvia","Cervantes",28374,"domicilio1");
		empleado empleado1 = new empleado("Silvia", "Cervantes",1234,"domicilio",1000.01);
		empleado1.verEmpleado();
		System.out.print("CALCULO DE SUELDO: "+empleado1.calculoSueldo(8));

		//Producto
		System.out.println("DATOS DE PRODUCTO");
		System.out.println("=================");
/*		String  requestDate = "2020-01-15";
	    LocalDate myDate = LocalDate.parse(requestDate);

	    LocalDate currentDate = LocalDate.now();

	    long numberOFDays = DAYS.between(myDate, currentDate);*/

		Producto producto1 = new Producto("Harina", 90.10, LocalDate.parse("2021-04-12"));
		//producto1.mostrarProducto();
		Perecedero producto2 = new Perecedero("Harina", 90.10, LocalDate.parse("2021-04-15"));
		producto2.mostrarProducto();
		System.out.println("Rebaja de precio por proximo Vto.: "+producto2.calcular());
	}

}
