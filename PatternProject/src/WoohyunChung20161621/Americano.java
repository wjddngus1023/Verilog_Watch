package WoohyunChung20161621;

public class Americano extends BeverageDecorator {
	
	 Beverage beverage;
	 
	 static int cost = 1000;
	 
	public Americano(Beverage beverage) {
		 this.beverage = beverage;
	
	 }
	
	@Override
	public int cost(){
		return cost;
	}
	
	@Override
	public String getDescription(){
		return beverage.getDescription() + "아메리카노";
	}

}
