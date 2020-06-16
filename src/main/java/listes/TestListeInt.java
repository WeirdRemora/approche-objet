package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeInt {

	public static void main(String[] args) {
		
		ArrayList<Integer> liste = new ArrayList<Integer>();
		int[] listeInit = {-1,5,7,3,-2,4,8,5};
		for (int i : listeInit) {
			liste.add(i);
		}
		//Affichez tous les �l�ments de la liste
		System.out.println("Affichage de la liste :");
		for(int i : liste) {
			System.out.println(i);
		}
		//Affichez la taille de la liste
		System.out.println("Taille de la liste : "+liste.size());
		
		//Recherchez et affichez le plus grand �l�ment de la liste
		int max = liste.get(0);
		for (int i : liste) {
			if (i>max) {
				max = i;
			}
		}
		System.out.println("�l�ment le plus grand de la liste : "+max);
		
		//Supprimez le plus petit �l�ment de la liste et affichez le r�sultat
		int min = liste.get(0);
		int minIndex = 0;
		for (int i = 0 ; i<liste.size() ; i++) {
			if (liste.get(i) < min ) {
				minIndex = i;
			}
		}
		liste.remove(minIndex);
		System.out.println("Affichage avec le plus petit �l�ment retir� :");
		for(int i : liste) {
			System.out.println(i);
		}
		
		//Recherchez tous les �l�ments n�gatifs et modifiez les de mani�re � ce qu�ils deviennent
		//positifs.
		Iterator<Integer> iterator = liste.iterator();
		{
			int i=0;
			while(iterator.hasNext()) {
				int nb = iterator.next();
				if(nb < 0) {
					liste.set(i, -nb);
				}
			}
		}
		System.out.println("Affichage avec les n�gatifs rendus positifs :");
		for(int i : liste) {
			System.out.println(i);
		}
		
		
	}

}
