package cakeShopState;

public class TakingSpecialOrderState implements State{
	
	CakeShop cakeShop;

	public TakingSpecialOrderState(CakeShop cakeShop) {
		this.cakeShop = cakeShop;
	}

	//A method to accept the money for an order place
	public void takeMoney() {
		System.out.println("We'll take your payment as soon as we're done taking your order.");
		
	}

	//A method to take an order
	public void placeSpecialOrder() {
		System.out.println("Oh wonderful! Thank you for placing an order with us for your special day.");
		
	}

	//A method actually filling the order and giving the cake to the customer
	public void fillOrder() {
		System.out.println("So we will be able to have this cake ready for you tomorrow if you want to come back.");
		
	}

	//A method to make more cakes when sold out
	public void makeMoreCakes() {}

	//A method for ordering a pre-made cake
	public void placeCaseOrder() {}

}
