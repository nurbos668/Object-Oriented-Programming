package problem4.copy;

public class CircuitTest {
	public static void main(String[] args) {
		Circuit r1 = new Resistor(7.0);
		Circuit r2 = new Resistor(10.0);
		Circuit r3 = new Resistor(6.0);
		Circuit r4 = new Resistor(4.0);
		Circuit c1 = new Parallel(r1, r2);
		Circuit c2 = new Series(r3, r4);
		Circuit circuit = new Parallel(c1, c2);
		circuit.applyPotentialDiff(24.0);
		
		double R = circuit.getResistance();
		double totalCurrent = circuit.getCurrent();
		double totalPower = circuit.getPower();
		
		System.out.println("Circuit analysis");
		System.out.println("Total resistance: " + R);
		System.out.println("Total current: " + totalCurrent);
		System.out.println("Total power: " + totalPower);
		
		System.out.println("\nC1 analysis");
		System.out.println("Resistance: " + c1.getResistance());
		System.out.println("Voltage: " + c1.getPotentialDiff());
		System.out.println("Current: " + c1.getCurrent());
		System.out.println("Power: " + c1.getPower());
		
		
		System.out.println("\nC2 analysis");
		System.out.println("Resistance: " + c2.getResistance());
		System.out.println("Voltage: " + c2.getPotentialDiff());
		System.out.println("Current: " + c2.getCurrent());
		System.out.println("Power: " + c2.getPower());
		
		
		System.out.println("\nResistor analysises");
		System.out.println("\nR1");
		System.out.println("Voltage: " + r1.getPotentialDiff());
		System.out.println("Current: " + r1.getCurrent());
		System.out.println("Power: " + r1.getPower());
		System.out.println("\nR2");
		System.out.println("Voltage: " + r2.getPotentialDiff());
		System.out.println("Current: " + r2.getCurrent());
		System.out.println("Power: " + r2.getPower());
		System.out.println("\nR3");
		System.out.println("Voltage: " + r3.getPotentialDiff());
		System.out.println("Current: " + r3.getCurrent());
		System.out.println("Power: " + r3.getPower());
		System.out.println("\nR4");
		System.out.println("Voltage: " + r4.getPotentialDiff());
		System.out.println("Current: " + r4.getCurrent());
		System.out.println("Power: " + r4.getPower());
		
		
	}
}
