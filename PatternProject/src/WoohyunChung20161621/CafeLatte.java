package WoohyunChung20161621;

public class CafeLatte extends BeverageDecorator{
	
	 Beverage beverage;
	 static int cost = 1200;

	public CafeLatte(Beverage beverage) {
		 this.beverage = beverage;
	
	 }	
	@Override
	public int cost(){
		return cost;
	}
	@Override
	public String getDescription() {
	   
	    return beverage.getDescription() + "Ä«Æä¶ó¶¼";
	  }

}
