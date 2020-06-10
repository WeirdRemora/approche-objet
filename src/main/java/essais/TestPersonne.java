package essais;
import entites.Personne;
import entites.AdressePostale;

public class TestPersonne {

	public static void main(String[] args) {
		Personne p1 = new Personne();
		Personne p2 = new Personne();
		p1.prenom = "Jean-Léo";
		p1.nom = "Dupont";
		p1.adressePostale = new AdressePostale();
		p1.adressePostale.nomRue = "Rue des cookies";
		p1.adressePostale.numeroRue = 42;
		p1.adressePostale.codePostal = 01000;
		p1.adressePostale.Ville = "Cookieville";
		
		p2.prenom = "Henri-Léo";
		p2.nom = "Dupond";
		p2.adressePostale = new AdressePostale();
		p2.adressePostale.nomRue = "Rue des brownies";
		p2.adressePostale.numeroRue = 24;
		p2.adressePostale.codePostal = 10000;
		p2.adressePostale.Ville = "Brownieville";		

	}

}
