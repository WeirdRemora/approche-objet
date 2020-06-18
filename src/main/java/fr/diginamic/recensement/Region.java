package fr.diginamic.recensement;

public class Region {
	private String nom;
	private String code;
	
	/** Constructeur
	 * @param nom Nom de la r�gion
	 * @param code Code de la r�gion
	 */
	public Region(String nom, String code) {
		this.nom = nom;
		this.code = code;
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
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/** Setter
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

}
