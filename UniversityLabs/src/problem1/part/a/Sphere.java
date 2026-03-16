package problem1.part.a;

public class Sphere extends Shape3D{
	private double radius;
	
	public Sphere(double r){
		this.radius = r;
	}
	
	@Override
	public double volume() {
		return (4/3) * Math.PI * (radius * radius * radius);
	}

	@Override
	public double surfaceArea() {
		// TODO Auto-generated method stub
		return 4 * Math.PI * radius * radius;
	}

}
