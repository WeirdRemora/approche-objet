package fr.diginamic.banque.entites;

public abstract class Operation {
	private String date;
	private float montant;
	
	public Operation(String date, float montant) {
		this.date = date;
		this.montant = montant;
	}
	
	abstract String afficherType();
	
	abstract public float diffSolde();


	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

}
