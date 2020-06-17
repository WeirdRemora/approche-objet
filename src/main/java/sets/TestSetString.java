package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {

	public static void main(String[] args) {
		String[] array = {"USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"};
		HashSet<String> set = new HashSet<String>();
		set.addAll(Arrays.asList(array));
		System.out.println(set);
		
		//Recherchez le pays dans cette liste qui a le plus grand nombre de lettres
		Iterator<String> iterator = set.iterator();
		int LMax = 0;
		String aSupprimer=null;
		while(iterator.hasNext()) {
			String pays = iterator.next();
			if(pays.length() > LMax) {
				LMax = pays.length();
				aSupprimer = pays;
			}
		}
		
		//Supprimez ce pays
		set.remove(aSupprimer);
		System.out.println(set);
		
	}

}
