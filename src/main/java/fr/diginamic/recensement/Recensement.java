package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;

/** Liste de villes où l'on met les données du recensement
 * @author Leo
 *
 */
public class Recensement {
	private List<Ville> villes = new ArrayList<>();
	
	public List<Ville> getVilles() {
		return villes;
	}
	
	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}
}