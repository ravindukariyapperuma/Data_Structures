
public class Tree {
	private Node root;
	
	public Tree(){
		root = null;
	}
	
	public void insert(int Eno, String Name){
		Node newNode = new Node(Eno,Name);
		if(root == null)
			root = newNode;
		
		else{
			Node current = root;
			Node parent;
			while(true){
				parent = current;
				if(Eno < current.EmpNo){
					current = current.leftchild;
					if(current == null){
						parent.leftchild = newNode;
						return;
					}
				}
				else {
					current = current.rightchild;
					if(current == null){
						parent.rightchild = newNode;
						return;
					}
				}
			}
		}
	}
	
	private void inOrder(Node localRoot){
		if(localRoot != null){
			inOrder(localRoot.leftchild);
			localRoot.displayNode();
			inOrder(localRoot.rightchild);
		}
	}
	
	public void TraverseinOrder(){
		inOrder(root);
	}
	
	private void preOrder(Node localRoot){
		if(localRoot != null){
			localRoot.displayNode();
			preOrder(localRoot.leftchild);
			preOrder(localRoot.rightchild);
		}
	}
	
	public void TraversepreOrder(){
		preOrder(root);
	}
	
	private void postOrder(Node localRoot){
		if(localRoot != null){
			postOrder(localRoot.leftchild);
			postOrder(localRoot.rightchild);
			localRoot.displayNode();
		}
	}
	
	public void TraversepostOrder(){
		postOrder(root);
	}
	
	//find
	public Node find(int emp){
		Node current = root;
		while(current.EmpNo != emp){
			if(emp < current.EmpNo){
				current = current.leftchild;
			}
			else {
				current = current.rightchild;
			}
			if(current == null)
				return null;
		}
		System.out.println(current.name);
		return current;
	}
	
	//find recursive
	private Node findRecursive(Node localRoot, int emp){
		if(localRoot == null)
			return null;
		if(localRoot.EmpNo == emp){
			System.out.println(localRoot.name);
			return localRoot;
		}
		else if (emp < localRoot.EmpNo) {
			return findRecursive(localRoot.leftchild, emp);
		}
		else {
			return findRecursive(localRoot.rightchild, emp);
		}
	}
	
	public Node callRecursive(int eno){
		return findRecursive(root, eno);
	}
	
	////delete
	public void deleteAll(){
		root = null;
	}
}
