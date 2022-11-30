package tasca1n1exercici1;

public class InstrumentPercusio extends Instrument {

	private static String nombre;
	private static int precio;
	
	static {
		nombre = "gong";
		precio = 250;

	}

	public InstrumentPercusio() {
		super(nombre, precio);
	}

	public InstrumentPercusio(String nombre, int precio) {
		super(nombre, precio);
	}

	public String tocar() {

		return "Està sonant un instrument de percussió";

	}

	// @Override
	public String toString() {
		return "InstrumentPercusio [nombre=" + super.getNombre() + ", precio=" + super.getPrecio() + ", tocar()="
				+ tocar() + "]";
	}

}
