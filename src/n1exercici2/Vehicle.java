package n1exercici2;

public class Vehicle {
	
	public Vehicle() {
		
	}
	
	public static  void iniciar() {
		System.out.println("S'executa el m�tode iniciar()");
	}
	
	public static  void parar() {
		System.out.println("S'executa el m�tode parar() est�tic");
	}
	
	public void accelerar() {
		System.out.println("S'executa el m�tode accelerar() d'inst�ncia");
	}

}
