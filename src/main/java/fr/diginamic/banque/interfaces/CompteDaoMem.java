/**
 * 
 */
package fr.diginamic.banque.interfaces;

import fr.diginamic.banque.entites.Compte;

public class CompteDaoMem implements CompteDao {

	private Compte[] comptes = {};
	
	/** Retourne la liste de tous les comptes
	* @return
	*/
	public Compte[] lister() {
		return comptes;
	}
	
	/** Permet de sauvegarder un nouveau compte
	 * @param nvCompte nouveau compte � sauvegarder
	 */
	public void sauvegarder(Compte nvCompte) {
		//on cr�e un nouveau tableau de taille +1
		Compte[] comptes = new Compte[this.comptes.length+1];
		for (int i=0 ; i < this.comptes.length ; i++) {
			comptes[i] = this.comptes[i];
		}
		comptes[comptes.length-1] = nvCompte;
		this.comptes = comptes;
	}
	
	/** Supprime un compte
	 * Retourne true si la suppression a �t� r�alis�e avec succ�s, false sinon.
	 * @param numero num�ro de compte � supprimer
	 * @return boolean
	 */
	public boolean supprimer(String numero) {
		//on cr�e un nouveau tableau de taille -1
		Compte[] nvComptes = new Compte[comptes.length-1];
		boolean suppr = existe(numero);
		if (suppr) {
			for (int i=0, j=0 ; i<comptes.length ; i++) {
				if (comptes[i].getNum() != numero) {
					//on copie dans le nouveau tableau si le numero n'est pas celui supprim�
					nvComptes[j] = comptes[i];
					j++;
				}
			}
			//on remplace les tableaux si un compte a �t� supprim�
			comptes = nvComptes;
		}
		return suppr;
	}
	
	/** Retourne true si le num�ro du compte pass� en param�tre existe,
	 * false dans le cas contraire
	 * @param numero num�ro de compte
	 * @return boolean
	 */
	public boolean existe(String numero) {
		boolean existe = false;
		for (int i=0 ; i < comptes.length ; i++) {
			if(comptes[i].getNum() == numero) {
				existe = true;
			}
		}
		return existe;
	}
	
	/** Retourne le compte dont le num�ro est pass� en param�tre
	 * @param numero num�ro du compte
	 * @return Compte
	 */
	public Compte getCompte(String numero) {
		Compte compte = new Compte("inconnu",0);
		for(int i=0 ; i < comptes.length ; i++) {
			if(comptes[i].getNum() == numero) {
				compte = comptes[i];
			}
		}
		return compte;
	}

}
