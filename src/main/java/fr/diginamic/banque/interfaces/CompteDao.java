package fr.diginamic.banque.interfaces;

import fr.diginamic.banque.entites.Compte;

/** Liste les méthodes obligatoires pour la persistence des comptes
 * @author Leo
 *
 */
public interface CompteDao {

	/** Retourne la liste de tous les comptes
	 * @return
	 */
	Compte[] lister();

	/** Permet de sauvegarder un nouveau compte
	 * @param nvCompte nouveau compte à sauvegarder
	 */
	void sauvegarder(Compte nvCompte);
	
	/** Supprime un compte
	 * Retourne true si la suppression a été réalisée avec succès, false sinon.
	 * @param numero numéro de compte à supprimer
	 * @return boolean
	 */
	boolean supprimer(String numero);

	/** Retourne true si le numéro du compte passé en paramètre existe,
	 * false dans le cas contraire
	 * @param numero numéro de compte
	 * @return boolean
	 */
	boolean existe(String numero);
	
	/** Retourne le compte dont le numéro est passé en paramètre
	 * @param numero numéro du compte
	 * @return Compte
	 */
	Compte getCompte(String numero);
}
