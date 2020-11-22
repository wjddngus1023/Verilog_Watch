package WoohyunChung20161621;

import java.util.Scanner;

public class AsaacToast {

	public static void main(String[] args){
		
		Beverage DefaultDrink = new DefaultDrink(); // 기본음료 생성
		Toast toast = null;
					
		ToastMenu toastMenu = new ToastMenu();
		LoadToastMenuCommand loadToastMenu = new LoadToastMenuCommand(toastMenu);		
		BevMenu bevMenu = new BevMenu();
		LoadBevMenuCommand loadBevMenu = new LoadBevMenuCommand(bevMenu);
		CardPayMenu cardPayMenu = new CardPayMenu();
		LoadCardPayMenuCommand loadCardPayMenu = new LoadCardPayMenuCommand(cardPayMenu); // 커맨드생성
		
		loadToastMenu.execute();
		
		Scanner sc = new Scanner(System.in);
		String Toastname = sc.nextLine(); 
		
		ToastFactory.createToast(Toastname); // 팩토리 메소드 호출 
		
		loadBevMenu.execute();
	
		String BeverageSelect = sc.nextLine();
		
		switch(BeverageSelect){
		case "1" : 
			DefaultDrink = new Americano(DefaultDrink);		
			break;
		case "2" :
			DefaultDrink = new CafeLatte(DefaultDrink);
			break;
		case "3" : 
			DefaultDrink = new Juice(DefaultDrink);
			break;
		case "4" : 
			DefaultDrink = new Coke(DefaultDrink);
			break;
		case "5" :
			DefaultDrink = new Beer(DefaultDrink);
			break;
		case "6" :
			DefaultDrink = new NoneDrink(DefaultDrink);
			break;
			default :
				System.out.println("올바른 숫자를 입력해주세요");
				break;
				}
		
		System.out.println("-- " + DefaultDrink.getDescription() + "를 주문받았습니다. -- \n" + "-- 가격은 " + DefaultDrink.cost() + "원입니다. --\n"); // 가격출력
		
		loadCardPayMenu.execute();
		String receiptSelect = sc.nextLine();
		
		switch(receiptSelect){
		case "1" :
			System.out.println("================================");
			System.out.println("     " + Toastname + "        " + "1000" + " 원"); // 생성된 토스트의 가격을 뽑아보자
			System.out.println("     " + DefaultDrink.getDescription() + "        " + DefaultDrink.cost() + " 원");
			System.out.println("     주문번호 : 1");
			System.out.println("================================\n");
			System.out.println("-- 주문해 주셔서 감사합니다. 처음으로 돌아가시려면 -1을 입력하세요 --\n");
			break;
		case "2" :
			System.out.println("================");
			System.out.println("주문번호 : 1");
			System.out.println("================");
			System.out.println("-- 주문해 주셔서 감사합니다. 처음으로 돌아가시려면 -1을 입력하세요 --\n");
			break;
		}
		
		sc.close();
	}
	

	
	public int cost(){
		
		int total = 0;
			
		return total;
	}

}
