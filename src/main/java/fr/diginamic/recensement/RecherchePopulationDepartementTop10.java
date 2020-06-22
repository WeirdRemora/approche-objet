package fr.diginamic.recensement;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class RecherchePopulationDepartementTop10 extends MenuService {

	/** Affiche les 10 départements les plus peuplés
	 */
	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		HashMap<String, Integer> mapDepartements = new HashMap<>();
		ArrayList<Integer> listePopulations = new ArrayList<>();
		
		//on parcours les ville pour remplir une hashmap avec le code des départements en clé et la population totale en valeur
		for(Ville ville : recensement.getVilles()) {
			String codeDepartement = ville.getDepartement().getCode();
			//si le département est déjà dans la map, on ajoute la valeur population de la ville actuelle à la valeur de population enregistrée pour ce département
			if(mapDepartements.containsKey(codeDepartement)) {
				mapDepartements.put(codeDepartement, mapDepartements.get(codeDepartement)+ville.getPopulation());
			}
			//si le département est nouveau, on ajoute le code du département en clé avec la population de la ville actuelle
			else {
				mapDepartements.put(codeDepartement,ville.getPopulation());
			}
		}
		//on remplit une liste avec les valeurs de population
		for(int population : mapDepartements.values()) {
			listePopulations.add(population);
		}
		//on trie la liste par ordre décroissant
		Collections.sort(listePopulations, Collections.reverseOrder());
		
		Iterator<Integer> iterator = listePopulations.iterator();
		int i=0;
		//on parcourt la liste des valeurs de population ordonnées
		while(iterator.hasNext() && i<10) {
			i++;
			int population = iterator.next();
			//pour une valeur de population donnée, on cherche la map pour une valeur correspondante
			for(String codeDepartement : mapDepartements.keySet()) {
				//si la valeur correspond, on affiche
				if(mapDepartements.get(codeDepartement) == population) {
					//population avec espaces entre les nombres (ex: 100 000 000)
					System.out.println("("+codeDepartement+") : "+NumberFormat.getIntegerInstance().format(population)+" habitants");
				}
			}

		}

	}

}
