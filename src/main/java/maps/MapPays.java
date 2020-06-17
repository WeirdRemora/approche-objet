package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sets.Pays;

public class MapPays {

	public static void main(String[] args) {
		Map<String, Pays> mapPays = new HashMap<>();
		
		//je copie-colle juste l'ArrayList pour pas m'embêter à faire put() pour chaque élément
		List<Pays> listePays = new ArrayList<Pays>();
		listePays.add(new Pays("USA", 328_239_523, 62606));
		listePays.add(new Pays("France", 69_861_344, 43551));
		listePays.add(new Pays("Allemagne", 82_801_531, 50206));
		listePays.add(new Pays("UK", 63_421_628, 43620));
		listePays.add(new Pays("Italie", 61_302_519, 37970));
		listePays.add(new Pays("Japon", 124_856_424, 42659));
		listePays.add(new Pays("Chine", 1_408_089_559, 16624));
		listePays.add(new Pays("Russie", 126_434_660, 27900));
		listePays.add(new Pays("Inde", 1_386_249_417, 5174));
		
		//je fais put() ici
		for(Pays pays : listePays) {
			mapPays.put(pays.getNom(), pays);
		}
		
		//Recherchez et supprimez le pays qui a le moins d’habitants
		Pays paysMoinsPeuple = mapPays.values().iterator().next();
		for(Pays pays : mapPays.values()) {
			if(pays.getNbHab() < paysMoinsPeuple.getNbHab()) {
				paysMoinsPeuple = pays;
			}
		}
		mapPays.remove(paysMoinsPeuple.getNom());
		System.out.println(mapPays);

	}

}
