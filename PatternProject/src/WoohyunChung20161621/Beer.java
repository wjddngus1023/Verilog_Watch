package WoohyunChung20161621;

public class Beer extends BeverageDecorator{
	
	 Beverage beverage;
	 static int cost = 2000;

	public Beer(Beverage beverage) {
		 this.beverage = beverage;
	
	 }
	@Override
	public int cost(){
		return cost;
	}
	
	@Override
	public String getDescription(){
		return beverage.getDescription() + "╦фаж";
	}

}
