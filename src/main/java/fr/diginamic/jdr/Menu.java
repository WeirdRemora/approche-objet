package fr.diginamic.jdr;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Heros heros = null;
		Creature creature = null;
		int choix = 0;
		do {
			System.out.println("Veuillez choisir une option\n"
					+ "1. Cr�er un personnage\n"
					+ "2.Combattre une cr�ature\n"
					+ "3.Afficher score\n"
					+ "99. Sortir");
			choix = sc.nextInt();
			switch(choix) {
			//Cr�er un personnage
			case(1):
				heros = ChoixMenu.choixClasse(sc);
				heros.afficherStats();
			break;
			//Combattre une cr�ature
			case(2):
				if(heros.getPv() > 0 ) {
					creature = ChoixMenu.creatureAleatoire();
					System.out.println("Un "+creature.getNom()+" sauvage appara�t !");
					Combat.faitCombattre(heros, creature, sc);
				}
				else {
					System.out.println("Vous �tes mort ! Vous ne pouvez plus combattre.");
				}
			break;
			//Afficher le score
			case(3):
				heros.afficherScore();
			}


		}
		while(choix!=99);
		sc.close();
	}
}
