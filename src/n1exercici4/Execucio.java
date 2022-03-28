package n1exercici4;

public class Execucio {

	public static void main(String[] args) {
		
		Vehicle cotxe1 = new Vehicle("Cotxe1");
		Vehicle cotxe2 = new Vehicle("Cotxe2");
		
		Vehicle.CAMP_ESTATIC= "Camp Estàtic a CANVIAT comú a tots els objectes de la classe";
		
		System.out.println("Valor del camp final: " + cotxe1.CAMP_FINAL);
		System.out.println("Valor del camp estàtic final: " + cotxe1.CAMP_ESTATIC_FINAL);
		System.out.println("Valor del camp estàtic: " + cotxe1.CAMP_ESTATIC);
		
		System.out.println("\nValor del camp final: " + cotxe2.CAMP_FINAL);
		System.out.println("Valor del camp estàtic final: " + cotxe2.CAMP_ESTATIC_FINAL);
		System.out.println("Valor del camp estàtic: " + cotxe2.CAMP_ESTATIC);
		
	}

}
