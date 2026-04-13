package problem3;

public interface MyCollection<T> {
	
	void add(T el);
	void remove(T el);
	boolean contains(T el);
	int size();
	boolean isEmpty();
	void clear();
	
}
