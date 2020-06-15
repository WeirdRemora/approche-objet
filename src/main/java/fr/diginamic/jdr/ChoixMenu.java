package fr.diginamic.jdr;

import java.util.Scanner;

public class ChoixMenu {

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
