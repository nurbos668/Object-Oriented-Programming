package problem1.part.a;

public class Cube extends Shape3D{
	private double height;
	
	public Cube(double h) {
		this.height = h;
	}

	@Override
	public double volume() {
		return height * height * height;
	}

	@Override
	public double surfaceArea() {
		return 6 * (height * height);
	}
	
}
