package n1exercici4;

public class Execucio {

	public static void main(String[] args) {
		
		Vehicle cotxe1 = new Vehicle("Cotxe1");
		Vehicle cotxe2 = new Vehicle("Cotxe2");
		
		Vehicle.CAMP_ESTATIC= "Camp Est�tic a CANVIAT com� a tots els objectes de la classe";
		
		System.out.println("Valor del camp final: " + cotxe1.CAMP_FINAL);
		System.out.println("Valor del camp est�tic final: " + cotxe1.CAMP_ESTATIC_FINAL);
		System.out.println("Valor del camp est�tic: " + cotxe1.CAMP_ESTATIC);
		
		System.out.println("\nValor del camp final: " + cotxe2.CAMP_FINAL);
		System.out.println("Valor del camp est�tic final: " + cotxe2.CAMP_ESTATIC_FINAL);
		System.out.println("Valor del camp est�tic: " + cotxe2.CAMP_ESTATIC);
		
	}

}
