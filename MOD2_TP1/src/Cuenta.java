
public class Cuenta {
	String nCliente;
	String nroCuenta;
	double interes;
	double saldo;
	
	public Cuenta() {
		// TODO Auto-generated constructor stub
	}
	public Cuenta(String nom, String num, double in, double sal) {
		this.nCliente =nom;
		this.nroCuenta = num;
		this.interes = in;
		this.saldo = sal;
	}
	public void copia(Cuenta cuenta2) {
		this.nCliente = cuenta2.nCliente;
		this.nroCuenta = cuenta2.nroCuenta;
		this.interes = cuenta2.interes;
		this.saldo = cuenta2.saldo;
	}
	public void setCliente(String nombrex) {
		this.nCliente = nombrex;
	}
	public void setCuente(String cuentax) {
		this.nroCuenta = cuentax;
	}
	public void setInteres(double interesx) {
		this.interes = interesx;
	}
	public void setSaldo(double saldox) {
		this.saldo = saldox;
	}
	
	public String getCliente() {
		return nCliente;
	}
	public String getCuente() {
		return nroCuenta;
	}
	public double getInteres() {
		return interes;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public boolean ingreso(double valor) {
		if (valor >0) {
			this.saldo = this.saldo+valor;
			return true;
		}else {
			return false;
		}
	}
	public boolean reintegro( double valor) {
		if (this.saldo >= valor && valor>0) {
			this.saldo = this.saldo-valor;
			return true;
		}else {
			return false;
		}
	}
	public boolean transferencia(Cuenta cuentaDestino, double importe) {
		if(this.saldo >= importe) {// Hay saldo para transferir
			cuentaDestino.saldo = cuentaDestino.saldo+importe;
			this.saldo =this.saldo-importe;
			return true;
		}else {
			return false;
		}
		
	}
}