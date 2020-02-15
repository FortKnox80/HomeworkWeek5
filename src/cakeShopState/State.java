package cakeShopState;

public interface State {

	//Create all of the methods that each state will need to handle
	public void takeMoney();
	public void placeSpecialOrder();
	public void placeCaseOrder();
	public void fillOrder();
	public void makeMoreCakes();

}
