package fr.diginamic.recensement;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class RecherchePopulationRegionTop10 extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		HashMap<String, Integer> mapRegions = new HashMap<>();
		ArrayList<Integer> listePopulations = new ArrayList<>();
		
		//on parcours les ville pour remplir une hashmap avec le nom des régions en clé et la population totale en valeur
		for(Ville ville : recensement.getVilles()) {
			String nomRegion = ville.getRegion().getNom();
			//si la région est déjà dans la map, on ajoute la valeur population de la ville actuelle à la valeur de population enregistrée pour cette région
			if(mapRegions.containsKey(nomRegion)) {
				mapRegions.put(nomRegion, mapRegions.get(nomRegion)+ville.getPopulation());
			}
			//si la région est nouvelle, on ajoute le nom de la région en clé avec la population de la ville actuelle
			else {
				mapRegions.put(nomRegion,ville.getPopulation());
			}
		}
		//on remplit une liste avec les valeurs de population
		for(int population : mapRegions.values()) {
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
			for(String nomRegion : mapRegions.keySet()) {
				//si la valeur correspond, on affiche
				if(mapRegions.get(nomRegion) == population) {
					//population avec espaces entre les nombres (ex: 100 000 000)
					System.out.println(nomRegion+" : "+NumberFormat.getIntegerInstance().format(population)+" habitants");
				}
			}
		}
		
	}
	
}
