package tasca1n2exercici1;

public class Tasca1n2exercici1 {

public static void main(String[] args) {
		
		Smartphone phone1 = new Smartphone("samsung", "N90");
		
		Smartphone phone2 = new Smartphone("Iphone", "13");
		
		phone1.setNum("678678678");
		phone2.setNum("765444389");
		
		System.out.println(phone1.trucar(phone2.getNum()));
		
		System.out.println(phone1.Fotografiar());
		
		System.out.println(phone2.Alarma());
		
		
//System.out.println(phone2.trucar());
		
		phone2.Fotografiar();
		
		phone2.Alarma();

	}

}
