package WoohyunChung20161621;

public class ToastFactory {

	public static Toast createToast(String type){
		Toast toast = null;
		switch(type){
		
		case "베이컨토스트":
			System.out.println("-- " + type + "를 주문받았습니다 --\n");
			toast = (Toast) new BaconToast();
			break;
		case "불닭토스트":
			System.out.println("-- " + type + "를 주문받았습니다 --\n");
			toast = (Toast) new BuldakToast();
			break;
		case "햄토스트":
			System.out.println("-- " + type + "를 주문받았습니다 --\n");
			toast = (Toast) new HamToast();
			break;
		case "치즈토스트":
			System.out.println("-- " + type + "를 주문받았습니다 --\n");
			toast = (Toast) new CheeseToast();
			break;
		case "햄치즈토스트":
			System.out.println("-- " + type + "를 주문받았습니다 --\n");
			toast = (Toast) new HamCheeseToast();
			break;
		case "디럭스토스트":
			System.out.println("-- " + type + "를 주문받았습니다 --\n");
			toast = (Toast) new DeluxToast();
			break;
		}
		return toast;
	}
}
