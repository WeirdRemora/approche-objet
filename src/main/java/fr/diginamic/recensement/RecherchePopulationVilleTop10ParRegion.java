package fr.diginamic.recensement;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class RecherchePopulationVilleTop10ParRegion extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Veuillez entrer le nom d'une région.");
		String nomRegion = scanner.next().toLowerCase(); //insensible à la casse
		Recensement villesDeLaRegion = new Recensement();
		//recherche dans toutes les villes de recensement
		//si la région correspond à celui rentré par l'utilisateur, on ajoute la ville au nouveau recensement
		for(Ville ville : recensement.getVilles()) {
			//On fait correspondre la casse à celle du document si ce n'est pas déjà le cas
			if (ville.getRegion().getNom().toLowerCase().equals(nomRegion) && !ville.getRegion().getNom().equals(nomRegion)){
				nomRegion = ville.getRegion().getNom();
			}
			if (ville.getRegion().getNom().equals(nomRegion)) {
				villesDeLaRegion.getVilles().add(ville);
			}
		}
		Collections.sort(villesDeLaRegion.getVilles(), new ComparatorVille());
		System.out.println("Villes les plus peuplées de "+nomRegion+" :");
		//on affiche les 10 premières avec un iterator au cas où il y ait moins de 10 villes
		Iterator<Ville> iterator = villesDeLaRegion.getVilles().iterator();
		int i=0;
		while(iterator.hasNext() && i<10) {
			System.out.println(iterator.next());
			i++;
		}
	}

}
