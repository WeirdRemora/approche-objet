package fr.diginamic.testexceptions;

import sets.Pays;

public class TestReflectionUtils {

	public static void main(String[] args) {
		//Pays pays = new Pays("Léopotamie",5000,2000);
		Pays pays = null;
		try {
			ReflectionUtils.afficherAttributs(pays);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ReflectionException e) {
			System.out.println(e.getMessage());;
		}

	}

}
