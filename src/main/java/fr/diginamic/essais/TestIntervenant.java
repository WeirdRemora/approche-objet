package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		
		Salarie s = new Salarie("De La Rondelle","�douard-L�o",2000D);
		Pigiste p = new Pigiste("Saucissoni","L�o-L�o",20,30D);
		s.afficherDonnees();
		p.afficherDonnees();

	}

}
