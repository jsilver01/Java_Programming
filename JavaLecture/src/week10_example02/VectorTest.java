package week10_example02;

import java.util.List;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new Vector<Integer>();
		Vector<Integer> list2 = new Vector<>();
		Vector<Integer> list3 = new Vector<>(3);
		
		System.out.println(list1.size());
		System.out.println(list2.size()+" : "+list2.capacity());
		System.out.println(list3.size()+" : "+list3.capacity());
		
		list3.add(10);
		list3.add(20);
		list3.add(30);
		list3.add(40);
		list3.add(50);
		System.out.println(list3.size()+" : "+list3.capacity()); //size가 내가 준 capacity 의 배만큼 증가함 3 -> 6 -> 9
		
		//delete
		list3.remove(2);
		list3.remove(3);
		System.out.println(list3.size()+" : "+list3.capacity()); 
		//늘어난 capacity 줄이기
		list3.trimToSize();
		System.out.println(list3.size()+" : "+list3.capacity()); 
		
//		Vector<Integer> list4 = new Vector<>(list3);
//		System.out.println(list4); //list 형태로 출력
		
		
	}

}
