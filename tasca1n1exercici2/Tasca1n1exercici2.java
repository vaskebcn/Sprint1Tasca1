package tasca1n1exercici2;

public class Tasca1n1exercici2 {

	public static void main(String[] args) {

		Coche coche1 = new Coche("astra", 1200);

		Coche coche2 = new Coche("megane", 1300);

		Coche coche3 = new Coche("leon", 1900);
		

		System.out.println(Coche.getMarca());

		Coche.setModelo("gt");

		System.out.println(Coche.getModelo());

		System.out.println(coche2.getPotencia());

		Coche.setModelo("scenic");

		System.out.println(Coche.getModelo());

		System.out.println(coche1.accelerar());

		System.out.println(Coche.frenar());

		System.out.println(coche1.toString());

		System.out.println(coche3.toString());

	}

}


