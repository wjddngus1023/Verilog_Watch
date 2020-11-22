package WoohyunChung20161621;

public class LoadBevMenuCommand implements Command{

BevMenu bevMenu;
	
	public LoadBevMenuCommand(BevMenu bevMenu){
		this.bevMenu = bevMenu;
	}
	public void execute(){
		System.out.println("-- 추가 주문하실 음료수의 번호를 입력해주세요 --\n");
		System.out.println("---------------------");		
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페라떼");
		System.out.println("3. 과일주스");
		System.out.println("4. 탄산음료");
		System.out.println("5. 맥주");
		System.out.println("6. 주문하지 않음");
		System.out.println("---------------------\n");
	}

}


