package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetDouble {

	public static void main(String[] args) {
		Double[] liste = {1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01};
		Set<Double> set = new HashSet<Double>(Arrays.asList(liste));
		System.out.println(set);
		
		//Recherchez le plus grand élément de la collection
		Iterator<Double> iterator = set.iterator();
		double  max = iterator.next();
		while(iterator.hasNext()) {
			double next = iterator.next();
			if (next > max) {
				max = next;
			}
		}
		System.out.println("Plus grand élément : "+max);
		
		//Supprimez le plus petit élément de la collection
		iterator = set.iterator();
		double min = iterator.next();
		while(iterator.hasNext()) {
			double next = iterator.next();
			if (next < min) {
				min = next;
			}
		}
		System.out.println("Plus petit élément : "+min);
		set.remove(min);
		System.out.println(set);
		
	}

}
