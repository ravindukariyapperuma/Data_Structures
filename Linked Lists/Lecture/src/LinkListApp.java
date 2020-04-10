
public class LinkListApp {

	public static void main(String[] args) {
		LinkList L = new LinkList();
		L.insertFirst(35);
		L.insertFirst(17);
		L.insertFirst(120);
		//L.displayList();
		Link item = L.deleteFirst();
		L.displayList();
		L.find(44);
	}

}
