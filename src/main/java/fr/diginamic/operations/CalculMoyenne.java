package fr.diginamic.operations;

public class CalculMoyenne {
	private double[] tab = {};

	public CalculMoyenne() {
	}
	
	public void ajout(double a) {
		double[] tab = new double[this.tab.length+1];
		for (int i=0 ; i<this.tab.length ; i++) {
			tab[i] = this.tab[i];
		}
		tab[tab.length-1] = a;
		this.tab = tab;
	}
	public double calcul() {
		double somme=0;
		for (int i=0; i<tab.length ; i++) {
			somme += tab[i];
		}
		return somme/tab.length;
	}
}
