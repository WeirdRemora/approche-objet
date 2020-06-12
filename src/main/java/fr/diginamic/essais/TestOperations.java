package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		double a = 3D;
		double b = 2D;
		System.out.println("Résultat addition : "+a+" + "+b+" = "+Operations.calcul(a, b, '+'));
		System.out.println("Résultat soustraction : "+a+" - "+b+" = "+Operations.calcul(a, b, '-'));
		System.out.println("Résultat multiplication : "+a+" * "+b+" = "+Operations.calcul(a, b, '*'));
		System.out.println("Résultat division : "+a+" / "+b+" = "+Operations.calcul(a, b, '/'));
		
	}

}
