package n1exercici8;

public class Frog extends Amphibian{
	
	@Override
	public void moure() {
		
		System.out.println("Executant el mètode moure() de la classe Frog");
	};
	
	@Override
	public void respirar() {
		
		System.out.println("Executant el mètode respirar() de la classe Frog");
	};
	
	@Override
	public void menjar() {
		
		System.out.println("Executant el mètode menjar() de la classe Frog");
	};

	
	public void saltar() {
		
		System.out.println("Executant el mètode saltar() de la classe Frog");
	};
	
}
