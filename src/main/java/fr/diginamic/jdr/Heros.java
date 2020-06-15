package fr.diginamic.jdr;

public abstract class Heros extends Personnage {
	
	private int score;
	
	public void afficherScore() {
		System.out.println("Score : "+score);
	}
	
	public void afficherStats() {
		System.out.println("Force : "+this.getForce()+"\n"
				+ "PV : "+this.getPvMax());
	}
	
	public Heros() {
		this.score = 0;
		this.setForce(forceInit());
		this.setPvMax(pvInit());
		this.setPv(this.getPvMax());
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
