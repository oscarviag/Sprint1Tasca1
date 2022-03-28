package n1exercici7;

public class Execucio {

	public static void main(String[] args) {
		
		Amphibian granota = new Frog();
		
		granota.moure();
		granota.respirar();
		granota.menjar();
		
		granota.saltar();
		
		((Frog) granota).saltar(); // S'ha de fer un downcast per poder fer servir els mètodes de la subclasse que hem generalitzat

	}

}
