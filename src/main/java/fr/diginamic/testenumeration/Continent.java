package fr.diginamic.testenumeration;

public enum Continent {
	EUROPE("Europe"),
	ASIE("Asie"),
	AFRIQUE("Afrique"),
	AMERIQUE("Amérique"),
	OCEANIE("Océanie"),
	INCONNU("Inconnu");

	private String nom;
	
	
	private Continent(String nom) {
		this.nom=nom;
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
	
	
}
