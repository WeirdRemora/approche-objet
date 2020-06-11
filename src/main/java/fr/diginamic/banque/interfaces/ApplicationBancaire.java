package fr.diginamic.banque.interfaces;

import java.util.Scanner;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class ApplicationBancaire {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choix = 0;
		CompteDaoMem comptes = new CompteDaoMem();
		Compte[] listeComptes = comptes.lister();
		
		do {
			System.out.println("***** Administration des comptes *****\n"
					+ "1. Lister les comptes\n"
					+ "2.Ajouter un nouveau compte\n"
					+ "3.Ajouter une opération à un compte\n"
					+ "4. Supprimer un compte\n"
					+ "99. Sortir");		
			choix = sc.nextInt();
			switch(choix) {
			//lister les comptes
			case(1): 
				listeComptes = comptes.lister();
				System.out.println("Liste des comptes :");
				for(int i=0 ; i<listeComptes.length ; i++) {
					Compte c = listeComptes[i];
					System.out.print("Numéro : "+c.getNum()
							+" - Nombre d'opérations : "+c.getListeOp().length
							+" - Solde : "+c.getSolde()+" €");
					if(c instanceof CompteTaux) {
						System.out.println(" - Taux : "+((CompteTaux)c).getTaux()+" %");
					}
				}
				break;
			//Ajouter un nouveau compte
			case(2):
				System.out.println("Ajout d'un nouveau compte.\n"
						+ "Veuillez saisir le numéro :");
				String numero = sc.next();
				System.out.println("Veuillez saisir le solde initial :");
				float soldeInit = sc.nextFloat();
				String type = "";
				while(!type.equals("NORMAL") && !type.equals("REMUNERE")) {
					System.out.println("Veuillez saisir le type de compte (1: NORMAL, 2: REMUNERE) :");
					type = sc.next();
				}
				if(type.equals("NORMAL")) {
					comptes.sauvegarder(new Compte(numero,soldeInit));
				}
				else if (type.equals("REMUNERE")) {
					System.out.println("Veuillez saisir le taux :");
					float taux = sc.nextFloat();
					comptes.sauvegarder(new CompteTaux(numero,soldeInit,taux));
				}
			}
		}
		while(choix != 99);
		System.out.println("Au revoir :(");
		sc.close();
	}

}
