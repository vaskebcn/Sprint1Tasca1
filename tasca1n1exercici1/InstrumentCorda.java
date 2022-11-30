package tasca1n1exercici1;

public class InstrumentCorda extends Instrument {

	private static String nombre;
	private static int precio;

	public InstrumentCorda() {
		super(nombre, precio);
	}

	public InstrumentCorda(String nombre, int precio) {
		super(nombre, precio);
	}

	public String tocar() {
		return "Està sonant un instrument de Corda";
	}

	@Override
	public String toString() {
		return "InstrumentCorda [nombre=" + super.getNombre() + ", precio=" + super.getPrecio() + ", tocar()=" + tocar()
				+ "]";
	}

}

