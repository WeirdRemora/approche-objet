package fr.diginamic.testenumeration;

public enum Saison {
	
	
	PRINTEMPS("Printemps",1),
	ETE("Été",2),
	AUTOMNE("Automne",3),
	HIVER("Hiver",4);
	
	String libelle;
	int numero;
	
	/** Constructeur
	 * @param libelle Libell�
	 * @param numero Num�ro
	 */
	private Saison(String libelle, int numero) {
		this.libelle=libelle;
		this.numero=numero;
	}
	/** Prend un libell� et renvoie une saison correspondant � ce libell�
	 * Si le libell� n'est pas dans l'�num�ration, renvoie null
	 * @param libelle Libell�
	 * @return Saison
	 */
	public static Saison getSaison(String libelle) {
		Saison[] listeSaison = Saison.values();
		for(Saison saison : listeSaison) {
			if(saison.getLibelle().equals(libelle)) {
				return saison;
			}
		}
		return null;
	}

	/** Getter
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/** Setter
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/** Getter
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/** Setter
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	

}
