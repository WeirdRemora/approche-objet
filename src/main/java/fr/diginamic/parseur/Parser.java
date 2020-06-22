package fr.diginamic.parseur;

public class Parser {
	
	/** Prend une expression en String, la décompose grâce à la magie des regex et en fait un objet Expression
	 * @param chaine Chaîne de caractères de l'expression
	 * @return Expression
	 */
	public static Expression parse(String chaine) {
		//Regex pour nombre à virgule ou lettre : [+-]?\d*[.]?\w+
		//Regex pour opérateur : [\+\-\*/]
		String regex = "([+-]?\\d*[.]?\\w+)([\\+\\-\\*/])([+-]?\\d*[.]?\\w+)";
		String gauche = chaine.replaceAll(regex, "$1");
		char operateur = chaine.replaceAll(regex, "$2").charAt(0);
		String droite = chaine.replaceAll(regex, "$3");
		
		return new Expression(gauche,operateur,droite);
		
	}

}
