package week09_example;

import java.util.InputMismatchException;
//import java.util.Random;
import java.util.Scanner;

class MenuRangeCheckException extends RuntimeException{

	public MenuRangeCheckException(String message) {
		super(message);
		
	}
	
}

public class TestMain {
	
//	public static void method() throws ClassNotFoundException{
////		try {
//			Class clazz = Class.forName("week09_example.TestMain");
////		} catch (ClassNotFoundException e) {
////			e.printStackTrace();
////			System.out.println(e.getMessage());
////		}
//	}
	

	public static Scanner scan = new Scanner(System.in);
	//try - catch 예외처리  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
			try {
				System.out.println("1) 커피 2) 빵 3) 종료");
				int choice = scan.nextInt();
				if(!(choice >= 1 && choice <=3)) {
					//System.out.println("범위 체크 요망");
					throw new MenuRangeCheckException("범위 체크 요망");
				}
			}catch(InputMismatchException e) {
				System.out.println("정수를 입력하세요");
				scan.nextLine(); // 입력버퍼비우기
			}catch(MenuRangeCheckException e) {
				System.out.println(e.getMessage());
			}
			
		}
	}
}
		
		
		
		
		
//		int num = 100;
//		Random rand = new Random();
////		while(true) {
//			try {
//				method();
//				String str = args[1];
//				throw new RuntimeException("실행예외 발생함");
////				int result = num/ rand.nextInt(100);
////				System.out.println(result);
////				if(result > 2)
////					return;
//			}catch(ArithmeticException e) {
//				System.out.println("0으로 나눌 수 없음");
//			}
//			catch(ClassNotFoundException e) {
//				System.out.println("클래스 이름을 찾을 수 없음");
//			}
//			catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println("인덱스 예외 발생");
//			}
//			finally {
//				System.out.println("다음 연산을 수행합니다.");
//			}
//		
//	}

