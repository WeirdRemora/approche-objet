package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import sets.Pays;

public class TestTri {

	public static void main(String[] args) {
		List<Pays> listePays = new ArrayList<Pays>();
		listePays.add(new Pays("USA", 328_239_523, 62606));
		listePays.add(new Pays("France", 69_861_344, 43551));
		listePays.add(new Pays("Allemagne", 82_801_531, 50206));
		listePays.add(new Pays("UK", 63_421_628, 43620));
		listePays.add(new Pays("Italie", 61_302_519, 37970));
		listePays.add(new Pays("Japon", 124_856_424, 42659));
		listePays.add(new Pays("Chine", 1_408_089_559, 16624));
		listePays.add(new Pays("Russie", 126_434_660, 27900));
		listePays.add(new Pays("Inde", 1_386_249_417, 5174));
		
		Collections.sort(listePays);
		
		System.out.println("Tri par nombre d'habitants :");
		Collections.sort(listePays, new ComparatorHabitant());
		System.out.println(listePays);
		
		System.out.println("Tri par PIB/hab :");
		Collections.sort(listePays, new ComparatorPibHabitant());
		System.out.println(listePays);
		
	}

}
