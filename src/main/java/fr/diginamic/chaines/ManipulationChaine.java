package fr.diginamic.chaines;

import fr.diginamic.banque.entites.Client;
import fr.diginamic.banque.entites.Compte;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;012543;1 523.5";
		
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		
		int tailleChaine = chaine.length();
		System.out.println("Taille de la chaine: "+ tailleChaine);
		
		int indexPremierPV = chaine.indexOf(';');
		System.out.println("Index du premier \";\" : "+indexPremierPV);
		
		String nom = chaine.substring(0,indexPremierPV);
		System.out.println("Nom de famille en majuscule : "+nom.toUpperCase());
		System.out.println("Nom de famille en minuscule : "+nom.toLowerCase());
		
		String[] tabString = chaine.split(";");
		System.out.println("Affichage du tableau :");
		for (int i=0 ; i<tabString.length ; i++) {
			System.out.println(tabString[i]);
		}
		
		String prenom = tabString[1];
		String num = tabString[2];
		float solde = Float.valueOf(tabString[3].replace(" ",""));
		Client cl1 = new Client(nom,prenom);
		Compte co1 = new Compte(num,solde,cl1);
		
		System.out.println(cl1);
		System.out.println(co1);

	}

}
