package cakeShopState;

public class NoMoreCakesState implements State {

	CakeShop cakeShop;

	public NoMoreCakesState(CakeShop cakeShop) {
		this.cakeShop = cakeShop;
	}

	// A method to accept the money for an order place
	public void takeMoney() {
		System.out.println("Oh now I can't take your money yet. We haven't gotten you anything.");

	}

	// A method to take an order
	public void placeSpecialOrder() {
		System.out.println("Oh sure we can still make you something special even though we are out of ready made cakes! I am glad you have something special in mind.");

	}

	// A method for ordering a pre-made cake
	public void placeCaseOrder() {
		System.out.println("I'm so sorry we are out of cakes that are ready made right now. We can put in a special order for you if you want though!");

	}

	// A method actually filling the order and giving the cake to the customer
	public void fillOrder() {}

	// A method to make more cakes when sold out
	public void makeMoreCakes() {
		System.out.println("We have to make some more cakes!");

	}

}
