package problem4.copy;

public class Resistor extends Circuit{
	private double resistance;
	private double potentialDiff;
	
	public Resistor(double resistance) {
		this.resistance = resistance;
		potentialDiff = 0;
	}

	@Override
	public double getResistance() {
		return this.resistance;
	}

	@Override
	public double getPotentialDiff() {
		return this.potentialDiff;
	}

	@Override
	public void applyPotentialDiff(double V) {
		this.potentialDiff = V;
	}
}
