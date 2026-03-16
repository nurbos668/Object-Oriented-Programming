package problem1.part.b;

public abstract class LibraryItem {
	private String title;
	private String author;
	private int publicationYear;
	
	public LibraryItem(String t, String a, int y) {
		this.title = t;
		this.author = a;
		this.publicationYear = y;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public int getYear() {
		return this.publicationYear;
	}
	
	public void setTitle(String t) {
		this.title = t;
	}
	
	public void setAuthor(String a) {
		this.author = a;
	}
	
	public void setYear(int y) {
		this.publicationYear = y;
	}
	
	public abstract String getTypeOfItem();
	
	@Override
	public String toString() {
		return this.title + " " + this.author + " (" + this.publicationYear + ")";
	}
}	

