package fr.diginamic.essais;

import fr.diginamic.parseur.Expression;
import fr.diginamic.parseur.Parser;

public class TestParseur {

	public static void main(String[] args) {
		String chaine1 = "x+3";
		String chaine2 = "2-y";
		String chaine3 = "x*2.845";
		String chaine4 = "bla/5";
		String chaine5 = "12.5-8.3";
		String chaine6 = "a*a";
		
		Expression expr1 = Parser.parse(chaine1);
		Expression expr2 = Parser.parse(chaine2);
		Expression expr3 = Parser.parse(chaine3);
		Expression expr4 = Parser.parse(chaine4);
		Expression expr5 = Parser.parse(chaine5);
		Expression expr6 = Parser.parse(chaine6);
		
		double res1 = expr1.evaluer("x", 5);
		System.out.println(chaine1+" = "+res1);
		double res2 = expr2.evaluer("y", 6);
		System.out.println(chaine2+" = "+res2);
		double res3 = expr3.evaluer("x", 2.2);
		System.out.println(chaine3+" = "+res3);
		double res4 = expr4.evaluer("bla", 7.3);
		System.out.println(chaine4+" = "+res4);
		double res5 = expr5.evaluer("inutile", 0);
		System.out.println(chaine5+" = "+res5);
		double res6 = expr6.evaluer("a", 3.333);
		System.out.println(chaine6+" = "+res6);
		

	}

}
