package week02.kje;

import java.util.Random;
import java.util.Scanner;

public class kjeLab04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("202114219 김정은");
		Scanner scanner = new Scanner(System.in);
		
		Random r = new Random();
		int randomNum1 = r.nextInt(3);
		
		System.out.println("가위(0), 바위(1), 보(2)중에 하나를 입력해주세요.");
		System.out.print("입력 : ");
		int input = scanner.nextInt();
		
		//user
		if(input == 0) {
			System.out.println("user : 가위");
		}
		else if(input == 1) {
			System.out.println("user : 바위");
		}
		else {
			System.out.println("user : 보");
		}
		
		//com
		if(randomNum1 == 0) System.out.println(" com : 가위");
		else if(randomNum1 == 1) System.out.println(" com : 바위");
		else System.out.println(" com : 보");
		
		//result
		if(input==randomNum1) {
			System.out.println("무승부");
		}
		else {
			if(input==0) {
				if(randomNum1==1) {
					System.out.println("com 승");
				}
				else if(randomNum1==2) {
					System.out.println("user 승");
				}
			}
			else if(input==1) {
				if(randomNum1==0) {
					System.out.println("user 승");
				}
				else if(randomNum1==2) {
					System.out.println("com 승");
				}
			}
			else {
				if(randomNum1==0) {
					System.out.println("com 승");
				}
				else if(randomNum1==1) {
					System.out.println("user 승");
				}
			}
		}
		scanner.close();
	}

}
