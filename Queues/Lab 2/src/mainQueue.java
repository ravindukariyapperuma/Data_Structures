import java.util.Scanner;

public class mainQueue {

	public static void main(String[] args) {
		QueueX mainQueue = new QueueX(5);
		QueueX evenQueue = new QueueX(5);
		QueueX oddQueue = new QueueX(5);
		
		Scanner sc = new Scanner(System.in);
		int value, num;
		
		for(int i=1;i<=5;i++) {
			System.out.println("Enter transaction ID "+i+" : ");
			value = sc.nextInt();
			mainQueue.insert(value);
		}
		
			while(!mainQueue.isEmpty()) {
				num=mainQueue.remove();
				if(num % 2 ==0) {
					evenQueue.insert(num);
				}else {
					oddQueue.insert(num);
				}
			}
			
			System.out.println("PC1");
			while(!evenQueue.isEmpty()) {
				System.out.println("Transaction "+evenQueue.remove());
			}
			
			System.out.println("PC2");
			while(!oddQueue.isEmpty()) {
				System.out.println("Transaction "+oddQueue.remove());
			}
			
	}
}
