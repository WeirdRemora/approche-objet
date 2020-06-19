package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	public static void main(String[] args) {
		
		//Utilisez la classe java.util.Calendar pour créer une instance de Date à la date du
		//19 mai 2016 à 23h59 et 30 secondes et affichez la au format suivant : jour/mois/année
		Calendar cal = Calendar.getInstance();
		cal.set(cal.DAY_OF_MONTH, 19);
		cal.set(cal.MONTH, 4);
		cal.set(cal.YEAR, 2016);
		cal.set(cal.HOUR_OF_DAY, 23);
		cal.set(cal.MINUTE, 59);
		cal.set(cal.SECOND, 30);
		Date date1 = cal.getTime();
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(format1.format(date1));
		
		//Utilisez la classe java.util.Calendar pour créer une instance de Date à la date du
		//jour.
		Calendar cal2 = Calendar.getInstance();
		Date date2 = cal2.getTime();
		//Affichez l’instance ainsi créée au format suivant : année/mois/jour heure:minute:seconde
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(format2.format(date2));		

	}

}
