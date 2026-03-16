package problem1.part.b;

public class Book extends LibraryItem{
	private int numOfPages;
	private String genre;

	public Book(String t, String a, int y, int p, String g) {
		super(t, a, y);
		this.numOfPages = p;
		this.genre = g;
	}
	
	public int getPages() {
		return this.numOfPages;
	}
	
	public String getGenre() {
		return genre;
	}

	@Override
	public String getTypeOfItem() {
		return "Type: " + getClass().getSimpleName();
	}
	
	@Override 
	public String toString() {
		return super.toString() + "\nPages: " + this.numOfPages;
 	}


}
