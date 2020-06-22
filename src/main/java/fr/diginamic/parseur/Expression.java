package fr.diginamic.parseur;

public class Expression {
	
	private String nbGauche;
	private char operateur;
	private String nbDroite;
	
	/** Constructeur
	 * @param nbGauche Nombre ou lettres à gauche de l'opérateur
	 * @param operateur Opérateur
	 * @param nbDroite Nombre ou lettres à droite de l'opérateur
	 */
	public Expression(String nbGauche, char operateur, String nbDroite) {
		this.nbGauche = nbGauche;
		this.operateur = operateur;
		this.nbDroite = nbDroite;
	}
	
	/** Évalue le résultat d'une expression en remplaçant une variable par une valeur donnée
	 * @param var Nom de la variable dans l'expression
	 * @param val Valeur de la variable
	 * @return le résultat de l'expression en remplaçant la variable par sa valeur
	 */
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
	
	/** Calcule le résultat d'une expression avec des nombres en fonction de l'opérateur
	 * @param constGauche Nombre de gauche (double)
	 * @param constDroite Nombre de droite (double)
	 * @return Résultat de l'expression (double)
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
