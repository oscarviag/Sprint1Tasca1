package n1exercici3;

public class Execucio {
	

	public static void main(String[] args) {
		
		
		Vehicle.parar();
		
		System.out.println("");
		
		Vehicle cotxe1 = new Vehicle();
		cotxe1.accelerar();
		
		System.out.println("\nSi tornem a executar el m�tode de la inst�ncia veiem que no es torna a executar la inicilitzaci� de la inst�ncia ni el constructor");
		cotxe1.accelerar();
		
		System.out.println("\nSi tornem a executar el m�tode est�tic veiem que no es torna a executar la inicilitzaci� de la classe");
		
		Vehicle.parar();
	}

}
