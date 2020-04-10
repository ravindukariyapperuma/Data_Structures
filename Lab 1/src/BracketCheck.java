
public class BracketCheck {
	private String inputstr;
	
	public BracketCheck(String in) {
		inputstr = in;
	}
	public void CheckB() {
		int size = inputstr.length();
		Stack BStack = new Stack(size);
		for(int i=0;i<size;i++) {
			if(inputstr.charAt(i)=='(') {
				BStack.push('(');
			}
			else if(inputstr.charAt(i)==')') {
				char ch3 = (char) BStack.pop();
				if(ch3!='(') {
					System.out.println("INVALID STRING");
					return;
				}
			}
		}
		if(!BStack.isEmpty()) {
			System.out.println("invalid string");
		}
		else {
			System.out.println("valid string");
		}
	}
}
