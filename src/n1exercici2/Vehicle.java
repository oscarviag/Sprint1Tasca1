package n1exercici2;

public class Vehicle {
	
	public Vehicle() {
		
	}
	
	public static  void iniciar() {
		System.out.println("S'executa el mètode iniciar()");
	}
	
	public static  void parar() {
		System.out.println("S'executa el mètode parar() estàtic");
	}
	
	public void accelerar() {
		System.out.println("S'executa el mètode accelerar() d'instància");
	}

}
