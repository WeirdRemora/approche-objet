package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {

	public static void afficher(Forme f) {
		System.out.println("Périmètre : "+f.calculerPerimetre());
		System.out.println("Aire : "+f.calculerSurface());
	}

}
