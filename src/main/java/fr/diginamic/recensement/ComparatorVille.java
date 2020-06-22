package fr.diginamic.recensement;

import java.util.Comparator;

public class ComparatorVille implements Comparator<Ville>{

	/** Compare deux villes v1 et v2 selon leur population (ordre décroissant)
	 * négatif: v1<v2 - 0: v1=v2 - positif: v1>v2
	 */
	@Override
	public int compare(Ville v1, Ville v2) {
		return v2.getPopulation()-v1.getPopulation();
	}
}
