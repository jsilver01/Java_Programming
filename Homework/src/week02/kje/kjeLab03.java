package week02.kje;

public class kjeLab03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("202114219 김정은");
		int rgb = 0xffffffff;
		String strRgb = Integer.toBinaryString(rgb);
		System.out.println("현재 색상 : "+strRgb);
		
		int greenMask= 0xffff00ff;
		
		int result = rgb & greenMask;
		String Result = Integer.toBinaryString(result);
		System.out.println("변경 색상 : "+ Result);
	}

}
