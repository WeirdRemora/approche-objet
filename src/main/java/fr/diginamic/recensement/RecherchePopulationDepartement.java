package fr.diginamic.recensement;

import java.text.NumberFormat;
import java.util.Scanner;

public class RecherchePopulationDepartement extends MenuService {

	/** Demande le code d'un d�partement puis cherche dans la liste de villes du recensement
	 * pour afficher sa population
	 */
	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Veuillez entrer le code d'un d�partement.");
		String codeDepartement = scanner.next();
		int populationDepartement = 0;
		//recherche dans toutes les villes de recensement
		for(Ville ville : recensement.getVilles()) {
			//si le code correspond � celui entr� par l'utilisateur, on ajoute la population de la ville � la population totale du d�partement
			if (ville.getDepartement().getCode().equals(codeDepartement)) {
				populationDepartement += ville.getPopulation();
			}
		}
		//population avec espaces entre les nombres (ex: 100 000 000)
		System.out.println("Population du d�partement de code "+codeDepartement+" :\n"
				+ NumberFormat.getIntegerInstance().format(populationDepartement));
	}

}
