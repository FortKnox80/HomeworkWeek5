package cakeShopState;

public class CakeShop {
	//Set up the shop to be able to use all of the states
	State cakeIsSoldState;
	State cakeIsMadeState;
	State noMoreCakesState;
	State noOrderState;
	State orderCakeFromCaseState;
	State takingSpecialOrderState;
	
	State state; 
	
	//Initial inventory of cakes is 0
	int cakeInventory = 0;
	
	//Set up shop with the number of cakes in the case, and the type of order that is coming in
	public CakeShop(int numberCakes, String orderType) {
		cakeIsSoldState = new CakeIsSoldState(this);
		cakeIsMadeState = new CakeIsMadeState(this);
		noMoreCakesState = new NoMoreCakesState(this);
		noOrderState = new NoOrderState(this);
		takingSpecialOrderState = new TakingSpecialOrderState(this);
		orderCakeFromCaseState = new OrderCakeFromCaseState(this);
		
		this.cakeInventory = numberCakes;
		
		//If there are cakes in the case, and the order is a case order set the state to case order state
		if(numberCakes > 0 && orderType.toLowerCase().contains("case")) {
			state = orderCakeFromCaseState;
		//If the order is a special order, just set the state to special order
		} else if(orderType.toLowerCase().contains("special")) {
			state = takingSpecialOrderState;
		//If there are no cakes, then set the state to no cakes in the case
		} else if(numberCakes == 0) {
			state = noMoreCakesState;
		}
	}
	
	//Return the method from the current state that matches the class method
	public void takeMoney() {
		state.takeMoney();
	}
	
	public void placeSpecialOrder() {
		state.placeSpecialOrder();
	}
	
	public void placeCaseOrder() {
		state.placeCaseOrder();
		this.cakeInventory -= cakeInventory;
	}
	
	public void fillOrder() {
		state.fillOrder();
	}
	
	public void makeMoreCakes() {
		state.makeMoreCakes();
	}
	
	//Print out the welcome sign to the shop
	
	public void makeCakesForCase(int cakeCount) {
		cakeInventory += cakeCount;
		System.out.println("We've made " + cakeCount + " beautiful cakes for the case today. "
				+ "It is a vertiable feast of yummy confections.\nNow we have " + cakeInventory + " cakes total.");
	}
	
	void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}
	
	//Allow the class to return the states
	public State cakeIsSoldState() {
		return cakeIsSoldState;
	}
	
	public State cakeIsMadeState() {
		return cakeIsMadeState;
	} 
	
	public State noMoreCakesState() {
		return noMoreCakesState;
	} 
	
	public State noOrderState() {
		return noOrderState;
	} 
	
	public State orderCakeFromCaseState() {
		return orderCakeFromCaseState;
	} 
	
	public String toString() {
		StringBuffer welcome = new StringBuffer();
		welcome.append("Welcome to CeeCee's cake shop! \nWe hope we can find you something you'll love for any special ocassion.");
		
		return welcome.toString();
	}
}
