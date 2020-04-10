
public class MainApp {

	public static void main(String[] args) {
		Tree T1 = new Tree();
		T1.insert(280, "A");
		T1.insert(308, "B");
		T1.insert(180, "C");
		T1.insert(416, "D");
		T1.insert(298, "E");
		T1.insert(350, "F");
		T1.insert(156, "G");
		T1.insert(255, "H");
		T1.insert(580, "I");
		T1.insert(275, "J");
		T1.insert(12, "K");
		
		//System.out.println("inOrder (left,root,right)");
		//T1.TraverseinOrder();
		
		//System.out.println("preOrder (root,left,right)");
		//T1.TraversepreOrder();
		
		//System.out.println("postOrder (left,right,root)");
		//T1.TraversepostOrder();
		
		T1.callRecursive(12);
		T1.find(275);

	}

}
