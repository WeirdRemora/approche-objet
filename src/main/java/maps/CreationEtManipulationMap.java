package maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> mapVilles = new HashMap<>();	
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		
		//Ajouter dans mapVilles les informations pour Lille, Lyon et Bordeaux
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		//Mettre en place une boucle pour afficher l'ensemble des clés contenues dans la map
		Iterator<Integer> keyIterator = mapVilles.keySet().iterator();
		System.out.println("Ensemble des clés :");
		while(keyIterator.hasNext()) {
			System.out.println(keyIterator.next());
		}
		
		//Mettre en place une boucle pour afficher l'ensemble des valeurs contenues dans la map
		Iterator<String> valueIterator = mapVilles.values().iterator();
		System.out.println("Ensemble des valeurs :");
		while(valueIterator.hasNext()) {
			System.out.println(valueIterator.next());
		}
		
		System.out.println("Taille de la map : "+mapVilles.size());

	}

}
