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
					+ "1. Créer un personnage\n"
					+ "2.Combattre une créature\n"
					+ "3.Afficher score\n"
					+ "99. Sortir");
			choix = sc.nextInt();
			switch(choix) {
			//Créer un personnage
			case(1):
				heros = ChoixMenu.choixClasse(sc);
				heros.afficherStats();
			break;
			//Combattre une créature
			case(2):
				if(heros.getPv() > 0 ) {
					creature = ChoixMenu.creatureAleatoire();
					System.out.println("Un "+creature.getNom()+" sauvage apparaît !");
					Combat.faitCombattre(heros, creature, sc);
				}
				else {
					System.out.println("Vous êtes mort ! Vous ne pouvez plus combattre.");
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
