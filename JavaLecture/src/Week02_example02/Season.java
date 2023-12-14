package Week02_example02;

import java.util.Scanner;

//public class Season {
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("월(1~12)을 입력하시오:");
//		int month = scanner.nextInt(); // 정수로 월 입력
//		switch(month) {
//			case 3:
//			case 4:
//			case 5:
//				System.out.println("봄입니다.");
//				break;
//			case 6: case 7: case 8:
//				System.out.println("여름입니다.");
//				break;
//			case 9: case 10: case 11:
//				System.out.println("가을입니다."); break;
//			case 12: case 1: case 2:
//				System.out.println("겨울입니다."); break;
//			default:
//				System.out.println("잘못된 입력입니다.");
//		}		
//		scanner.close();
//	}
//}

//public class Season {
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("월(1~12)을 입력하시오:");
//		int month = scanner.nextInt(); // 정수로 월 입력
//		switch(month) {
//			case 3,4,5-> {System.out.println("봄입니다."); System.out.println("Spring입니다.");}				
//			case 6,7,8 -> System.out.println("여름입니다.");				
//			case 9,10,11-> System.out.println("가을입니다.");				
//			case 12,1,2-> System.out.println("겨울입니다."); 
//			default -> System.out.println("잘못된 입력입니다.");
//		}
//		scanner.close();
//	}
//}

public class Season {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("월을 영어로 입력하시오:");
		String month = scanner.next();
		int result = switch(month) {
			case "Jan"-> {System.out.println("1월입니다."); yield 1;}				
			case "Feb" -> 2;				
			default-> 0;							
		};
		System.out.println(result);
		scanner.close();
	}
}
