package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		
		//Utilisez une boucle pour affichez toutes les saisons.
		for(Saison saison : Saison.values()) {
			System.out.println("Saison "+saison.getNumero()+" : "+saison.getLibelle());
		}
		
		//Utilisez une méthode de base des énumérations pour retrouver et afficher le
		//libellé de l’instance de Saison dont le nom est ETE.
		String nom = "ETE";
		System.out.println("Libellé de ETE : "+Saison.valueOf(nom).getLibelle());
		
		String libelle = "Hiver";
		Saison hiver = Saison.getSaison(libelle);
		System.out.println("La saison est : "+hiver.getLibelle());
		

	}

}
