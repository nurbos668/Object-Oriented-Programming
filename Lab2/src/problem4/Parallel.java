package problem4;

public class Parallel extends Circuit {
	private Circuit c1;
	private Circuit c2;
	private double potentialDiff;
	
	public Parallel(Circuit c1, Circuit c2) {
		this.c1 = c1;
		this.c2 = c2;
		this.potentialDiff = 0.0;
	}

	@Override
	public double getResistance() {
		double r1 = c1.getResistance();
		double r2 = c2.getResistance();
		
		if (r1 == 0 || r2 == 0) {
			return 0;
		}
		
		return 1.0 / ((1.0 / r1) + (1.0 / r2));
	}

	@Override
	public double getPotentialDiff() {
		return this.potentialDiff;
	}

	@Override
	public void applyPotentialDiff(double V) {
		this.potentialDiff = V;
		c1.applyPotentialDiff(V);
		c2.applyPotentialDiff(V);
	}
	
	public Circuit getFirstCircuit() {
		return c1;
	}
	
	public Circuit getSecondCircuit() {
		return c2;
	}
	
}
