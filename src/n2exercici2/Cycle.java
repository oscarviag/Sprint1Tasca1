package n2exercici2;


public class Cycle {
	
	public static void main(String[] args) {
		
			System.out.println("Unicycle fent servir el mètode wheels generalitzant amb ride() i sense generalitzar");
			Unicycle unicycle = new Unicycle();
			Cycle.ride(unicycle);
			unicycle.wheels();
			
			System.out.println("\nBicycle fent servir el mètode wheels generalitzant amb ride() i sense generalitzar");
			Bicycle bicycle = new Bicycle();
			Cycle.ride(bicycle);
			bicycle.wheels();		

			System.out.println("\nTricycle fent servir el mètode wheels generalitzant amb ride() i sense generalitzar");
			Tricycle tricycle = new Tricycle();
			Cycle.ride(tricycle);
			tricycle.wheels();	
	
	}
	
	public static void ride(Cycle c) {
		
		c.wheels();

	}
	
	
	private void wheels() {
		
		System.out.println("No sé quants rodes tinc");		
	}	


}
