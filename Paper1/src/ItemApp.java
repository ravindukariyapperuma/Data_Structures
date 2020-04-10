import java.util.Scanner;

public class ItemApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LinkedList newLink = new LinkedList();
		for(int a=1;a<=5;a++) {
			System.out.println("Enter Item "+a+ " Number : ");
			int num = sc.nextInt();
			System.out.println("Enter Item "+a+ " Unit price : ");
			double pri = sc.nextDouble();
			newLink.insertFirst(num, pri);
		}
		//newLink.displayList();
		newLink.offerDiscount();
	}

}
