package interfaces;

public class Rectangle implements ObjetGeometrique {
	
	double longueur;
	double largeur;

	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public double perimetre() {
		return 2*(longueur+largeur);
	}

	public double surface() {
		return longueur*largeur;
	}

}
