package n1exercici5;

public class Animal {
	
	public static void correr() {
		
		System.out.println("M�tode correr() SENSE PAR�METRES");
	}
	
	public static void correr(String animal) {
		
		System.out.println("M�tode correr() amb par�metre animal:  " + animal);
	}

	public static void correr(int pes) {
	
	System.out.println("M�tode correr() amb par�metre pes: " + pes);
	}

}
