package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		//Créez une instance de la classe java.util.Date à la date du jour en utilisant un de
		//ses constructeurs
		Date date1 = new Date(120,5,19);
		//Affichez l’instance ainsi créée au format suivant : jour/mois/année
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(format1.format(date1));
		
		//Créez une instance de la classe Date à la date du 19 mai 2016 à 23h59 et 30
		//secondes
		Date date2 = new Date(116,4,19,23,59,30);
		//Affichez l’instance ainsi créée au format suivant : année/mois/jour heure:minute:seconde
		SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(format2.format(date2));
		
		//Créez une instance de Date contenant la date/heure système et affichez-la au
		//même format que ci-dessus.
		Date date3 = new Date();
		System.out.println(format2.format(date3));
		

	}

}
