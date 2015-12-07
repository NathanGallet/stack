
public abstract class stack {
	
	abstract int getSize();
	abstract int getNumberOfElement();
	abstract boolean isFull();
	abstract boolean isEmpty();
	abstract void push(int x) throws IllegalStateException;
	abstract void pop() throws IllegalStateException;
	abstract int head() throws IllegalStateException;
}
