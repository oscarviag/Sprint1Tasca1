package n1exercici3;

public class Vehicle {
	
	static {
		
		System.out.println("Inicialització de la classe");
	}
	
	
	{
		System.out.println("Inicialització de la instància");
	}
	
	
	public Vehicle() {
		System.out.println("S'executa el Constructor");
	}
	
	public static  void parar() {
		System.out.println("S'executa el mètode parar() estàtic");
	}
	
	public void accelerar() {
		System.out.println("S'executa el mètode accelerar() d'instància");
	}

}
