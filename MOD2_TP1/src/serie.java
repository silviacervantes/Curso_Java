/*
 * Crear una clase llamada serie con los atributos: titulo, números de 
 * temporadas,género y creador. Con los siguientes métodos: Constructor, 
 * mostrar todos los atributos, sobrescribir todos los atributos.
 */
public class serie {
	private String titulo;
	private int nro_temp;
	private String genero;
	private String creador;
	
	public serie() {
		// TODO Auto-generated constructor stub
	}
	public serie(String t, int nt, String g, String c) {
		this.titulo = t;
		this.nro_temp = nt;
		this.genero = g;
		this.creador = c;
	}
	public void verSerie() {
		System.out.println("Titulo: "+this.titulo);
		System.out.println("Nro de temporada: "+this.nro_temp);
		System.out.println("Genero: "+this.genero);
		System.out.println("Creador: "+this.creador);
		
	}
	public void setTitulo(String t) {
		this.titulo = t;
	}
	public void setTemporada(int n) {
		this.nro_temp = n;
	}
	public void setGenero(String g) {
		this.genero = g;
	}
	public void setCreador(String c) {
		this.creador = c;
	}

}
