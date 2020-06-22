package fr.diginamic.recensement;

import java.util.Scanner;

/** Classe de service pour regrouper les méthodes des choix du menu 
 * @author Leo
 *
 */
public abstract class MenuService {
	/**
	 * @param recensement Les données du recensement dans un objet Recensement
	 * @param scanner
	 */
	public abstract void traiter(Recensement recensement, Scanner scanner) ;
}
