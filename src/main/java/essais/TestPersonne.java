package essais;
import entites.Personne;
import entites.AdressePostale;

public class TestPersonne {

	public static void main(String[] args) {
		AdressePostale a1 = new AdressePostale(42,"Rue des cookies",01000,"Cookieville");
		AdressePostale a2 = new AdressePostale(24,"Rue des brownies",10000,"Brownieville");
		Personne p1 = new Personne("Dupont","Jean-Léo",a1);
		Personne p2 = new Personne("Dupond","Henri-Léo",a2);	

	}

}
