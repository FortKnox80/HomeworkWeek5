package cakeShopState;

public class NoOrderState implements State{
	
	CakeShop cakeShop;

	public NoOrderState(CakeShop cakeShop) {
		this.cakeShop = cakeShop;
	}
	
	//A method to accept the money for an order place
	public void takeMoney() {
		System.out.println("We'd love to take your money, but you probably want to pick out a cake first!");
		
	}

	//A method to take an order
	public void placeSpecialOrder() {
		System.out.println("Our bakers are waiting to design some special cakes.");
		
	}
	
	//A method for ordering a pre-made cake
	public void placeCaseOrder() {
		System.out.println("We have so many lovely cakes waiting to be taken home.");

	}
	
	//A method actually filling the order and giving the cake to the customer
	public void fillOrder() {
		System.out.println("Well you have to order a cake before we can give it to you silly.");
		
	}

	//A method to make more cakes when sold out
	public void makeMoreCakes() {}
	
	
}
