package problem5;


public class Chocolate implements Comparable<Chocolate> {
	
	private String name;
	private double weight;
	
	public Chocolate(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}


	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public double getWeight() {
		return weight;
	}




	public void setWeight(double weight) {
		this.weight = weight;
	}

	

	@Override
	public String toString() {
		return "Chocolate [name=" + name + ", weight=" + weight + "]";
	}
	
	

	@Override
	public int compareTo(Chocolate o) {
		return Double.compare(weight, o.getWeight());
	}

}
