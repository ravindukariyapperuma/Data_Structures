//FindNumber.java
import java.util.Scanner;

public class FindNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		IntStack mainstack = new IntStack(10);  //main stack
		IntStack tempstack = new IntStack(10);  //temporarily stack
		
		mainstack.push(25);
		mainstack.push(45);
		mainstack.push(12);
		mainstack.push(70);
		mainstack.push(20);
		mainstack.push(14);
		mainstack.push(66);
		mainstack.push(85);
		mainstack.push(15);
		mainstack.push(28);
		
		int num, svalue = 0; 
		boolean search = false; //default search value is false
		
		System.out.print("Please enter the number to be searched: ");
		
		if(sc.hasNextInt() == false) {    //check given user input can be converted to an integer value
			System.out.println("Please enter a valid number"); 
		}
		
		else {                          //user input can converted to an integer value
			num = sc.nextInt();
			
			while(!mainstack.isEmpty()) {
			svalue = mainstack.pop(); 
			if(num == svalue) {
				search = true; // if value in stack search value become true
			}
			tempstack.push(svalue); //store pop value temporarily stack
			}
			
			if(search == true) {
				System.out.println("Number "+num+" is in the stack");
			}
			else {
				System.out.println("Number "+num+" is not in the stack");
			}
			
			
			//re assign values to main stack / Question given (Note: Once the find operation is finished the stack object should remain same)
			
			//System.out.println("\n"); 
			//System.out.println("Display Stack");
			while(!tempstack.isEmpty()) {
				int temp = tempstack.pop();
				mainstack.push(temp);
				//System.out.println(temp);
			}
			
		}
	}
}
