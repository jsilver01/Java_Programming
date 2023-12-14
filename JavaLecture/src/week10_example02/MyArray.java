package week10_example02;

public class MyArray <E> {
	//필드
	private final int CAPACITY; // 배열크기
	private int count = 0; // 저장된 개수
	E[] arr;
	//
	
	//생성자
	@SuppressWarnings("unchecked")
	public MyArray(int CAPACITY) {
		super();
		this.CAPACITY = CAPACITY;
		arr = (E[])new Object[this.CAPACITY]; //E타입으로 배열 생성은 불가해서 object타입으로 생성하고 E 타입으로 변환하기
	}
	//
	
	//메소드
	public void add(E e) {
		if (this.count < this.CAPACITY)
			arr[count++] = e;
		else
			System.out.println("공간부족");
	}

	public E getElement(int index) {
		if (index >= 0 && index < count)
			return arr[index];
		else
			return null;
	}
	//
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result = "";
		for(E e : arr) {			
			result += e.toString()+"\n";
		}
		return result;
	}
			
}
