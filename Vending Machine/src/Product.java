
public abstract class Product {
	protected ProductName name;
	protected double price;
	
	protected abstract double getPrice();
	protected abstract String getName();
}
