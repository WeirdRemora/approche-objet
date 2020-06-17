package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestPays {

	public static void main(String[] args) {
		HashSet<Pays> setPays = new HashSet<Pays>();
		setPays.add(new Pays("USA", 328_239_523, 62606));
		setPays.add(new Pays("France", 69_861_344, 43551));
		setPays.add(new Pays("Allemagne", 82_801_531, 50206));
		setPays.add(new Pays("UK", 63_421_628, 43620));
		setPays.add(new Pays("Italie", 61_302_519, 37970));
		setPays.add(new Pays("Japon", 124_856_424, 42659));
		setPays.add(new Pays("Chine", 1_408_089_559, 16624));
		setPays.add(new Pays("Russie", 126_434_660, 27900));
		setPays.add(new Pays("Inde", 1_386_249_417, 5174));
		
		//Recherchez le pays avec le PIB/habitant le plus important
		Iterator<Pays> iterator = setPays.iterator();
		Pays paysPIBMax=null;
		double PIBmax = iterator.next().getPIBhab();
		while(iterator.hasNext()) {
			Pays pays = iterator.next();
			if(pays.getPIBhab() > PIBmax) {
				PIBmax = pays.getPIBhab();
				paysPIBMax = pays;
			}
		}
		System.out.println("Pays avec le PIB le plus important : "+paysPIBMax);
		
		//Recherchez le pays avec le PIB total le plus important
		iterator = setPays.iterator();
		Pays paysPIBTotMax=null;
		Pays paysPIBTotMin=null;
		double PIBTotMax = iterator.next().PIBtot();
		double PIBTotMin = PIBTotMax;
		while(iterator.hasNext()) {
			Pays pays = iterator.next();
			if(pays.PIBtot() > PIBTotMax) {
				PIBTotMax = pays.PIBtot();
				paysPIBTotMax = pays;
			}
			if(pays.PIBtot() < PIBTotMin) {
				PIBTotMin = pays.PIBtot();
				paysPIBTotMin = pays;
			}
		}
		System.out.println("Pays avec le PIB total le plus important : "+paysPIBTotMax);
		
		//Modifiez le contenu du HashSet pour mettre en majuscule le pays qui a le PIB total le
		//plus petit
		iterator = setPays.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().equals(paysPIBTotMin)) {
				paysPIBTotMin.setNom(paysPIBTotMin.getNom().toUpperCase());
			}
		}
		System.out.println("Pays avec le PIB total le plus petit : "+paysPIBTotMin);
		
		//Supprimez le pays dont le PIB total est le plus petit
		setPays.remove(paysPIBTotMin);
		
		//Affichez l’ensemble des pays ainsi modifiés avec leur nom, nombre d’habitants et PIB
		//total
		System.out.println(setPays);
		

	}

}
