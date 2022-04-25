import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Date;

public class Perecedero extends Producto{

	public Perecedero() {
		// TODO Auto-generated constructor stub
	}
	public Perecedero(String nombre, double precio,LocalDate vencimiento) {
		super(nombre,precio,vencimiento);
	}
	public double calcular() {
		
		/*return ChronoUnit.DAYS.between(this.getVencimiento(),LocalDate.now());
		break;
		//int diferenciaFechas = 2;
		switch((int)diferenciaFechas) {
			case 1:{return this.getPrecio()*0.75;}
			case 2:{return this.getPrecio()*0.7;}
			case 3:{return this.getPrecio()*0.5;}
		};
		return this.getPrecio();*/
		
		String  requestDate = "2020-01-15";
	    LocalDate myDate = LocalDate.parse(requestDate);

	    LocalDate currentDate = LocalDate.now();

	    long numberOFDays = DAYS.between(myDate, currentDate);

	    System.out.println(String.format("The diff of days is %d",numberOFDays));
	}
	/*
	n perecederos el precio se reducirá según los días a
	caducar, si le queda 1 día se reducirá 4 veces el precio, si le quedan 2 días se
	reducirá el precio 3 veces, si le quedan 3 días se reducirá la mitad el precio
	*/
}
