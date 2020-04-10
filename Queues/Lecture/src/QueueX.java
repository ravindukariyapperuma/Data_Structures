
public class QueueX {
	
	private int maxSize; // size of queue array
	private int[] queueArray;
	private int rear; // rear of the queue
	private int front; // front of the queue
	private int nItems; // no of items of the queue
	
	public QueueX(int s) {  // constructor
		maxSize = s; // set array size
		queueArray = new int[maxSize];
		rear = -1;
		front = 0; 
		nItems = 0; // no items
	}
	
	// insert method
	public void insert(int j) {
		// check whether queue is full
		if (rear == maxSize-1)
			System.out.println("Queue is full");
		else {
			queueArray[++rear] = j;
			nItems++;
		}
	}
	
	// remove method
	public int remove() {
		if(nItems == 0) {
			System.out.println("Queue is empty");
			return -99;
		}
		else {
			nItems--;
			return queueArray[front++];
		}
	}
	
	// peekfront method
	public int peekfront() {
		if(nItems == 0) {
			System.out.println("Queue is empty");
			return -99;
		}
		else {
			return queueArray[front];
		}
	}
	// isEmpty method
	public boolean isEmpty() {
		return (nItems == 0);
	}
	// isFull method
	public boolean isFull() {
		return (rear == maxSize-1);
	}
	// size method
	public int size() {
		return nItems;
	}
	
}
