package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String date, float montant) {
		super(date, montant);
	}

	public String afficherType() {
		return "Débit";
	}
}
