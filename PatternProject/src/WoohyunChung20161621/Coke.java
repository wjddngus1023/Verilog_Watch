package WoohyunChung20161621;

public class Coke extends BeverageDecorator {
	
	Beverage beverage;
	static int cost = 1400;

	public Coke(Beverage beverage) {
		 this.beverage = beverage;
	
	 }
	@Override
	public int cost(){
		return cost;
	}
	@Override
	public String getDescription() {
		   
	    return beverage.getDescription() + "Åº»êÀ½·á";
	  }
	
}
