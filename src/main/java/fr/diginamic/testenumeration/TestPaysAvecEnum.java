package fr.diginamic.testenumeration;

import java.util.HashMap;
import java.util.HashSet;

import sets.Pays;

public class TestPaysAvecEnum {

	public static void main(String[] args) {
		HashSet<Pays> setPays = new HashSet<Pays>();
		setPays.add(new Pays("USA", 328_239_523, 62606,Continent.AMERIQUE));
		setPays.add(new Pays("France", 69_861_344, 43551,Continent.EUROPE));
		setPays.add(new Pays("Allemagne", 82_801_531, 50206,Continent.EUROPE));
		setPays.add(new Pays("UK", 63_421_628, 43620,Continent.EUROPE));
		setPays.add(new Pays("Italie", 61_302_519, 37970,Continent.EUROPE));
		setPays.add(new Pays("Japon", 124_856_424, 42659,Continent.ASIE));
		setPays.add(new Pays("Chine", 1_408_089_559, 16624,Continent.ASIE));
		setPays.add(new Pays("Russie", 126_434_660, 27900,Continent.EUROPE));
		setPays.add(new Pays("Inde", 1_386_249_417, 5174,Continent.ASIE));
		
		//Réalisez une boucle qui affiche l’ensemble des pays
		for(Pays pays : setPays) {
			System.out.println(pays);
		}
		//Réalisez un comptage du nombre de pays par continent et affichez le résultat
		HashMap<Continent, Integer> mapContinent = new HashMap<>();
		for(Pays pays : setPays) {
			Continent continent = pays.getContinent();
			if(mapContinent.containsKey(continent)) {
				mapContinent.put(continent, mapContinent.get(continent)+1);
			}
			else {
				mapContinent.put(continent, 1);
			}
		}
		for(Continent continent : mapContinent.keySet()) {
			System.out.println(continent.getNom()+" : "+mapContinent.get(continent));
		}
		
	}

}
