package fr.diginamic.jdr;

public class Loup extends Creature {
	
	private static final int FORCEMIN = 3;
	private static final int FORCEMAX = 8;
	private static final int PVMIN = 5;
	private static final int PVMAX = 10;
	private static final int POINTS = 1;

	public Loup() {
		super();
		this.setPoints(POINTS);
		this.setNom("Loup");
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
