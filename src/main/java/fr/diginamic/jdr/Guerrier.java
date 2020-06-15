package fr.diginamic.jdr;

public class Guerrier extends Heros {

	private static final int FORCEMIN = 12;
	private static final int FORCEMAX = 18;
	private static final int PVMIN = 20;
	private static final int PVMAX = 50;
	
	public Guerrier() {
		super();
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
