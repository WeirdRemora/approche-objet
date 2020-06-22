package fr.diginamic.recensement;

import java.util.Collections;
import java.util.Scanner;

public class RecherchePopulationVilleTop10 extends MenuService {

	/** Affiche les 10 villes les plus peupl�es de France
	 */
	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		//on trie les villes par population par ordre d�croissant
		Collections.sort(recensement.getVilles(), new ComparatorVille());
		System.out.println("Villes les plus peupl�es de France :");
		//on affiche les 10 premi�res
		for(int i=0 ; i<10 ; i++) {
			System.out.println(recensement.getVilles().get(i));
		}
	}
	
}
