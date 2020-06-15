package fr.diginamic.jdr;

public abstract class Creature extends Personnage {
	
	private int points;
	private String nom;

	public Creature() {
		this.setForce(forceInit());
		this.setPvMax(pvInit());
		this.setPv(this.getPvMax());
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
