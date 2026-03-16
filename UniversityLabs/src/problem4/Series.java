package problem4;

public class Series extends Circuit {
	private Circuit c1;
	private Circuit c2;
	private double potentialDiff;
	
	public Series(Circuit c1, Circuit c2) {
		this.c1 = c1;
		this.c2 = c2;
		this.potentialDiff = 0.0;
	}
	

	@Override
	public double getResistance() {
		return c1.getResistance() + c2.getResistance();
	}

	@Override
	public double getPotentialDiff() {
		return this.potentialDiff;
	}

	@Override
	public void applyPotentialDiff(double V) {
		this.potentialDiff = V;
		
		double totalResistance = getResistance();
		double current = V / totalResistance;
		
		double v1 = current * c1.getResistance();
		double v2 = current * c2.getResistance();
		
		c1.applyPotentialDiff(v1);
		c2.applyPotentialDiff(v2);
	}
	
	public Circuit getFirstCircuit() {
		return c1;
	}
	
	public Circuit getSecondCircuit() {
		return c2;
	}

}
