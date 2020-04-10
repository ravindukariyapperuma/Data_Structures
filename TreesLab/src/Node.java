
public class Node {
	public int EmpNo;
	public String name;
	public Node leftchild;
	public Node rightchild;
	
	public Node(int eNo,String Name){
		EmpNo = eNo;
		name = Name;
		leftchild = null;
		rightchild = null;
	}
	
	public void displayNode(){
		System.out.println("Emp No :" + EmpNo + " Name : " + name);
	}
}
