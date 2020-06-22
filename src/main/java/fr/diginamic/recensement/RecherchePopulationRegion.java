package fr.diginamic.recensement;

import java.text.NumberFormat;
import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService {

	/** Demande le nom d'une r�gion puis calcule la population totale de cette r�gion
	 * en parcourant la liste des villes du recensement et en additionant leur population
	 */
	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Veuillez entrer le nom d'une r�gion.");
		String nomRegion = scanner.next().toLowerCase(); //insensible � la casse
		int populationRegion = 0;
		//recherche dans toutes les villes de recensement
		for(Ville ville : recensement.getVilles()) {
			//On fait correspondre la casse � celle du document si ce n'est pas d�j� le cas
			if (ville.getRegion().getNom().toLowerCase().equals(nomRegion) && !ville.getRegion().getNom().equals(nomRegion)){
				nomRegion = ville.getRegion().getNom();
			}
			//si la r�gion correspond � celle entr�e par l'utilisateur, on ajoute la population de la ville � la population totale de la r�gion
			if (ville.getRegion().getNom().equals(nomRegion)) {
				populationRegion += ville.getPopulation();
			}
		}
		//population avec espaces entre les nombres (ex: 100 000 000)
		System.out.println("Population de "+nomRegion+" :\n"
				+ NumberFormat.getIntegerInstance().format(populationRegion));
	}

}
