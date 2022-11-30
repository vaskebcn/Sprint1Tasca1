package tasca1n1exercici1;

public abstract class Instrument {

	private String nombre;
	private int precio;

	{
		System.out.println("Mi Constructor");		//se inicia cada vez cuando se llama a la clase
	}
	static {
		System.out.println("bloque estatico 1");    /*se inicia una sola vez, la primera vez cuando se llama a la clase,
		 											y se inicia de un bloque que no sea static*/
													
	}

	public Instrument(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public Instrument() {

	}

	public String getNombre() {
		return nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public abstract String tocar();

	@Override
	public String toString() {
		return "Instrument [nombre=" + this.nombre + ", precio=" + this.precio + "]";
	}

}

