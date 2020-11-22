package WoohyunChung20161621;

public class HamToast implements Toast{
	
	public HamToast(){
		int cost = 1200;
		System.out.println("-- 가격은 "+ cost + "원 입니다. --\n");
		
	}
	@Override
	public int cost(){
		return 1200;
	}
	
}
