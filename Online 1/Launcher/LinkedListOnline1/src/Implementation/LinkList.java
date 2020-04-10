package Implementation;

public class LinkList {
	public Link first;

	public LinkList() {
		first = null;
	}
	
	public boolean isEmpty() {
		return(first == null);
	}
	
	public void insertFirst(int id) {
		Link newLink = new Link(id);
		newLink.next = first;
		first = newLink;
	}
	
	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
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
		}
		return null;
	}
	
	public void displayList() {
		Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
	}
	
	public void insertMiddle(int key, int cur) {
		Link newLink = new Link(key);
		Link current = first;
		while(current != null) {
			if(current.iData == cur) {
				newLink.next = current.next;
				current.next = newLink;
			}
			else {
				current = current.next;
			}
		}
	}
	
	public Link deleteMiddle(int cur) {
		Link current = first;
		Link privious = first;
		while(current != null) {
			if(current.iData == cur) {
				privious.next = current.next;
				return current;
			}
			else {
				privious = current;
				current = current.next;  
			}
		}
		return null;
	}
}
