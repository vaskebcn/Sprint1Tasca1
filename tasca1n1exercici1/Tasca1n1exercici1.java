package tasca1n1exercici1;

public class Tasca1n1exercici1 {

	public static void main(String[] args) {

		InstrumentPercusio timbal = new InstrumentPercusio("timpani", 3000);
		InstrumentPercusio timbal1 = new InstrumentPercusio();
		InstrumentVent saxo1 = new InstrumentVent("selmer", 1500);
		InstrumentVent saxo2 = new InstrumentVent();
		InstrumentCorda violin = new InstrumentCorda("stradivarius", 6000);

		System.out.println(timbal.toString());
		System.out.println(timbal1.toString());

		System.out.println(saxo1.toString());
		System.out.println(saxo2.toString());

		System.out.println(violin.toString());

	}

}


