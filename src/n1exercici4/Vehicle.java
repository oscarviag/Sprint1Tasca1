package n1exercici4;

public class Vehicle {
	
	
	public final static  String CAMP_ESTATIC_FINAL = "Camp Est�tic Final";
	public final String CAMP_FINAL;
	public static String CAMP_ESTATIC;
	
	
	public Vehicle(String nom) {
		CAMP_FINAL= nom;
		CAMP_ESTATIC= "Camp Est�tic a l'Inici com� a tots els objectes de la classe";
	}
	


	public static  void iniciar() {
		System.out.println("S'executa el m�tode iniciar()");
	}
	
	public static  void parar() {
		System.out.println("S'executa el m�tode parar()");
	}
	
	public void accelerar() {
		System.out.println("S'executa el m�tode accelerar()");
	}

}
