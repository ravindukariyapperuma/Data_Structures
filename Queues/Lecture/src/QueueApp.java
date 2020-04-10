
public class QueueApp {

	public static void main(String[] args) {
		QueueX theQueue = new QueueX(10);
		theQueue.insert(10);
		theQueue.insert(25);
		theQueue.insert(55);
		theQueue.insert(65);
		theQueue.insert(85);
		
		while (!theQueue.isEmpty()) {
			int val = theQueue.remove();
			System.out.println(val);
		}

	}

}
