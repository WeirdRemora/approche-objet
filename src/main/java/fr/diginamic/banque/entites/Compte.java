package fr.diginamic.banque.entites;

public class Compte {
	private String num;
	private int solde;
	private Operation[] listeOp = {};
	
	public Compte(String num, int solde) {
		this.num = num;
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte [num=" + num + ", solde=" + solde + "]";
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public int getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}
	
	public Operation[] getListeOp() {
		return listeOp;
	}

	public void setListeOp(Operation[] listeOp) {
		this.listeOp = listeOp;
	}

	public void ajoutOperation(Operation op){
		Operation[] nvListe = new Operation[listeOp.length+1];
		for(int i=0 ; i<listeOp.length ; i++) {
			nvListe[i] = listeOp[i];
		}
		listeOp = nvListe;
		if(op.afficherType()=="Crédit") {
			solde += op.getMontant();
		}
		else if(op.afficherType()=="Débit") {
			solde -= op.getMontant();
		}
	}

}
