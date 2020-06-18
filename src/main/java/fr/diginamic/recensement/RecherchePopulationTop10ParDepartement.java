package fr.diginamic.recensement;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class RecherchePopulationTop10ParDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Veuillez entrer le nom d'une r�gion.");
		String codeDepartement = scanner.next();
		Recensement villesDuDepartement = new Recensement();
		//recherche dans toutes les villes de recensement
		//si le code d�partement correspond � celui rentr� par l'utilisateur, on ajoute la ville au nouveau recensement
		for(Ville ville : recensement.getVilles()) {
			//si le code correspond � celui entr� par l'utilisateur, on ajoute la population de la ville � la population totale du d�partement
			if (ville.getDepartement().getCode().equals(codeDepartement)) {
				villesDuDepartement.getVilles().add(ville);
			}
		}
		Collections.sort(villesDuDepartement.getVilles(), new ComparatorVille());
		System.out.println("Villes les plus peupl�es de "+codeDepartement+" :");
		//on affiche les 10 premi�res avec un iterator au cas o� il y ait moins de 10 villes
		Iterator<Ville> iterator = villesDuDepartement.getVilles().iterator();
		int i=0;
		while(iterator.hasNext() && i<10) {
			System.out.println(iterator.next());
			i++;
		}
	}

}
