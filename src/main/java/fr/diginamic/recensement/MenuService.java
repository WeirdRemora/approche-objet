package fr.diginamic.recensement;

import java.util.Scanner;

/** Classe de service pour regrouper les m�thodes des choix du menu 
 * @author Leo
 *
 */
public abstract class MenuService {
	/**
	 * @param recensement Les donn�es du recensement dans un objet Recensement
	 * @param scanner
	 */
	public abstract void traiter(Recensement recensement, Scanner scanner) ;
}
