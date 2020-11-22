package WoohyunChung20161621;

public class DeluxToast implements Toast{
	
	public DeluxToast(){
		int cost = 2000;
		System.out.println("-- 가격은 " + cost + "원 입니다. --\n");
	}
	@Override
	public int cost(){
		return 2000;
	}
}
