package fr.diginamic.jdr;

/** La classe personnage comprend les héros et les créatures
 * @author Leo
 *
 */
public abstract class Personnage {
	
	private int force;
	private int pvMax;
	private int pv;
	private int jetMax;
	private int jetMin;
	
	/**
	 * Tous les personnages ont un bonus d'attaque entre 1 et 10, mais celui-ci peut être modifié
	 */
	public Personnage() {
		jetMax = 1;
		jetMax = 10;
	}
	
	/**
	 * @return valeur de l'attaque du personnage = force + nombre entre 1 et 10
	 */
	public int attaque() {
		return force + (int)(Math.random()*(jetMax-jetMin))+jetMin;
	}
	
	public int encaisse(int degats) {
		pv -= degats;
		return degats;
	}
	
	/**
	 * Affiche une barre de points de vie en fonction des points de vie restants
	 */
	public void affichePv() {
		System.out.print("[");
		for(int i = 0 ; i <= pvMax ; i++) {
			//affiche un motif ou un vide selon les pv restants
			System.out.print((i<=pv)?'/':' ');
		}
		System.out.println("]\t("+pv+"/"+pvMax+")");
	}
	
	public abstract int forceInit();
	public abstract int pvInit();
	
	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public int getPvMax() {
		return pvMax;
	}

	public void setPvMax(int pvMax) {
		this.pvMax = pvMax;
	}

	public int getJetMax() {
		return jetMax;
	}

	public void setJetMax(int jetMax) {
		this.jetMax = jetMax;
	}

	public int getJetMin() {
		return jetMin;
	}

	public void setJetMin(int jetMin) {
		this.jetMin = jetMin;
	}

}
