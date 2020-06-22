package fr.diginamic.testenumeration;

public enum Saison {
	
	
	PRINTEMPS("Printemps",1),
	ETE("Été",2),
	AUTOMNE("Automne",3),
	HIVER("Hiver",4);
	
	String libelle;
	int numero;
	
	/** Constructeur
	 * @param libelle Libellé
	 * @param numero Numéro
	 */
	private Saison(String libelle, int numero) {
		this.libelle=libelle;
		this.numero=numero;
	}
	/** Prend un libellé et renvoie une saison correspondant à ce libellé
	 * Si le libellé n'est pas dans l'énumération, renvoie null
	 * @param libelle Libellé
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
