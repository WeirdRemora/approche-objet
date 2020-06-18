package fr.diginamic.recensement;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class RecherchePopulationVilleTop10ParRegion extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Veuillez entrer le nom d'une r�gion.");
		String nomRegion = scanner.next().toLowerCase(); //insensible � la casse
		Recensement villesDeLaRegion = new Recensement();
		//recherche dans toutes les villes de recensement
		//si la r�gion correspond � celui rentr� par l'utilisateur, on ajoute la ville au nouveau recensement
		for(Ville ville : recensement.getVilles()) {
			//On fait correspondre la casse � celle du document si ce n'est pas d�j� le cas
			if (ville.getRegion().getNom().toLowerCase().equals(nomRegion) && !ville.getRegion().getNom().equals(nomRegion)){
				nomRegion = ville.getRegion().getNom();
			}
			if (ville.getRegion().getNom().equals(nomRegion)) {
				villesDeLaRegion.getVilles().add(ville);
			}
		}
		Collections.sort(villesDeLaRegion.getVilles(), new ComparatorVille());
		System.out.println("Villes les plus peupl�es de "+nomRegion+" :");
		//on affiche les 10 premi�res avec un iterator au cas o� il y ait moins de 10 villes
		Iterator<Ville> iterator = villesDeLaRegion.getVilles().iterator();
		int i=0;
		while(iterator.hasNext() && i<10) {
			System.out.println(iterator.next());
			i++;
		}
	}

}
