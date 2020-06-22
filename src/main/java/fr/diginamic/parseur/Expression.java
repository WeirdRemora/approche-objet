package fr.diginamic.parseur;

public class Expression {
	
	private String nbGauche;
	private char operateur;
	private String nbDroite;
	
	/** Constructeur
	 * @param nbGauche Nombre ou lettres � gauche de l'op�rateur
	 * @param operateur Op�rateur
	 * @param nbDroite Nombre ou lettres � droite de l'op�rateur
	 */
	public Expression(String nbGauche, char operateur, String nbDroite) {
		this.nbGauche = nbGauche;
		this.operateur = operateur;
		this.nbDroite = nbDroite;
	}
	
	/** �value le r�sultat d'une expression en rempla�ant une variable par une valeur donn�e
	 * @param var Nom de la variable dans l'expression
	 * @param val Valeur de la variable
	 * @return le r�sultat de l'expression en rempla�ant la variable par sa valeur
	 */
	public double evaluer(String var, double val) {
		//variable � gauche, nombre � droite
		if(nbGauche.equals(var) && !nbDroite.equals(var)) {
			double constDroite = Double.valueOf(nbDroite);
			return evaluer(val,constDroite);
		}
		//variable � droite, nombre � gauche
		else if (nbDroite.equals(var) && !nbGauche.equals(var)) {
			double constGauche = Double.valueOf(nbGauche);
			return evaluer(constGauche,val);
		}
		//m�me variable � droite et � gauche
		else if(nbGauche.equals(var) && nbDroite.equals(var)) {
			return evaluer(val,val);
		}
		//nombre � droite et � gauche
		else {
			double constDroite = Double.valueOf(nbDroite);
			double constGauche = Double.valueOf(nbGauche);
			return evaluer(constGauche,constDroite);
		}
	}
	
	/** Calcule le r�sultat d'une expression avec des nombres en fonction de l'op�rateur
	 * @param constGauche Nombre de gauche (double)
	 * @param constDroite Nombre de droite (double)
	 * @return R�sultat de l'expression (double)
	 */
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
