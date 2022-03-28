package n2exercici1;


public class Cycle {
	
	public static void main(String[] args) {
		

		Unicycle unicycle = new Unicycle();	
		ride(unicycle);
				

		Bicycle bicycle = new Bicycle();
		ride(bicycle);
			

		Tricycle tricycle = new Tricycle();
		ride(tricycle);
				
	}
	
	public static void ride(Cycle c) {
		
		System.out.println("Puc fer servir el mètode encara que hagi estat creat com una subclass");
	}
	
			

}
