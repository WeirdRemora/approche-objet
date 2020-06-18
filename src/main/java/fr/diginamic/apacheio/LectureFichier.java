package fr.diginamic.apacheio;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class LectureFichier {

	public static void main(String[] args) {		
		try {
			//File file = new File("D:/Formation 2020/Java/approche-objet/recensement 2016.csv");
			File file = new File("recensement 2016.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			
			for(String ligne: lignes) {
				System.out.println(ligne);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
