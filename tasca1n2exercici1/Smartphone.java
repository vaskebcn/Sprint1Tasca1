package tasca1n2exercici1;

public class Smartphone extends Telefon implements Camera, Rellotge {

	public Smartphone(String marca, String modelo) {
		super(marca, modelo);

	}

	public String Fotografiar() {

		return super.getMarca() + " " + super.getModelo() + " està fent una foto";

	}

	public String Alarma() {

		return super.getMarca() + " " + super.getModelo() + " = està sonant l’alarma";

	}

}
