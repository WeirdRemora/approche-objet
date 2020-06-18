package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationDepartement extends MenuService {

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
		System.out.println("Population du d�partement de code "+codeDepartement+" :\n"
				+ populationDepartement);
	}

}
