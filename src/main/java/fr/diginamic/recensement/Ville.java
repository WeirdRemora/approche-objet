package fr.diginamic.recensement;

import java.text.NumberFormat;

public class Ville{
	private Region region;
	private Departement departement;
	private String codeCommune;
	private String commune;
	private int population;
	
	/** Constructeur
	 * @param region Région
	 * @param departement Département
	 * @param codeCommune Code de la commune
	 * @param commune Nom de la commune
	 * @param population Population
	 */
	public Ville(Region region, Departement departement, String codeCommune, String commune, int population) {
		this.region = region;
		this.departement = departement;
		this.codeCommune = codeCommune;
		this.commune = commune;
		this.population = population;
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
	 * @return the departement
	 */
	public Departement getDepartement() {
		return departement;
	}
	/** Setter
	 * @param departement the departement to set
	 */
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	/** Getter
	 * @return the codeCommune
	 */
	public String getCodeCommune() {
		return codeCommune;
	}
	/** Setter
	 * @param codeCommune the codeCommune to set
	 */
	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}
	/** Getter
	 * @return the commune
	 */
	public String getCommune() {
		return commune;
	}
	/** Setter
	 * @param commune the commune to set
	 */
	public void setCommune(String commune) {
		this.commune = commune;
	}
	/** Getter
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}
	/** Setter
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}
	@Override
	public String toString() {
		//population avec espaces entre les nombres (ex: 100 000 000)
		return commune+" ("+departement.getCode()+") : "+NumberFormat.getIntegerInstance().format(population)+" habitants";
	}
	

}
