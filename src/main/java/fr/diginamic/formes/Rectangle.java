package fr.diginamic.formes;

public class Rectangle extends Forme {
	
	private double largeur;
	private double longueur;

	public Rectangle(double largeur, double longueur) {
		this.largeur = largeur;
		this.longueur = longueur;
	}

	@Override
	public double calculerSurface() {
		return longueur*largeur;
	}

	@Override
	public double calculerPerimetre() {
		return 2*(longueur+largeur);
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	
}
