package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationVille extends MenuService {

	/** Demande le nom d'une ville puis affiche sa population
	 */
	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Veuillez entrer le nom d'une ville.");
		String nomVille = scanner.next().toLowerCase(); //insensible à la casse
		//recherche dans toutes les villes de recensement
		for(Ville ville : recensement.getVilles()) {
			if (ville.getCommune().toLowerCase().equals(nomVille)){
				System.out.println("Population de "+ville.getCommune()+" :\n"
						+ ville.getPopulation());
			}
		}
	}

}
