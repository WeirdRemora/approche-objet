package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		Cercle cercle = new Cercle(3);
		Rectangle rectangle = new Rectangle(2,3);
		Carre carre = new Carre(5);
		
		System.out.println("Affichage cercle :");
		AffichageForme.afficher(cercle);
		System.out.println("Affichage rectangle :");
		AffichageForme.afficher(rectangle);
		System.out.println("Affichage carré :");
		AffichageForme.afficher(carre);
		
	}

}
