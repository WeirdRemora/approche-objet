package fr.diginamic.banque.entites;

public class Compte {
	private int num;
	private int solde;
	
	public Compte(int num, int solde) {
		this.num = num;
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte [num=" + num + ", solde=" + solde + "]";
	}
	

}
