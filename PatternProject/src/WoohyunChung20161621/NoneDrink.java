package WoohyunChung20161621;

public class NoneDrink extends BeverageDecorator{
	
	Beverage beverage;
	 
	 static int cost = 0;
	 
	public NoneDrink(Beverage beverage) {
		 this.beverage = beverage;
	
	 }
	
	@Override
	public int cost(){
		return cost;
	}
	
	@Override
	public String getDescription(){
		return beverage.getDescription() + "-- 음료수를 주문하시지 않으셨습니다. --\n";
	}


}
