package Implementation;

public class LinkListApp {

	public static void main(String[] args) {
		LinkList list = new LinkList();
		list.insertFirst(10);
		list.insertFirst(20);
		list.insertFirst(30);
		list.insertFirst(40);
		
		//list.deleteMiddle(20);
		//list.insertMiddle(50,20);
		list.find(20);
		//list.displayList();
	}

}
