package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		Cercle c1 = CercleFactory.CreerCercle(5);
		Cercle c2 = CercleFactory.CreerCercle(2);
		System.out.println("Périmètre cercle 1: "+c1.perimetre()+"\n"
				+"Surface cercle 1: "+c1.surface()+"\n"
				+"Périmètre cercle 2: "+c2.perimetre()+"\n"
				+"Surface cercle 2: "+c2.surface());
		

	}

}
