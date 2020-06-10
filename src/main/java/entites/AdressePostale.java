package entites;

public class AdressePostale {

	public int numeroRue;
	public String nomRue;
	public int codePostal;
	public String Ville;
	
	public AdressePostale(int numeroRue, String nomRue, int codePostal, String Ville) {
		this.numeroRue = numeroRue;
		this.nomRue = nomRue;
		this.codePostal = codePostal;
		this.Ville = Ville;
	}
}
