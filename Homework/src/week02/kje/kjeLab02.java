package week02.kje;

import java.util.Scanner;

public class kjeLab02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("202114219 김정은");
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("학번:");
		int studentnum = scanner.nextInt();
		
		System.out.printf("이름:");
		String name = scanner.next();
		
		System.out.printf("나이:");
		int age = scanner.nextInt();
		
		scanner.nextLine();
		System.out.printf("주소:");
		String address = scanner.nextLine();
		
		System.out.println("학번:"+ studentnum+"\n이름:"+name+"\n나이:"+age+"\n주소:"+address);
		
		scanner.close();
	}

}
