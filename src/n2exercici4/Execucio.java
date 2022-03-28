package n2exercici4;

import java.util.ArrayList;

public class Execucio {

	public static void main(String[] args) {
		
		ArrayList<Rossegador> llistat = new ArrayList<>();
		
		Rossegador rossegador = new Rossegador();
		Rossegador jerbu = new Jerbu();
		Rossegador hamster = new Hamster();
		Rossegador ratoli = new Ratoli();
		
		llistat.add(rossegador);
		llistat.add(jerbu);
		llistat.add(hamster);
		llistat.add(ratoli);
		
		for (Rossegador element:llistat) {
			
			element.ensumar();
			element.rossegar();
			element.correr();
			System.out.println();
			
		}
	}

}
