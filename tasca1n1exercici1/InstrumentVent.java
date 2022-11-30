package tasca1n1exercici1;

public class InstrumentVent extends Instrument {

	private static String nombre;
	private static int precio;

	public InstrumentVent() {
		super(nombre, precio);
	}

	public InstrumentVent(String nombre, int precio) {
		super(nombre, precio);
	}

	static {
		nombre = "trompeta";
		precio = 200;

	}

	public String tocar() {

		return "Està sonant un instrument de vent";

	}

	@Override
	public String toString() {
		return "InstrumentVent [nombre=" + super.getNombre() + ", precio=" + super.getPrecio() + ", tocar()=" + tocar()
				+ "]";
	}

}
