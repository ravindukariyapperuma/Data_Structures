package circularQueue;

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
		if (nItems == maxSize)
			System.out.println("Queue is full");
		else {
			if(rear == maxSize-1)
				rear = -1;
			queueArray[++rear] = j;
			nItems++;
		}
	}
		
	// remove method
	public int remove() {
		// check whether queue is empty
		if(nItems == 0) {
			System.out.println("Queue is empty");
			return -99;
		}
		else {
			int temp = queueArray[front++];
			if(front == maxSize)
				front = 0;
			nItems--;
			return temp;
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
		
	public boolean isEmpty() {
		return (nItems == 0);
	}
	
	public boolean isFull() {
		return (nItems == maxSize);
	}
	
}
