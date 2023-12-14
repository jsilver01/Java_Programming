package Week02_example01;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String args[]) {
		System.out.println("이름, 도시, 나이, 체중,독신 여부,주소를 빈칸으로 분리하여 입력하세요");

		Scanner scanner = new Scanner(System.in);
		
		
		String name = scanner.next(); 
		System.out.println("당신의 이름은 " + name + "입니다.");
		
		String city = scanner.next(); 
		System.out.println("당신이 사는 도시는 " + city + "입니다.");
		
		int age = scanner.nextInt(); 
		System.out.println("당신의 나이는 " + age + "살입니다.");
		
		double weight = scanner.nextDouble(); // 실수 토큰 읽기
		System.out.println("당신의 체중은 " + weight + "kg입니다.");
		
		boolean single = scanner.nextBoolean();
		System.out.println("당신은 독신 여부는 " + single + "입니다.");
		//위에 있는것들은 다 white space를 구분자로 사용하는데 밑에 있는 nextLine은 \n을 구분자로 사용하기때문에 이런식으로 코드짜면 주소치기전에 엔터치면 걍 끝
		//해결하려면 밑에코드 하나 더 추가
		scanner.nextLine();
		
		String addr = scanner.nextLine();
		System.out.println("당신의 주소는 "+addr+"입니다.");
		
		scanner.close();
	}
}
