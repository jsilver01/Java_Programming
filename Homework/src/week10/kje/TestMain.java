package week10.kje;

public class TestMain {

	public static void main(String[] args) {
		System.out.println("202114219 김정은");
//		//실습1
//		Integer[] arr = {10,20,30,40}; // 제너릭메소드를 사용하려면 기본형 데이터 타입은 사용할 수 없어서 int -> Integer
//		printArray(arr);
//		String[] strarr = {"홍길동", "김길동"};
//		printArray(strarr);
		
		MyArray<Integer> arr = new MyArray<Integer>(5);
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		
		try {
			int num = arr.getElement(3);
			System.out.println(num);
		}catch(NullPointerException e) {
			System.out.println("인덱스 범위 확인 요망");
		}
		
		System.out.println(arr);
		
		MyArray<String> strarr = new MyArray<String>(2);
		strarr.add("홍길동");
		strarr.add("김길동");
		System.out.println(strarr);
		
//		int str = arr.getElement(1);
//		
//		System.out.println(str);
//		System.out.println(arr);
		
	}
	
//  //실습1
//	private static <T> void printArray(T[] arr) {
//		for(T data : arr) {
//			System.out.println(data);
//		}
//	}
	
	

}
