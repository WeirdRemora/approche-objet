package sets;

public class Pays {
	private String nom;
	private int nbHab;
	private double PIBhab;
	
	public Pays(String nom, int nbHab, double pIBhab) {
		this.nom = nom;
		this.nbHab = nbHab;
		PIBhab = pIBhab;
	}
	
	public double PIBtot() {
		return nbHab*PIBhab;
	}
	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/** Getter
	 * @return the nbHab
	 */
	public int getNbHab() {
		return nbHab;
	}
	/** Setter
	 * @param nbHab the nbHab to set
	 */
	public void setNbHab(int nbHab) {
		this.nbHab = nbHab;
	}
	/** Getter
	 * @return the pIBhab
	 */
	public double getPIBhab() {
		return PIBhab;
	}
	/** Setter
	 * @param pIBhab the pIBhab to set
	 */
	public void setPIBhab(double pIBhab) {
		PIBhab = pIBhab;
	}
	@Override
	public String toString() {
		return nom + ": Nombre d'habitants = " + nbHab + ", PIB total = " + this.PIBtot()+"\n";
	}
	

}
