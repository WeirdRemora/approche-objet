package fr.diginamic.recensement;

import java.util.Comparator;

public class ComparatorVille implements Comparator<Ville>{

	@Override
	public int compare(Ville v1, Ville v2) {
		//ordre décroissant
		return v2.getPopulation()-v1.getPopulation();
	}
}
