package fr.diginamic.jdr;

public class Troll extends Creature {

	private static final int FORCEMIN = 10;
	private static final int FORCEMAX = 15;
	private static final int PVMIN = 20;
	private static final int PVMAX = 30;
	private static final int POINTS = 5;

	public Troll() {
		super();
		this.setPoints(POINTS);
		this.setNom("Troll");
	}

	@Override
	public int forceInit() {
		return (int)(Math.random()*(FORCEMAX-FORCEMIN+1))+FORCEMIN;
	}

	@Override
	public int pvInit() {
		return (int)(Math.random()*(PVMAX-PVMIN+1))+PVMIN;
	}
}
