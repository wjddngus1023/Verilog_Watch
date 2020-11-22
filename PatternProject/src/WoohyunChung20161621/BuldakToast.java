package WoohyunChung20161621;

public class BuldakToast implements Toast{
	
	public BuldakToast(){
		int cost = 1500;
		System.out.println("-- 가격은 " + cost + "원 입니다. --\n");
	}
	@Override
	public int cost(){
		return 1500;
	}

}
