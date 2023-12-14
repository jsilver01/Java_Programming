package assigment.kje;

import java.util.InputMismatchException;
import java.util.Scanner;

public class kjeproblem02 {
	public static Scanner scan = new Scanner(System.in);
	
	static final int ROW = 4;
	static final int COL = 3;

	public static void main(String[] args) {
		System.out.println("202114219 김정은");
		
		String[][] parkingSpace = new String[ROW][COL];
		String[][] parkedCar = new String[ROW][COL];
		
		initializeParkingSpace(parkingSpace);
		
		
		while(true) {
			int menu = SelectMenu(parkingSpace);
			switch(menu) {
			case 1:
				Parking(parkingSpace,parkedCar);
				break;
			case 2:
				Carsearch(parkingSpace,parkedCar);
				break;
			case 3:
				Carexit(parkingSpace,parkedCar);
				break;
			case 4:
				sysExit();
				break;
			default:
				System.out.println();
				System.out.println("메뉴 번호를 확인 후 다시 입력해 주세요.");
				System.out.println();
			}	
		}
	}

	//주차위치 빈하트로 초기화
	public static void initializeParkingSpace(String[][] parkingSpace) {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                parkingSpace[i][j] = "♡";
            }
        }
    }

	//메뉴선택
	public static int SelectMenu(String[][] parkingSpace) { 
		PrintNow(parkingSpace); //주차 현황 출력
		System.out.println("1) 주차하기 2) 차량검색 3) 출차하기 4) 종료");
		System.out.printf("메뉴를 선택하세요 : ");
		int menu = scan.nextInt();
		return menu;
	}
	
	public static void PrintNow(String[][] parkingSpace) {
		System.out.println();
		System.out.println("**** 주차 현황 ****");
		System.out.println("  1 2 3");
		for(int i = 0; i < ROW ; i++) {
			System.out.print(i+1+" ");
			for(int j = 0; j < COL ; j++) {
				System.out.print(parkingSpace[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	//1.주차하기
	public static void Parking(String[][] parkingSpace, String[][] parkedCar){
		System.out.println();
		
		System.out.println("**** 주차하기 ****");
		
		try {
            System.out.print("주차할 위치를 입력하세요 (예: 1 2): ");
            int row = scan.nextInt() - 1; // 배열 인덱스는 0부터 시작하므로 1을 빼줍니다.
            int col = scan.nextInt() - 1;

            if (!isValidParkingSpace(row, col)) {
                throw new InputMismatchException();
            }

            if (parkingSpace[row][col].equals("♡")) {
            	Parkingcheck(row,col,parkingSpace,parkedCar);
            } else {
            	System.out.println("다른 차량이 주차되어 있습니다. 처음부터 다시 시작해 주세요.");
    			return;
            }
        } catch (InputMismatchException e) {
        	System.out.println("위치 번호를 확인해 주세요. 처음부터 다시 시작해 주세요.");
	        return;
        }
    }
		
	public static boolean isValidParkingSpace(int row, int col) {
        return row >= 0 && row <= ROW-1 && col >= 0 && col <= COL-1;
    }

	public static void Parkingcheck(int row, int col, String[][] parkingSpace, String[][] parkedCar) {
		System.out.print("차량 번호를 입력해 주세요(입력예 : 20가1234) : ");
        String carnum = scan.next();
        
		System.out.print("차량 번호 "+carnum+" 맞습니까?(y/n)? ");
		String answer = scan.next();
		if(answer.equals("y")) {
			parkedCar[row][col] = carnum;
			System.out.println(carnum+"차량의 주차를 완료하였습니다.");
			parkingSpace[row][col] = "♥︎";
		}
		else {
			System.out.println("처음부터 다시 진행해 주세요.");
			return;
		}
	}
	
	//2. 차량검색
	public static void Carsearch(String[][] parkingSpace, String[][] parkedCar) {
		System.out.println();
		System.out.println("**** 차량검색 ****");
		System.out.print("차량 번호를 입력해 주세요 : ");
		String carnum = scan.next();
		
		for(int i=0 ; i< ROW;i++) {
			for(int j =0 ; j < COL ; j++) {
				if(carnum.equals(parkedCar[i][j])){
					int row = i+1;
					int col = j+1;
					System.out.println(carnum + "는 ("+ row +", "+ col +")에 위치합니다.");
					return;
				}
			}
		}
		System.out.println("차량이 존재하지 않습니다. 차량번호 확인후 처음부터 다시 진행해 주세요.");
		return;
	}
	
	
	
	//3. 출차하기
	public static void Carexit(String[][] parkingSpace, String[][] parkedCar) {
		System.out.println();
		System.out.println("**** 출차하기 ****");
		System.out.print("차량 번호를 입력해 주세요 : ");
		String carnum = scan.next();
		
		for(int i =0;i<ROW; i++) {
			for(int j=0; j<COL ;j++) {
				if(carnum.equals(parkedCar[i][j])) {
					parkingSpace[i][j] = "♡";
					parkedCar[i][j] = null;
					System.out.println(carnum + " 차량이 출차되었습니다. 안녕히 가세요.");
					return;
				}
			}
		}
		System.out.println("차량이 존재하지 않습니다. 차량번호 확인후 처음부터 다시 진행해 주세요.");
		return;
	}
	
	//4. 종료
	public static void sysExit() {
		System.out.println();
		System.out.println("시스템을 종료합니다.");
		scan.close();
		System.exit(0);
	}
}

