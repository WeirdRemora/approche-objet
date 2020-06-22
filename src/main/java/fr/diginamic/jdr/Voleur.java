package fr.diginamic.jdr;

/** Classe sp�ciale parce que je voulais m'amuser
 * @author Leo
 */
public class Voleur extends Heros {
	
	private static final int FORCEMIN = 8;
	private static final int FORCEMAX = 12;
	private static final int PVMIN = 15;
	private static final int PVMAX = 30;
	private int dexterite;
	private static final int DEXMIN = 2;
	private static final int DEXMAX = 5;
	
	public Voleur() {
		super();
		this.dexterite = dexInit();
	}
	
	/** Le voleur a une chance d'infliger un coup critique infligeant 2x ses d�g�ts d'attaque selon sa valeur de dext�rit�
	 * 10% de chance par point de dext�rit�
	 */
	public int attaque() {
		boolean coupCritique = Math.random()*10 < dexterite;
		int degats = super.attaque();
		if (coupCritique) {
			System.out.println("Coup critique !");
			return degats*2;
		}
		else {
			return degats;
		}
	}
	
	/** Le voleur a une chance d'esquiver les d�g�ts d'un coup pour recevoir 0 d�g�ts � la place selon sa valeur de dext�rit�
	 * 10% de chance par point de dext�rit�
	 */
	public int encaisse(int degats) {
		boolean esquive = Math.random()*10 < dexterite;
		if (esquive) {
			System.out.println("Esquive !");
			return 0;
		}
		else {
			super.encaisse(degats);
			return degats;
		}
	}
	
	/** Affiche �galement la dext�rit�
	 */
	public void afficherStats() {
		super.afficherStats();;
		System.out.println("Dext�rit� : "+dexterite);
	}

	@Override
	public int forceInit() {
		return (int)(Math.random()*(FORCEMAX-FORCEMIN)+1)+FORCEMIN;
	}

	@Override
	public int pvInit() {
		return (int)(Math.random()*(PVMAX-PVMIN)+1)+PVMIN;
	}
	
	public int dexInit() {
		return (int)(Math.random()*(DEXMAX-DEXMIN)+1)+DEXMIN;
	}

}
