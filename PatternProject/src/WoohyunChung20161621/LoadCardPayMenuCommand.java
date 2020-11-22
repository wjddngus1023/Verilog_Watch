package WoohyunChung20161621;

public class LoadCardPayMenuCommand implements Command{
	
	CardPayMenu cardPayMenu;
	
	public LoadCardPayMenuCommand(CardPayMenu cardPayMenu){
		this.cardPayMenu = cardPayMenu;
	}
	public void execute(){
		System.out.println("-- 결제를 진행하겠습니다. --");
		System.out.println("-- 카드를 끝까지 밀어넣어 주십시오.  --\n");
		System.out.println("-- 결제가 완료되었습니다 영수증을 발행하시겠습니까? --");
		System.out.println("---------------------");
		System.out.println("1. 예");
		System.out.println("2. 아니오");
		System.out.println("---------------------\n");
	}

}
