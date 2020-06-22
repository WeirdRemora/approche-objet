package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class Application {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//Remplissage de l'instance recensement
		Recensement recensement = new Recensement();
		try {
			File file = new File("recensement 2016.csv"); //fichier à la racine du projet pour l'avoir dans le git
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			lignes.remove(0); //on enlève la ligne de noms des attributs
			for(String ligne : lignes) {
				String[] morceaux = ligne.split(";");
				String codeRegion = morceaux[0];
				String nomRegion = morceaux[1];
				String codeDepartement = morceaux[2];
				String codeCommune = morceaux[5];
				String nomCommune = morceaux[6];
				String population = morceaux[7];
				
				// Pour la population, avant la conversion en int, il faut d�abord supprimer les
				// espaces qui se trouvent � l�int�rieur.
				int populationTotale = Integer.parseInt(population.replace(" ", "").trim());
				
				// On cree maintenant la ville avec toutes ses donn�es utiles
				Region region = new Region(nomRegion,codeRegion);
				Departement departement = new Departement(region,codeDepartement);
				Ville ville = new Ville(region,departement,codeCommune,nomCommune,populationTotale);
				recensement.getVilles().add(ville);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		int choix = 0;
		do {
			System.out.println("1. Population d�une ville donn�e\n"
					+ "2. Population d�un d�partement donn�\n"
					+ "3. Population d�une r�gion donn�e\n"
					+ "4. Afficher les 10 r�gions les plus peupl�es\n"
					+ "5. Afficher les 10 d�partements les plus peupl�s\n"
					+ "6. Afficher les 10 villes les plus peupl�es d�un d�partement\n"
					+ "7. Afficher les 10 villes les plus peupl�es d�une r�gion\n"
					+ "8. Afficher les 10 villes les plus peupl�es de France\n"
					+ "9. Sortir");
			choix = scanner.nextInt();
			switch(choix) {
			//Population d�une ville donn�e
			case(1):
				MenuService recherche = new RecherchePopulationVille();
				recherche.traiter(recensement, scanner);
				break;
			//Population d�un d�partement donn�
			case(2):
				recherche = new RecherchePopulationDepartement();
				recherche.traiter(recensement, scanner);
				break;
			//Population d�une r�gion donn�e
			case(3):
				recherche = new RecherchePopulationRegion();
				recherche.traiter(recensement, scanner);
				break;
			//Afficher les 10 r�gions les plus peupl�es
			case(4):
				recherche = new RecherchePopulationRegionTop10();
				recherche.traiter(recensement, scanner);
				break;
			//Afficher les 10 d�partements les plus peupl�s
			case(5):
				recherche = new RecherchePopulationDepartementTop10();
				recherche.traiter(recensement, scanner);
				break;
			//Afficher les 10 villes les plus peupl�es d�un d�partement
			case(6):
				recherche = new RecherchePopulationTop10ParDepartement();
				recherche.traiter(recensement, scanner);
				break;
			//Afficher les 10 villes les plus peupl�es d�une r�gion
			case(7):
				recherche = new RecherchePopulationVilleTop10ParRegion();
				recherche.traiter(recensement, scanner);
				break;
			//Afficher les 10 villes les plus peupl�es de France
			case(8):
				recherche = new RecherchePopulationVilleTop10();
				recherche.traiter(recensement, scanner);
				break;
			//Sortir
			case(9):
				System.out.println("Au revoir !");
				break;
			default:
				System.out.println("Veuillez rentrer un nombre entre 1 et 9");
				break;
			}
		}
		while(choix != 9);
		
	}

}
