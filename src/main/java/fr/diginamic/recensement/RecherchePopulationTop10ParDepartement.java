package fr.diginamic.recensement;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class RecherchePopulationTop10ParDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Veuillez entrer le nom d'une région.");
		String codeDepartement = scanner.next();
		Recensement villesDuDepartement = new Recensement();
		//recherche dans toutes les villes de recensement
		//si le code département correspond à celui rentré par l'utilisateur, on ajoute la ville au nouveau recensement
		for(Ville ville : recensement.getVilles()) {
			//si le code correspond à celui entré par l'utilisateur, on ajoute la population de la ville à la population totale du département
			if (ville.getDepartement().getCode().equals(codeDepartement)) {
				villesDuDepartement.getVilles().add(ville);
			}
		}
		Collections.sort(villesDuDepartement.getVilles(), new ComparatorVille());
		System.out.println("Villes les plus peuplées de "+codeDepartement+" :");
		//on affiche les 10 premières avec un iterator au cas où il y ait moins de 10 villes
		Iterator<Ville> iterator = villesDuDepartement.getVilles().iterator();
		int i=0;
		while(iterator.hasNext() && i<10) {
			System.out.println(iterator.next());
			i++;
		}
	}

}
