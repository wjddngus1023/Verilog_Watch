package WoohyunChung20161621;

public class HamCheeseToast implements Toast{
	
	public HamCheeseToast(){
		int cost = 1400;
		System.out.println("-- 가격은 " + cost + "원 입니다. --\n");
	}
	@Override
	public int cost(){
		return 1400;
	}

}
