package WoohyunChung20161621;

public class BaconToast implements Toast{
	
	public BaconToast(){
		int cost = 1600;
		System.out.println("-- 가격은 " + cost + "원 입니다. --\n");
	}
	@Override
	public int cost(){
		return 1600;
	}
}
