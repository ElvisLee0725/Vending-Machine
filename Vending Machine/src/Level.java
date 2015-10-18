import java.math.BigDecimal;


public class Level {
	private int level;
	private Cell [] cells;
	private int numberOfCells;;
	public Level(int level, int cellNumber) {
		this.level = level;
		this.cells = new Cell[cellNumber];
		this.numberOfCells = cellNumber;
		// Put product in each Cell according to its level:
		for(int i = 0; i < cellNumber; i++) {
			Product p;
			if(level == 0) {
				switch(i) {
					case 0:
						p = Product.Coke;
						break;
					case 1:
						p = Product.CokeZero;
						break;
					case 2:
						p = Product.DietCoke;
						break;
					default:
						p = Product.Coke;
						break;
				}
			}
			else if(level == 1) {
				switch(i) {
					case 0:
						p = Product.Fanta;
						break;
					case 1:
						p = Product.Sprite;
						break;
					case 2:
						p = Product.Water;
						break;
					default:
						p = Product.Water;
						break;
				}
			}
			else {
				p = Product.Coke;
			}
			cells[i] = new Cell(i, p, 3); // parameter: level, position, product, inventory
		}		
	}
	public boolean canSellItem(int pos, double money) {
		// 1. Is inventory enough?
		if(cells[pos].isSoldOut()) {
			System.out.println("Sorry, this item is sold out! Please try another.");
			return false;
		}
		// 2. Is money enough?
		if(money - cells[pos].getPrice() < 0) {
			System.out.println("The money is not enough");
			return false;
		}
		cells[pos].sold();
		return true;
	}
	// Must Use BigDecimal to handle calculation...
	public double countChange(int pos, double money) {
		BigDecimal b1 = new BigDecimal(Double.toString(money));
		BigDecimal b2 = new BigDecimal(Double.toString(cells[pos].getPrice()));
		return b1.subtract(b2).doubleValue();
	}
	public String getProduct(int pos) {
		return cells[pos].getName();
	}
	public Cell getCell(int pos) {
		return cells[pos];
	}
}
