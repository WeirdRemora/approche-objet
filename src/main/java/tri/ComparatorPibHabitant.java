package tri;

import java.util.Comparator;

import sets.Pays;

public class ComparatorPibHabitant implements Comparator<Pays> {

	
	/** Compare deux pays p1 et p2 en fonction de leur PIB par habitant
	 * positif: p1>p2 - 0: p1=P2 - négatif: p1<p2
	 */
	public int compare(Pays p1, Pays p2) {
		return (int)(p1.getPIBhab()-p2.getPIBhab());	
	}
	
}
