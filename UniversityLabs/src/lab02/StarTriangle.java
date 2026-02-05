package lab02;

public class StarTriangle {
	private int width;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StarTriangle obj = new StarTriangle(5);
		obj.toTriangle();

	}
	
	public StarTriangle(int width) {
		this.width = width;
	}
	
	public void toTriangle() {
		for(int i = 0; i < this.width; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("[*]");
			}
			System.out.println();
		}
	}

}
