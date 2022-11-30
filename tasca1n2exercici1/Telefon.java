package tasca1n2exercici1;

public class Telefon {

	private String marca;
	private String modelo;
	private String num;

	public Telefon(String marca, String modelo) {

		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNum() {
		return this.num;
	}

	public void setNum(String numero) {
		this.num = numero;
	}

	public String trucar(String num) {
		return "Se esta trucant al " + num;
	}

}
