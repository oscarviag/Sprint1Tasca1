package n1exercici5;

public class Animal {
	
	public static void correr() {
		
		System.out.println("Mètode correr() SENSE PARÀMETRES");
	}
	
	public static void correr(String animal) {
		
		System.out.println("Mètode correr() amb paràmetre animal:  " + animal);
	}

	public static void correr(int pes) {
	
	System.out.println("Mètode correr() amb paràmetre pes: " + pes);
	}

}
