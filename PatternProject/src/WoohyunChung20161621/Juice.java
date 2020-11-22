package WoohyunChung20161621;

public class Juice extends BeverageDecorator{
	
	 Beverage beverage;
	 static int cost = 1500;

	public Juice(Beverage beverage) {
		 this.beverage = beverage;
	
	 }
	@Override
	public int cost(){
		return cost;
	}
	@Override
	public String getDescription() {
		   
	    return beverage.getDescription() + "과일주스";
	  }
	
}
