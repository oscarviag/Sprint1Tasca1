package n1exercici8;

public class Frog extends Amphibian{
	
	@Override
	public void moure() {
		
		System.out.println("Executant el m�tode moure() de la classe Frog");
	};
	
	@Override
	public void respirar() {
		
		System.out.println("Executant el m�tode respirar() de la classe Frog");
	};
	
	@Override
	public void menjar() {
		
		System.out.println("Executant el m�tode menjar() de la classe Frog");
	};

	
	public void saltar() {
		
		System.out.println("Executant el m�tode saltar() de la classe Frog");
	};
	
}
