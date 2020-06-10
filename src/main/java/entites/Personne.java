package entites;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adressePostale;
	
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	public Personne(String nom, String prenom, AdressePostale adressePostale){
		this.nom = nom;
		this.prenom = prenom;
		this.adressePostale = adressePostale;
	}
	
	public String NomComplet() {
		String nomComplet = nom.toUpperCase()+" "+prenom;
		return nomComplet;
	}
	public void SetNom(String nom) {
		this.nom = nom;
	}
	public String getNom() {
		return nom;
	}
	public void SetPrenom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public AdressePostale getAdressePostale() {
		return adressePostale;
	}
	public void setAdressePostale(AdressePostale adressePostale) {
		this.adressePostale = adressePostale;
	}

	
	
}

