package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	
	int taux;

	public CompteTaux(int num, int solde, int taux) {
		super(num, solde);
		this.taux = taux;
	}

	@Override
	public String toString() {
		return  super.toString() + "CompteTaux [taux=" + taux +"]";
	}

}
