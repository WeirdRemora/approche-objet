package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.Wc;

public class TestMaison {

	public static void main(String[] args) {
		
		Salon salon = new Salon(20,0);
		Chambre chambre1 = new Chambre(10,0);
		Chambre chambre2 = new Chambre(12,1);
		Cuisine cuisine = new Cuisine(6,0);
		SalleDeBain sdb = new SalleDeBain(6,1);
		Wc wc = new Wc(2,1);
		Wc wcNonEuclidiens = new Wc(-8,0);
		Chambre chambreSouterraine = new Chambre(30,-1);
		
		Maison maison = new Maison();
		maison.ajouterPiece(salon);
		maison.ajouterPiece(chambre1);
		maison.ajouterPiece(chambre2);
		maison.ajouterPiece(cuisine);
		maison.ajouterPiece(sdb);
		maison.ajouterPiece(wc);
		maison.ajouterPiece(null);
		maison.ajouterPiece(wcNonEuclidiens);
		maison.ajouterPiece(chambreSouterraine);
		System.out.println("Superficie RDC : "+maison.superficieEtage(0)+"\n"
				+"Superficie 1er étage : "+maison.superficieEtage(1)+"\n"
				+"Superficie totale : "+maison.superficieTotale());
		
		System.out.println("Nombre de chambres : "+maison.nombrePieces(Chambre.class)+"\n"
		+"Superficie de chambres : "+maison.superficiePieces(Chambre.class));

	}

}
