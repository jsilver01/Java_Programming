package week10_example;

//import java.io.File;

public class TestMain {
	
//====================================================	
//	//정규표현식 예
//	public static void main(String[] args) {
//		String sidPattern = "\\d{6}\\-[1-4]\\d{6}$";
//		//String sidPattern = " \\d{6}\\-[1-4]\\w+$";
//		String str = "010720-4236419";
//		if(str.matches(sidPattern)) {
//			System.out.println("일치합니다.");
//		}else {
//			System.out.println("일치하지않습니다.");
//		}
//	}
//=====================================================

	//파일 읽어와서 탭으로 분리시켜서 배열에 저장하는 예
	public static void main(String[] args) {
		VocManager voc = new VocManager("홍길동");
		voc.makeVoc("newFile.txt");
	}
}
