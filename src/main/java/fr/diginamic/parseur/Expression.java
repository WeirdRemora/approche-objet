package fr.diginamic.parseur;

public class Expression {
	
	private String nbGauche;
	private char operateur;
	private String nbDroite;
	
	public Expression(String nbGauche, char operateur, String nbDroite) {
		this.nbGauche = nbGauche;
		this.operateur = operateur;
		this.nbDroite = nbDroite;
	}
	
	public double evaluer(String var, double val) {
		//variable à gauche, nombre à droite
		if(nbGauche.equals(var) && !nbDroite.equals(var)) {
			double constDroite = Double.valueOf(nbDroite);
			return evaluer(val,constDroite);
		}
		//variable à droite, nombre à gauche
		else if (nbDroite.equals(var) && !nbGauche.equals(var)) {
			double constGauche = Double.valueOf(nbGauche);
			return evaluer(constGauche,val);
		}
		//même variable à droite et à gauche
		else if(nbGauche.equals(var) && nbDroite.equals(var)) {
			return evaluer(val,val);
		}
		//nombre à droite et à gauche
		else {
			double constDroite = Double.valueOf(nbDroite);
			double constGauche = Double.valueOf(nbGauche);
			return evaluer(constGauche,constDroite);
		}
	}
	
	private double evaluer(double constGauche, double constDroite) {
		switch(operateur) {
		case('+'):
			return constGauche+constDroite;
		case('-'):
			return constGauche-constDroite;
		case('*'):
			return constGauche*constDroite;
		case('/'):
			return constGauche/constDroite;
		default:
			return 0;
		}
	}

	public String getNbGauche() {
		return nbGauche;
	}

	public void setNbGauche(String nbGauche) {
		this.nbGauche = nbGauche;
	}

	public char getOperateur() {
		return operateur;
	}

	public void setOperateur(char operateur) {
		this.operateur = operateur;
	}

	public String getNbDroite() {
		return nbDroite;
	}

	public void setNbDroite(String nbDroite) {
		this.nbDroite = nbDroite;
	}
	
	
}
