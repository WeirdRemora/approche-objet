package tri;

import java.util.Comparator;

import sets.Pays;

public class ComparatorHabitant implements Comparator<Pays> {

	/** Compare deux pays p1 et p2 en fonction de leur nombre d'habitants
	 * positif: p1>p2 - 0: p1=P2 - négatif: p1<p2
	 */
	public int compare(Pays p1, Pays p2) {
		return p1.getNbHab()-p2.getNbHab();
	}

	

}
