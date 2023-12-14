package Week02_example03;

import java.util.Scanner;

public class TestMain {
	public static final int AMERICANO =100; //수정불가
	public static final int CAFFELATTE =200;
	public static int americano =0; //수정가능
	public static int caffelatte =0;
	public static Scanner scan = new Scanner(System.in);
	
	public static int SelectMenu() {
		System.out.println("1) 아메리카노(100원) 2) 카페라떼(200원) 3) 결제 4) 종료");
		System.out.print("선택하세요 : ");
		int menu = scan.nextInt();
		return menu;
	}
	
	public static void OrderAmericano() {
		System.out.println("아메리카노를 주문하셨습니다.");
		americano++;
	}
	
	public static void OrderCaffeLatte() {
		System.out.println("카페라떼를 주문하셨습니다.");
		caffelatte++;
	}
	
	public static int getCost(int price, int num) { 
		return price * num;
	}
	
	public static void Payment() {
		System.out.println("=".repeat(20));
		System.out.println("      결제 금액");
		System.out.println("=".repeat(20));
		System.out.println("아메리카노 "+americano+"잔 "+ AMERICANO * americano+"원");
		System.out.println("카페라떼 "+caffelatte+"잔 "+ CAFFELATTE * caffelatte+"원");
		System.out.println("=".repeat(20));
		System.out.println("총 "+ (getCost(AMERICANO,americano)+getCost(CAFFELATTE,caffelatte))+"원");
		System.out.println("=".repeat(20));
		System.out.println("결제가 완료 되었습니다.");
		americano=0;
		caffelatte=0;
	}
	
	public static void sysExit() {
		System.out.println("시스템을 종료합니다.");
		scan.close();
		System.exit(0); //system 종료
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			int menu = SelectMenu();
			switch(menu) {
			case 1:
				OrderAmericano();
				break;
			case 2:
				OrderCaffeLatte();
				break;
			case 3:
				Payment();
				break;
			case 4:
				sysExit();
				break;
			default:
				System.out.println("메뉴를 확인해 주세요.");
			}	
		}
	}

}
