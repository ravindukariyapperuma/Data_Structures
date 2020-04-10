//IntStack.java
public class IntStack {
	private int maxSize;  // size of stack array
	private int[] stackArray; 
	private int top; // top of the stack
	
	public IntStack(int s) {  // constructor
		maxSize = s;  // set array size
		stackArray = new int[maxSize];
		top = -1;  // no items
	}
	
	// push method
	public void push(int j) {
		// check whether stack is full
		if(top == maxSize-1)
			System.out.println("Stack is full");
		else
			// increment top. insert item
			stackArray[++top] = j;
	}
		
	// pop method
	public int pop() {
		if(top == -1)
			return -99;
		else
			return stackArray[top--];
	}
	
	// peek method
	public int peek() {
		if(top == -1)
			return -99;
		else
			return stackArray[top];
	}
	// isEmpty method
	public boolean isEmpty() {
		return (top == -1);
	}
	// isFull method
	public boolean isFull() {
		return (top == maxSize -1);
	}
}
