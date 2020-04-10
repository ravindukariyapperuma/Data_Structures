
public class Item {
	public int itemNo;
	public double unitPrice;
	public Item next;
	
	public Item(int n, double p) {
		itemNo = n;
		unitPrice = p;
		next = null;
		
	}
	
	public void displayItem() {
		System.out.println(itemNo+ " " + unitPrice);
	}
}
