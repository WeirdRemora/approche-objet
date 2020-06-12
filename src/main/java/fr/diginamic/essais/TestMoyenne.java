package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		CalculMoyenne m1 = new CalculMoyenne();
		m1.ajout(2);
		m1.ajout(5);
		m1.ajout(-8);
		System.out.println("Moyenne : "+m1.calcul());
		
		CalculMoyenne m2 = new CalculMoyenne();
		m2.ajout(m1.calcul());
		m2.ajout(10);
		System.out.println("Moyenne : "+m2.calcul());

	}

}
