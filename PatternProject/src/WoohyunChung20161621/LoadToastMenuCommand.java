package WoohyunChung20161621;

public class LoadToastMenuCommand implements Command {
	
	ToastMenu toastMenu;
	
	public LoadToastMenuCommand(ToastMenu toastMenu){
		this.toastMenu = toastMenu;
	}
	public void execute(){
		System.out.println("-- 어서오세요 아삭 토스트입니다. 주문하실 토스트를 입력해주세요 --\n");
		System.out.println("---------------------");
		System.out.println("햄토스트");
		System.out.println("햄치즈토스트");
		System.out.println("불닭토스트");
		System.out.println("치즈토스트");
		System.out.println("디럭스토스트");
		System.out.println("베이컨토스트");
		System.out.println("---------------------\n");
	}

}
