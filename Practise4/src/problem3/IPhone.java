package problem3;

public class IPhone implements SellableAndPluggable {

	@Override
	public void plug() {
		System.out.println(" IPhone is plugging");
	}

	@Override
	public void sell() {
		System.out.println("IPhone is selling");
	}
	
}
