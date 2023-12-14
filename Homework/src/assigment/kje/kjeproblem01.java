package assigment.kje;

import java.util.Scanner;

public class kjeproblem01 {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("202114219 김정은");
		while(true) {
			int menu = SelectMenu();
			switch(menu) {
			case 1:
				BuyCoupon();
				break;
			case 2:
				puzzle();
				break;
			case 3:
				table();
				break;
			case 4:
				sysExit();
				break;
			default:
				System.out.println("메뉴를 확인해 주세요.");
			}	
		}
	}

	public static int SelectMenu() {
		System.out.println("1) 쿠폰으로 초콜릿 구매하기 2) 문자 산수 퍼즐 3) 구구단 출력하기 4) 종료");
		System.out.printf("메뉴를 선택하세요 : ");
		int menu = scan.nextInt();
		return menu;
	}

	public static void BuyCoupon() {
		System.out.println("문제1. 쿠폰으로 초콜릿 구매하기");
		System.out.printf("돈을 넣어 주세요 : ");
		int money = scan.nextInt();
		int choco = money;
		int coupon = money;
		System.out.println("-".repeat(20));
		Calculate(choco,coupon);	
		System.out.println("-".repeat(20));
	}

	public static void Calculate(int choco, int coupon) {
		while(coupon>=7) {
			choco += coupon/7;
			coupon = coupon/7+ coupon%7;
		}
		System.out.println("초콜릿 "+choco+"개, 쿠폰 "+coupon+"개");
	}
	
	public static void puzzle() {
		for (int T = 0; T <= 9; T++) {
            for (int O = 0; O <= 9; O++) {
                if (T != O) {
                    for (int G = 1; G <= 9; G++) {
                        if (T != G && O != G) {
                            for (int D = 0; D <= 9; D++) {
                                if (T != D && O != D && G != D) {
                                    int TOO = T * 100 + O * 10 + O;
                                    int GOOD = G * 1000 + O * 100 + O * 10 + D;
                                    
                                    if (TOO + TOO + TOO + TOO == GOOD) {
                                        System.out.println("T = " + T);
                                        System.out.println("O = " + O);
                                        System.out.println("G = " + G);
                                        System.out.println("D = " + D);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
		}
	}
	
	public static void table() {
		System.out.println("====== 구구단 출력하기 ======");
		System.out.printf("출력 단수 : ");
		int num = scan.nextInt();
		if(num < 1 || num > 8) {
			System.out.println("출력 단수 입력이 잘못되었습니다.");
			table();
		}
		else {
			int first=2;
			for(int i=0; i<=10/num; i++) {
				printTable(first,num);
				first+=num;
				System.out.println();
			}
		}
	}

	public static void printTable(int first, int lineNum) {
		for(int i=1; i<10; i++) {
			for(int j=first; j< first+lineNum; j++) {
				if(first+lineNum > 10) {
					lastPrint(first);
					return;
				}
				else {
					System.out.printf("%d * %d = %2d",j,i,i*j); // 구구셈 출력
					System.out.print('\t');
				}
			}
			System.out.println();
		}
	}

	public static void lastPrint(int first) {
		for(int i=1;i<10;i++) {
			for(int j=first;j<10;j++) {
				System.out.printf("%d * %d = %2d",j,i,i*j); // 구구셈 출력
				System.out.print('\t');
			}
			System.out.println();
		}
	}
	
	public static void sysExit() {
		System.out.println("시스템을 종료합니다.");
		scan.close();
		System.exit(0); //system 종료
	}
}
