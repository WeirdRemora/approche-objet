package fr.diginamic.recensement;

public class Departement {
	private Region region;
	private String code;
	
	/** Constructeur
	 * @param region R�gion dans laquelle se trouve le d�partement
	 * @param code Code du d�partement
	 */
	public Departement(Region region, String code) {
		this.region = region;
		this.code = code;
	}
	/** Getter
	 * @return the region
	 */
	public Region getRegion() {
		return region;
	}
	/** Setter
	 * @param region the region to set
	 */
	public void setRegion(Region region) {
		this.region = region;
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
