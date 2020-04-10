
public class StackApp {

	public static void main(String[] args) {
		StackX theStack = new StackX(10);
		
		theStack.push(30);
		theStack.push(80);
		theStack.push(100);
		theStack.push(25);
		
		while (!theStack.isEmpty()) {
			double val = theStack.pop();
			System.out.println(val);
		}
	}
}
