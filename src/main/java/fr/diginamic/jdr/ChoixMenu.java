package fr.diginamic.jdr;

import java.util.Scanner;

/** On regroupe les méthodes du menu ici pour alléger les main
 * @author Leo
 */
public class ChoixMenu {

	/** Demande à l'utilisateur de choisir une classe de héros et renvoie un objet de cette classe
	 * @param sc Scanner
	 * @return Un nouveau héros de la classe choisie
	 */
	public static Heros choixClasse(Scanner sc) {
		int choix = 0;
		do {
			System.out.println("Choisissez une classe :\n"
					+ "1. Guerrier\n"
					+ "2. Voleur\n"
					+ "Le guerrier se bat de façon standard, tandis que le voleur a une chance "
					+ "d'infliger des coups critiques ou d'esquiver les coups selon sa dextérité.");
			choix = sc.nextInt();
			switch(choix) {
			case(1):
				return new Guerrier();
			case(2):
				return new Voleur();
			}
		}
		while(choix != 1 && choix != 2);
		return null;
		
	}
	
	/**
	 * @return un monstre aléatoire
	 */
	public static Creature creatureAleatoire() {
		int nbCreatures = 3;
		int rd = (int)(Math.random()*(nbCreatures))+1;
		System.out.println("nombre aléatoire : "+rd);
		switch(rd) {
		case(1):
			return new Loup();
		case(2):
			return new Gobelin();
		case(3):
			return new Troll();
		default:
			return null;
		}
		
	}

}
