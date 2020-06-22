package fr.diginamic.jdr;

import java.util.Scanner;

/** Classe stateless pour g�rer le combat entre deux personnages
 * @author Leo
 */
public class Combat {
	
	/** Fait combattre un h�ros et un monstre jusqu'� que l'un des deux arrive � 0 pv
	 * Le h�ros gagne les points du monstre si il gagne
	 * @param heros H�ros
	 * @param creature Cr�ature
	 * @param sc Scanner
	 */
	public static void faitCombattre(Heros heros, Creature creature, Scanner sc) {
		int tour = 1;
		System.out.println("Vos points de vie :");
		heros.affichePv();
		System.out.println("Points de vie du "+creature.getNom());
		creature.affichePv();
		sc.nextLine();
		//les deux personnages se battent jusqu'� que l'un arrive � 0 pv
		while(heros.getPv() > 0 && creature.getPv() > 0) {
			System.out.println("Tour "+tour);
			tourSuivant(heros,creature);
			System.out.println("Vos points de vie :");
			heros.affichePv();
			System.out.println("Points de vie du "+creature.getNom());
			creature.affichePv();
			tour++;
			//l'utilisateur doit appuyer sur entr�e pour passer afficher le tour suivant
			sc.nextLine();
		}
		//Le h�ros gagne les points du monstre si il gagne
		boolean victoire = heros.getPv() > 0;
		if (victoire) {
			int nvScore = heros.getScore() + creature.getPoints();
			heros.setScore(nvScore);
		}
		System.out.println((victoire)?"Vous avez gagn� !":"Vous avez perdu !");
	}
	
	/** Le contenu d'un tour: chaque personnage se bat en infligeant ses d�g�ts
	 * @param heros H�ros
	 * @param creature Cr�ature
	 */
	private static void tourSuivant(Heros heros, Creature creature) {
		int degatsHeros = heros.attaque();
		int degatsCreature = creature.attaque();
		int degats;
		if (degatsHeros >= degatsCreature) {
			degats = creature.encaisse(degatsHeros - degatsCreature);
			System.out.println("Vous infligez "+(degats)+" d�gats au "+creature.getNom()+".");
		}
		else {
			degats = heros.encaisse(degatsCreature - degatsHeros);
			System.out.println("Le "+creature.getNom()+" vous inflige "+degats+" d�gats.");
		}
	}
}
