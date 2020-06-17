package tri;

import java.util.Comparator;

import sets.Pays;

public class ComparatorHabitant implements Comparator<Pays> {

	public int compare(Pays p1, Pays p2) {
		return p1.getNbHab()-p2.getNbHab();
	}

	

}
