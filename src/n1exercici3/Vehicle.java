package n1exercici3;

public class Vehicle {
	
	static {
		
		System.out.println("Inicialitzaci� de la classe");
	}
	
	
	{
		System.out.println("Inicialitzaci� de la inst�ncia");
	}
	
	
	public Vehicle() {
		System.out.println("S'executa el Constructor");
	}
	
	public static  void parar() {
		System.out.println("S'executa el m�tode parar() est�tic");
	}
	
	public void accelerar() {
		System.out.println("S'executa el m�tode accelerar() d'inst�ncia");
	}

}
