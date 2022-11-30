package tasca1n1exercici2;

public class Coche {

	private static final String MARCA = "Nissan"; // constante de la propia clase (con el unico valor, se asigna dentro
													// de la clase
	private static String modelo; // variable de la propia clase (almacena el ultimo valor asignado)
	private final int potencia; // constante del objeto instanciado (con el valor unico)

	public Coche(String modelo, int potencia) {

		Coche.modelo = modelo;
		this.potencia = potencia;

	}

	public static String getMarca() {
		return MARCA;
	}

	public static String getModelo() {
		return modelo;
	}

	public static void setModelo(String modelo) {
		Coche.modelo = modelo;
	}

	public int getPotencia() {
		return potencia;
	}

	public String accelerar() { // se le llama desde el objeto, se aplica al objeto que llamamos
		return "El vehicle està accelerant";
	}

	public static String frenar() { // se le llama desde la clase, se aplica a todos los objetos de la clase
		return "El vehicle està frenant";
	}

	@Override
	public String toString() {
		return "Coche [marca = " + Coche.MARCA + " modelo = " + Coche.modelo + " potencia = " + this.potencia + "]";
	}

}

