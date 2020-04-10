
public class LinkedList {
	private Item first;
	
	public LinkedList() {
		first = null;
	}
	

	public void insertFirst(int n, double p) {
		Item newItem = new Item(n,p);
		newItem.next = first;
		first = newItem;
	}
	
	public void offerDiscount() {
		System.out.println("=============================================================");
		System.out.println("Items eligible for the Discount");
		System.out.println("=============================================================");
		System.out.println("Item No \tDiscount \tUnit Price after the Discount");
		Item current = first;
		while(current != null) {
			if(current.unitPrice > 1500.00) {
				double discount = (current.unitPrice * 5 / 100);
				System.out.println(current.itemNo +" \t\t"+discount+ " \t\t"+(current.unitPrice-discount));
				current = current.next;
				
			}
			else {
				current = current.next;
			}
		}
		System.out.println("=============================================================");
	
	}
	
	public void displayList() {
		Item current = first;
		while(current != null) {
			current.displayItem();
			current = current.next;
		}
	}
}
