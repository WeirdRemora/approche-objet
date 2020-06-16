package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		String[] listeVilleInit = {"Nice","Carcassonne","Narbonne","Lyon","Foix","Pau","Marseille","Tarbes"};
		ArrayList<String> liste = new ArrayList<String>();
		for (String ville : listeVilleInit) {
			liste.add(ville);
		}
		
		//Recherchez la ville dans cette liste qui a le plus grand nombre de lettres
		int max = 0;
		String plusLongueVille="";
		for (String ville : liste ) {
			if (ville.length() > max) {
				max = ville.length();
				plusLongueVille = ville;
			}
		}
		System.out.println("Ville au nom le plus long : "+plusLongueVille);
		
		//Modifiez le contenu de la liste de manière à mettre tous les noms de villes en
		//majuscules.
		for (int i = 0 ; i<liste.size() ; i++) {
			liste.set(i, liste.get(i).toUpperCase());
		}
		System.out.println("Villes en majuscule :");
		for (String ville : liste) {
			System.out.println(ville);
		}
		
		//Supprimez de la liste les villes dont le nom commence par la lettre N.
		Iterator<String> iterator = liste.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().charAt(0) == 'N') {
				iterator.remove();
			}
		}
		System.out.println("Villes qui ne commencent pas par N :");
		for (String ville : liste) {
			System.out.println(ville);
		}		
	}

}
