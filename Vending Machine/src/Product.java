
public enum Product {
		Coke("Coke", 1.9),
		CokeZero("CokeZero", 1.8),
		DietCoke("DietCoke", 1.8),
		Fanta("Fanta", 1.75),
		Sprite("Sprite", 1.6), 
//		DietSprite,
//		RootBeer,
//		DrPepper,
//		DrPepperDiet,
//		Pepsi,
//		DietPepsi,
		Water("Water", 1.5);
		private final double price;
		private final String name;
		private Product(String n, double p) {
			this.name = n;
			this.price = p;
		}
		public String getName() {
			return name;
		}
		public double getPrice() {
			return price;
		}
}
