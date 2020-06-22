package listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		
		ArrayList<Integer> liste = new ArrayList<Integer>();
		
		//creez une ArrayList d’entiers et stockez y tous les nombres de 1 à 100	
		
		for (int i=1 ; i <= 100 ; i++) {
			liste.add(i);
		}
		
		//Affichez la taille de la liste
		System.out.println("Taille de la liste : "+liste.size());
	}

}
