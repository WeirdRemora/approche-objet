package tri;

import java.util.Comparator;

import sets.Pays;

public class ComparatorPibHabitant implements Comparator<Pays> {

	
	public int compare(Pays p1, Pays p2) {
		return (int)(p1.getPIBhab()-p2.getPIBhab());	
	}
	
}
