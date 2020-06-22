package fr.diginamic.recensement;

import java.text.NumberFormat;
import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService {

	/** Demande le nom d'une région puis calcule la population totale de cette région
	 * en parcourant la liste des villes du recensement et en additionant leur population
	 */
	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Veuillez entrer le nom d'une région.");
		String nomRegion = scanner.next().toLowerCase(); //insensible à la casse
		int populationRegion = 0;
		//recherche dans toutes les villes de recensement
		for(Ville ville : recensement.getVilles()) {
			//On fait correspondre la casse à celle du document si ce n'est pas déjà le cas
			if (ville.getRegion().getNom().toLowerCase().equals(nomRegion) && !ville.getRegion().getNom().equals(nomRegion)){
				nomRegion = ville.getRegion().getNom();
			}
			//si la région correspond à celle entrée par l'utilisateur, on ajoute la population de la ville à la population totale de la région
			if (ville.getRegion().getNom().equals(nomRegion)) {
				populationRegion += ville.getPopulation();
			}
		}
		//population avec espaces entre les nombres (ex: 100 000 000)
		System.out.println("Population de "+nomRegion+" :\n"
				+ NumberFormat.getIntegerInstance().format(populationRegion));
	}

}
