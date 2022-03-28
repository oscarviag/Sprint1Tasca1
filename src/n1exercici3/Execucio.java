package n1exercici3;

public class Execucio {
	

	public static void main(String[] args) {
		
		
		Vehicle.parar();
		
		System.out.println("");
		
		Vehicle cotxe1 = new Vehicle();
		cotxe1.accelerar();
		
		System.out.println("\nSi tornem a executar el mètode de la instància veiem que no es torna a executar la inicilització de la instància ni el constructor");
		cotxe1.accelerar();
		
		System.out.println("\nSi tornem a executar el mètode estàtic veiem que no es torna a executar la inicilització de la classe");
		
		Vehicle.parar();
	}

}
