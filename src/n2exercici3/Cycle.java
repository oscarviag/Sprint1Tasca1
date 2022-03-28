package n2exercici3;

import java.util.ArrayList;

public class Cycle {
	
	public static void main(String[] args) {
		
			
		Unicycle unicycle = new Unicycle();
		Bicycle bicycle = new Bicycle();		
		Tricycle tricycle = new Tricycle();
		ArrayList<Cycle> llista = new ArrayList<>();
		
		llista.add(unicycle);
		llista.add(bicycle);
		llista.add(tricycle);
		
		for (Cycle element:llista) {
			
			if (element instanceof  Unicycle) { ((Unicycle) element).balance();}
			if (element instanceof  Bicycle) { ((Bicycle) element).balance();}
		}
	}
	
	public static void ride(Cycle c) {
		
		c.wheels();

	}
	
	
	private void wheels() {
		
		System.out.println("No sé quants rodes tinc");		
	}	


}
