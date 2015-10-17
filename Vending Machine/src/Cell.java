
public class Cell {
	private Product product;
	private int inventory;
	private String name;
	
	public Cell(int pos, Product p, int inventory) {
		this.product = p;
		this.inventory = inventory;
		this.name = product.getName();
	}
	public boolean isSoldOut() {
		return inventory == 0;
	}
	public double getPrice() {
		return product.getPrice();
	}
	public String getName() {
		return name;
	}
	public void sold() {
		inventory--;
	}
	public void refill() {
		this.inventory = 3;
	}
}
