package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	
	float taux;

	public CompteTaux(String num, float solde, float taux) {
		super(num, solde);
		this.taux = taux;
	}

	public float getTaux() {
		return taux;
	}

	public void setTaux(float taux) {
		this.taux = taux;
	}

	@Override
	public String toString() {
		return  super.toString() + "CompteTaux [taux=" + taux +"]";
	}

}
