package fr.diginamic.salaire;

abstract class Intervenant {
	private String nom;
	private String prenom;
	
	abstract public double getSalaire();
	
	public void afficherDonnees() {
		System.out.println("Nom : "+nom+"\nPrénom : "+prenom+"\nSalaire : "+this.getSalaire());
	}

	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
}
