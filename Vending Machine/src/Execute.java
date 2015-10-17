
public class Execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine m = new Machine();
		m.makePurchase(2, 4, 10);
		m.makePurchase(0, 0, 2);
		m.makePurchase(0, 1, 5);
		m.makePurchase(0, 2, 1.9);
		m.makePurchase(1, 0, 1);
		m.makePurchase(1, 0, 3);
		m.makePurchase(1, 1, 1.7);
		m.makePurchase(1, 2, 1.8);
		m.makePurchase(0, 0, 4);
		m.makePurchase(0, 0, 1.9);
		m.makePurchase(0, 0, 2);
		m.refillVendingMachine();
		m.makePurchase(0, 0, 2);
	}

}
