package entites;

public class AdressePostale {

	public int numeroRue;
	public String nomRue;
	public int codePostal;
	public String ville;
	
	/**
	 * @param numeroRue numéro de rue
	 * @param nomRue nom de rue
	 * @param codePostal code postal
	 * @param ville ville
	 */
	public AdressePostale(int numeroRue, String nomRue, int codePostal, String ville) {
		this.numeroRue = numeroRue;
		this.nomRue = nomRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
}
