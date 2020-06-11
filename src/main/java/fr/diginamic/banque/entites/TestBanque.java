package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		Compte c1 = new Compte("01",500);
		System.out.println(c1);
		CompteTaux ct1 = new CompteTaux("02",1000,500);
		
		System.out.println("Tableau des comptes :");
		
		Compte[] tabC = {c1,ct1};
		for (int i=0 ; i < tabC.length ; i++) {
			System.out.println(tabC[i]);
		}
	}

}
