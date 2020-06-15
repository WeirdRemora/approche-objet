package fr.diginamic.jdr;

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
	
	public void afficherStats() {
		super.afficherStats();;
		System.out.println("Dextérité : "+dexterite);
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
