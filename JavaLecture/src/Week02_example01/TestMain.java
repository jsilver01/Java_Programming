package Week02_example01;

import java.io.IOException;

public class TestMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int code = System.in.read();
//		while((code = System.in.read()) != -1) {
//			System.out.printf("code = %d ,char = %c\n", code, (char)code);
//		}
//		System.out.println("입력종료");
		System.out.println(code);
		code = System.in.read();
		System.out.println(code);
		code = System.in.read();
		System.out.println(code);
	}
}
