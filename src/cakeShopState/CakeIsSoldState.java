package cakeShopState;

public class CakeIsSoldState implements State{
	
	CakeShop cakeShop;

	public CakeIsSoldState(CakeShop cakeShop) {
		this.cakeShop = cakeShop;
	}

	//A method to accept the money for an order place
	public void takeMoney() {
		System.out.println("Ok, I'm so glad that we got that set for you. You can go ahead and insert your card.");
		
	}

	//A method to take an order
	public void placeSpecialOrder() {
		System.out.println("Sure, I can get that set for you. We just have to finish up this transaction, and then we can run another one.");
		
	}
	
	//A method for ordering a pre-made cake
	public void placeCaseOrder() {
		System.out.println("Sure, I can get that set for you. We just have to finish up this transaction, and then we can run another one.");
		
	}

	//A method actually filling the order and giving the cake to the customer
	public void fillOrder() {
		System.out.println("I can get that for you. We just have to finish out transaction before I can box it up for you.");
		
	}

	//A method to make more cakes when sold out
	public void makeMoreCakes() {}
}
