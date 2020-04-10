
public class LinkList {
	private Link first;
	
	public LinkList() {
		first = null;
	}
	
	public void insertFirst(int id) {
		Link newLink = new Link(id);
		newLink.next = first;
		first = newLink;
	}
	/*
	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}
	*/
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void displayList() {
		Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
	}
	
	public Link deleteFirst() {
		if(first == null)
			return null;
		else {
			Link temp = first;
			first = temp.next;
			return temp;
		}
	}
	
	public Link find(int key) {
		Link current = first;
		while(current != null) {
			if(current.iData == key) {
				return current;
			}
			else {
				current = current.next;
			}
			return null;
		}
	}
}
