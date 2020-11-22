package WoohyunChung20161621;

public class CheeseToast implements Toast {
	
	public CheeseToast(){
		int cost = 1000;
		System.out.println("-- 가격은 " + cost + "원 입니다. --\n");
	}
	@Override
	public int cost(){
		return 1000;
	}

}
