package circularQueue;

public class QueueApp {

	public static void main(String[] args) {
		QueueX myQueue = new QueueX(10);
		myQueue.insert(10);
		myQueue.insert(25);
		myQueue.insert(55);
		myQueue.insert(65);
		myQueue.insert(85);
		
		while (!myQueue.isEmpty()) {
			int val = myQueue.remove();
			System.out.println(val);
		}
		
	}

}
