package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestVille {

	public static void main(String[] args) {
		ArrayList<Ville> listeVille = new ArrayList<Ville>();
		listeVille.add(new Ville("Nice",343000));
		listeVille.add(new Ville("Carcassonne",47800));
		listeVille.add(new Ville("Narbonne",53400));
		listeVille.add(new Ville("Lyon",484000));
		listeVille.add(new Ville("Foix",9700));
		listeVille.add(new Ville("Pau",77200));
		listeVille.add(new Ville("Marseille",850700));
		listeVille.add(new Ville("Tarbes",40600));
		
		//Recherchez et affichez la ville la plus peuplée
		int maxHab = 0;
		Ville villePlusPeuplee = null;
		for(int i=0 ; i<listeVille.size() ; i++) {
			if(listeVille.get(i).getNbHabitants() > maxHab) {
				maxHab = listeVille.get(i).getNbHabitants();
				villePlusPeuplee = listeVille.get(i);
			}
		}
		System.out.println("Ville la plus peuplée : "+villePlusPeuplee.getNom());
		
		//Supprimez la ville la moins peuplée
		Ville villeMoinsPeuplee = listeVille.get(0);
		for (int i=0 ; i<listeVille.size() ; i++) {
			if ( listeVille.get(i).getNbHabitants() < villeMoinsPeuplee.getNbHabitants()) {
				villeMoinsPeuplee = listeVille.get(i);
			}
		}
		listeVille.remove(villeMoinsPeuplee);
		
		// Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules
		for(int i=0 ; i<listeVille.size() ; i++) {
			if(listeVille.get(i).getNbHabitants() > 100000) {
				listeVille.get(i).setNom(listeVille.get(i).getNom().toUpperCase());
			}
		}
		
		for(Ville ville : listeVille) {
			System.out.println(ville.getNom()+", "+ville.getNbHabitants()+" hab.");
		}
		
	}

}
