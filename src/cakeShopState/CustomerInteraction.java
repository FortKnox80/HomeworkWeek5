package cakeShopState;


public class CustomerInteraction {

	public static void main(String[] args) {
		
		//Open the shop with 6 cakes, and a customer who wants to buy one from the case
		CakeShop cakeShop = new CakeShop(6, "case");
		
		System.out.println(cakeShop.toString());
		
		cakeShop.placeCaseOrder();
		//Once a cake is sold, switch the state
		cakeShop.setState(cakeShop.cakeIsSoldState);
		cakeShop.takeMoney();
		//The cake is ready to give to the customer, so switch to that state
		cakeShop.setState(cakeShop.cakeIsMadeState);
		cakeShop.fillOrder();
		
		//Open the shop again, but this time with no cakes in the case, and a cutomer who will do a special order special order
		CakeShop cakeShop2 = new CakeShop(0, "special");
		
		System.out.println("\n");
		
		System.out.println(cakeShop2.toString());

		//First the customer wants something from the case
		cakeShop2.placeCaseOrder();
		//Customer is persuaded to place a special order instead
		cakeShop2.placeSpecialOrder();
		//We are selling a cake, so switch the state
		cakeShop2.setState(cakeShop2.cakeIsSoldState);
		//We take the payment for the cake
		cakeShop2.takeMoney();
		//Then when the cake is ready, switch the state again
		cakeShop2.setState(cakeShop2.cakeIsMadeState());
		//Give the customer their cake
		cakeShop2.fillOrder();
		
		//Make more cakes for the case
		cakeShop2.makeCakesForCase(3);
		
	}

}
