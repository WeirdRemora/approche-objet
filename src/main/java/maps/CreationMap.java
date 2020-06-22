package maps;

import java.util.HashMap;
import java.util.Map;

class CreationMap {

	public static void main(String[] args) {
		
		//Créez une map nommée mapSalaires et qui permet de stocker les informations
		//de salaire (valeur) en fonction du prénom de la personne (clé).
		
		Map<String, Integer> map = new HashMap<>();
		map.put("Paul", 1750);
		map.put("Hicham", 1825);
		map.put("Yu", 2250);
		map.put("Ingrid", 2015);
		map.put("Chantal", 2418);
		
		//Une fois la map créée, affichez sa taille
		System.out.println("Taille de la map : "+map.size());

	}

}
