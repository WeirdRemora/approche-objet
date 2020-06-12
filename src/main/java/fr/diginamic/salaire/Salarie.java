package fr.diginamic.salaire;

public class Salarie extends Intervenant {
	
	private double salaire;

	public Salarie(String nom, String prenom, double salaire) {
		super(nom, prenom);
		this.salaire = salaire;
	}
	
	public void afficherDonnees() {
		super.afficherDonnees();
		System.out.println("Statut : Salarié");
	}

	@Override
	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

}
