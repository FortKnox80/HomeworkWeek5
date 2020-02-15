package cakeShopState;

public class OrderCakeFromCaseState implements State {

	CakeShop cakeShop;

	public OrderCakeFromCaseState(CakeShop cakeShop) {
		this.cakeShop = cakeShop;
	}

	// A method to accept the money for an order place
	public void takeMoney() {
		System.out.println("We'll take your payment as soon as we're done taking your order.");

	}

	// A method to take an order
	public void placeSpecialOrder() {}

	// A method for ordering a pre-made cake
	public void placeCaseOrder() {
		System.out.println("Oooh that's a good choice. I love that cake.");

	}

	// A method actually filling the order and giving the cake to the customer
	public void fillOrder() {
		System.out.println("I just have to finish taking your order, grab your payment, and then I can get things ready for you.");

	}

	// A method to make more cakes when sold out
	public void makeMoreCakes() {}
}
