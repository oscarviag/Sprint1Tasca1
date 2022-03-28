package n1exercici4;

public class Vehicle {
	
	
	public final static  String CAMP_ESTATIC_FINAL = "Camp Estàtic Final";
	public final String CAMP_FINAL;
	public static String CAMP_ESTATIC;
	
	
	public Vehicle(String nom) {
		CAMP_FINAL= nom;
		CAMP_ESTATIC= "Camp Estàtic a l'Inici comú a tots els objectes de la classe";
	}
	


	public static  void iniciar() {
		System.out.println("S'executa el mètode iniciar()");
	}
	
	public static  void parar() {
		System.out.println("S'executa el mètode parar()");
	}
	
	public void accelerar() {
		System.out.println("S'executa el mètode accelerar()");
	}

}
