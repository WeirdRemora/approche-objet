package fr.diginamic.jdr;

import java.util.Scanner;

/** On regroupe les m�thodes du menu ici pour all�ger les main
 * @author Leo
 */
public class ChoixMenu {

	/** Demande � l'utilisateur de choisir une classe de h�ros et renvoie un objet de cette classe
	 * @param sc Scanner
	 * @return Un nouveau h�ros de la classe choisie
	 */
	public static Heros choixClasse(Scanner sc) {
		int choix = 0;
		do {
			System.out.println("Choisissez une classe :\n"
					+ "1. Guerrier\n"
					+ "2. Voleur\n"
					+ "Le guerrier se bat de fa�on standard, tandis que le voleur a une chance "
					+ "d'infliger des coups critiques ou d'esquiver les coups selon sa dext�rit�.");
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
	 * @return un monstre al�atoire
	 */
	public static Creature creatureAleatoire() {
		int nbCreatures = 3;
		int rd = (int)(Math.random()*(nbCreatures))+1;
		System.out.println("nombre al�atoire : "+rd);
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
