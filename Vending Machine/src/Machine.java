
public class Machine {
	Level [] levels;
	// Define the outlook of vending machine:
	private final int NUM_LEVELS = 2;
	private final int NUM_CELLS = 3;
	public Machine() {
		this.levels = new Level[NUM_LEVELS];
		for(int i = 0; i < NUM_LEVELS; i++) {
			levels[i] = new Level(i, NUM_CELLS);
		}
	}
	public void makePurchase(int level, int col, double money) {
		if(level >= NUM_LEVELS || col >= NUM_CELLS) {
			System.out.println("This input is invalid!");
			return ;
		}
		if(levels[level].canSellItem(col, money)) {
			double change = levels[level].countChange(col, money);
			String product = levels[level].getProduct(col);
			System.out.println("Sold a " + product + " and return change: " + change);
			return ;
		}
	}
	public void refillVendingMachine() {
		for(int i = 0; i < NUM_LEVELS; i++) {
			for(int j = 0; j < NUM_CELLS; j++) {
				levels[i].getCell(j).refill();
			}
		}
		System.out.println("Vending Machine refilled!");
	}
}
