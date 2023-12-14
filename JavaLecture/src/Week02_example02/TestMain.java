package Week02_example02;

public class TestMain {
	//binary string으로 만들어주는 함수
	public static String getBinaryString(int num) {
		if(num<0)
			return Integer.toBinaryString(num);
		else {
			String tmpStr = "0".repeat(32)+Integer.toBinaryString(num);
			String result = tmpStr.substring(tmpStr.length()-32);
			return result;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -10;
		int b = -8;
//		int c = a | b; //비트연산 
		
		System.out.println("a="+getBinaryString(a));
		System.out.println("b="+getBinaryString(b));
		System.out.println("==================================");
		
		//a랑 b랑 바꾸는 코드
		a = a^b;
		System.out.println("a="+getBinaryString(a));
		System.out.println("b="+getBinaryString(b));
		System.out.println("==================================");
		
		b = a^b;
		System.out.println("a="+getBinaryString(a));
		System.out.println("b="+getBinaryString(b));
		System.out.println("==================================");
		
		a = a^b;
		System.out.println("a="+getBinaryString(a));
		System.out.println("b="+getBinaryString(b));
		System.out.println("==================================");
		
		//여기 잘되는지 확인
		a = a >>> 3;
		b = b >>> 3;
		System.out.println("a="+getBinaryString(a));
		System.out.println("b="+getBinaryString(b));
		System.out.println("==================================");
//		System.out.println("a="+aBiStr);
//		System.out.println("b="+Integer.toBinaryString(b));
//		System.out.println("c="+Integer.toBinaryString(c));

	}

}
