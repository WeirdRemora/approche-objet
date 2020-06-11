package interfaces;

public class Cercle implements ObjetGeometrique {
	
	double rayon;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	public double surface() {
		return rayon*rayon*Math.PI;
	}
	
	public double perimetre() {
		return rayon*2*Math.PI;
	}


}
