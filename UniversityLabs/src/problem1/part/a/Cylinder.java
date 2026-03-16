package problem1.part.a;

public class Cylinder extends Shape3D{
	private double height, radius;
	public Cylinder(double r, double h) {
		this.radius = r;
		this.height = h;
	}
	
	@Override
	public double volume() {
		return Math.PI * radius * radius * height;
	}
	@Override
	public double surfaceArea() {
		return (Math.PI * radius * radius) + (4 * radius * height);
	}
	
	
}
