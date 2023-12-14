package week10_example02;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
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
			int num = arr.getElement(4);
			System.out.println(num);
		}catch(NullPointerException e) {
			System.out.println("배열 인덱스 확인 요함");
		}
		
//		//////////// wrapper class
//		Integer num = arr.getElement(5); // 이렇게 Integer 쓰면 예외 발생 안함
//		
//		if(num!=null) {
//			System.out.println(num);
//		}
//		////////////
		
		System.out.println(arr);
		
		MyArray<String> strarr = new MyArray<String>(2);
		strarr.add("홍길동");
		strarr.add("김길동");
		System.out.println(strarr);
		int num = arr.getElement(1);
		
		System.out.println(num);
		System.out.println(arr);
		
	}
////
////	private static void printArray(String[] strarr) {
////		for(String data : strarr) {
////			System.out.println(data);
////		}
////	}
////
////	private static void printArray(int[] arr) {
////		for(int data : arr) {
////			System.out.println(data);
////		}
////	} //알고리즘이 똑같고 타입만 다르면 이렇게 오버라이딩해서 사용할 필요가 없다. 
////	
	
//	private static <T> void printArray(T[] arr) {
//		for(T data : arr) {
//			System.out.println(data);
//		}
//	}

}
