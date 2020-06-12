package fr.diginamic.banque.entites;

public class Compte {
	private String num;
	private float solde;
	private Operation[] listeOp = {};
	private Client client;
	
	public Compte(String num, float solde) {
		this.num = num;
		this.solde = solde;
	}

	public Compte(String num, float solde, Client client) {
		super();
		this.num = num;
		this.solde = solde;
		this.client = client;
	}

	public void ajoutOperation(Operation op){
		Operation[] nvListe = new Operation[listeOp.length+1];
		for(int i=0 ; i<listeOp.length ; i++) {
			nvListe[i] = listeOp[i];
		}
		listeOp = nvListe;
		solde += op.diffSolde();
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

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}
	
	public Operation[] getListeOp() {
		return listeOp;
	}

	public void setListeOp(Operation[] listeOp) {
		this.listeOp = listeOp;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
}
