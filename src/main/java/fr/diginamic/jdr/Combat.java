package fr.diginamic.jdr;

import java.util.Scanner;

public class Combat {
	
	public static void faitCombattre(Heros heros, Creature creature, Scanner sc) {
		int tour = 1;
		System.out.println("Vos points de vie :");
		heros.affichePv();
		System.out.println("Points de vie du "+creature.getNom());
		creature.affichePv();
		sc.nextLine();
		while(heros.getPv() > 0 && creature.getPv() > 0) {
			System.out.println("Tour "+tour);
			tourSuivant(heros,creature);
			System.out.println("Vos points de vie :");
			heros.affichePv();
			System.out.println("Points de vie du "+creature.getNom());
			creature.affichePv();
			tour++;
			sc.nextLine();
		}
		boolean victoire = heros.getPv() > 0;
		if (victoire) {
			int nvScore = heros.getScore() + creature.getPoints();
			heros.setScore(nvScore);
		}
		System.out.println((victoire)?"Vous avez gagné !":"Vous avez perdu !");
	}
	
	private static void tourSuivant(Heros heros, Creature creature) {
		int degatsHeros = heros.attaque();
		int degatsCreature = creature.attaque();
		int degats;
		if (degatsHeros >= degatsCreature) {
			degats = creature.encaisse(degatsHeros - degatsCreature);
			System.out.println("Vous infligez "+(degats)+" dégats au "+creature.getNom()+".");
		}
		else {
			degats = heros.encaisse(degatsCreature - degatsHeros);
			System.out.println("Le "+creature.getNom()+" vous inflige "+degats+" dégats.");
		}
	}
}
