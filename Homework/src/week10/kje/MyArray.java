package week10.kje;

public class MyArray <E>{
	private final int CAPACITY;
	private int count = 0;
	E[] arr;
	
	@SuppressWarnings("unchecked")
	public MyArray(int CAPACITY) {
		super();
		this.CAPACITY = CAPACITY;
		arr = (E[])new Object[this.CAPACITY]; //E타입으로 배열생성은 불가해서 object 타입으로 생성하고 E타입으로 변환 
	}

	public void add(E e) {
		if(this.count < this.CAPACITY) {
			arr[count++] = e;
		}else {
			System.out.println("공간이 부족합니다.");
		}
	}

	public E getElement(int index) {
		if(index >= 0 && index < count) {
			return arr[index];
		}else
			return null;
	}

	//이거 안하면 출력 이상하게 됨
	@Override
	public String toString() {
		String result = "";
		for(E e : arr) {
			result += e.toString()+"\n";
		}
		return result;
	}

	
	
}
