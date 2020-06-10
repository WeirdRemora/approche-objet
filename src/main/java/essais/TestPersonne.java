package essais;
import entites.Personne;
import entites.AdressePostale;

public class TestPersonne {

	public static void main(String[] args) {
		AdressePostale a1 = new AdressePostale(42,"Rue des cookies",01000,"Cookieville");
		AdressePostale a2 = new AdressePostale(24,"Rue des brownies",10000,"Brownieville");
		Personne p1 = new Personne("Dupont","Jean-Léo",a1);
		Personne p2 = new Personne("Dupond","Henri-Léo",a2);
		p1 = new Personne("Martin","Pierre-Léo",a1);
		AdressePostale a3 = new AdressePostale(10,"Rue des pancakes",24000,"Pancakeville");
		p1.setAdressePostale(a3);

	}

}
