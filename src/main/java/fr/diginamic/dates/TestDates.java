package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		//Cr�ez une instance de la classe java.util.Date � la date du jour en utilisant un de
		//ses constructeurs
		Date date1 = new Date(120,5,19);
		//Affichez l�instance ainsi cr��e au format suivant : jour/mois/ann�e
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(format1.format(date1));
		
		//Cr�ez une instance de la classe Date � la date du 19 mai 2016 � 23h59 et 30
		//secondes
		Date date2 = new Date(116,4,19,23,59,30);
		//Affichez l�instance ainsi cr��e au format suivant : ann�e/mois/jour heure:minute:seconde
		SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(format2.format(date2));
		
		//Cr�ez une instance de Date contenant la date/heure syst�me et affichez-la au
		//m�me format que ci-dessus.
		Date date3 = new Date();
		System.out.println(format2.format(date3));
		

	}

}
