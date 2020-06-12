package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
	
	private int jours;
	private double remuneration;

	public Pigiste(String nom, String prenom, int jours, double remuneration) {
		super(nom, prenom);
		this.jours = jours;
		this.remuneration = remuneration;
	}
	
	public void afficherDonnees() {
		super.afficherDonnees();
		System.out.println("Statut : Pigiste");
	}

	@Override
	public double getSalaire() {
		return jours*remuneration;
	}

	public int getJours() {
		return jours;
	}

	public void setJours(int jours) {
		this.jours = jours;
	}

	public double getRemuneration() {
		return remuneration;
	}

	public void setRemuneration(double remuneration) {
		this.remuneration = remuneration;
	}

}
