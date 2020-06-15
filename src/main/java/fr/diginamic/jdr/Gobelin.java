package fr.diginamic.jdr;

public class Gobelin extends Creature {

	private static final int FORCEMIN = 5;
	private static final int FORCEMAX = 10;
	private static final int PVMIN = 10;
	private static final int PVMAX = 15;
	private static final int POINTS = 2;

	public Gobelin() {
		super();
		this.setPoints(POINTS);
		this.setNom("Gobelin");
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
