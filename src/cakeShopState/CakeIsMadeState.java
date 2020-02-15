package cakeShopState;

public class CakeIsMadeState implements State{

	CakeShop cakeShop;

	public CakeIsMadeState(CakeShop cakeShop) {
		this.cakeShop = cakeShop;
	}
	
	//A method to accept the money for an order place
	public void takeMoney() {
		System.out.println("Oh no you already paid. These cakes are great, but no amazing enough to pay for them twice!");
		
	}

	//A method to take an order
	public void placeSpecialOrder() {
		System.out.println("Oh you want something else? Sure thing! Let me just get set up to take another order.");
		
	}
	
	//A method for ordering a pre-made cake
		public void placeCaseOrder() {
			System.out.println("Oh you want something else? Sure thing! Let me just get set up to take another order.");
			
		}


	//A method actually filling the order and giving the cake to the customer
	public void fillOrder() {
		System.out.println("Alrighty then, here is your beautiful cake. Boxed that up for you in our signature box, and we put a pretty bow on it too. I hope you love it!");
		
	}

	//A method to make more cakes when sold out
	public void makeMoreCakes() {}

	
}
