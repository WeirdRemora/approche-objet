package fr.diginamic.parseur;

public class Parser {
	
	/** Prend une expression en String, la d�compose gr�ce � la magie des regex et en fait un objet Expression
	 * @param chaine Cha�ne de caract�res de l'expression
	 * @return Expression
	 */
	public static Expression parse(String chaine) {
		//Regex pour nombre � virgule ou lettre : [+-]?\d*[.]?\w+
		//Regex pour op�rateur : [\+\-\*/]
		String regex = "([+-]?\\d*[.]?\\w+)([\\+\\-\\*/])([+-]?\\d*[.]?\\w+)";
		String gauche = chaine.replaceAll(regex, "$1");
		char operateur = chaine.replaceAll(regex, "$2").charAt(0);
		String droite = chaine.replaceAll(regex, "$3");
		
		return new Expression(gauche,operateur,droite);
		
	}

}
