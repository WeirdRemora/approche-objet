package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		double a = 3D;
		double b = 2D;
		System.out.println("R�sultat addition : "+a+" + "+b+" = "+Operations.calcul(a, b, '+'));
		System.out.println("R�sultat soustraction : "+a+" - "+b+" = "+Operations.calcul(a, b, '-'));
		System.out.println("R�sultat multiplication : "+a+" * "+b+" = "+Operations.calcul(a, b, '*'));
		System.out.println("R�sultat division : "+a+" / "+b+" = "+Operations.calcul(a, b, '/'));
		
	}

}
