package week12_example03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.function.Predicate;

class StdComparator implements Comparator<Student>{
	int flag = 0;
	
	public StdComparator(int flag) {
		super();
		this.flag = flag;
	}
	
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		switch(flag) {
		case 1 -> {return o1.score - o2.score ;}
		case 2 -> {return (o1.score - o2.score)*-1 ;}
		case 3 -> {return o1.sid.compareTo(o2.sid);}
		default -> {return o1.name.compareTo(o2.name);}
		}
	}
}

public class TeatMain {

	public static void main(String[] args) {
//		//LinkedList<Integer> list = new LinkedList<>();
//		var list = new LinkedList<Integer>(); // 이런식으로선언가능
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		list.add(50);
//		Collections.shuffle(list);
//		System.out.println(list);
//		
//		Collections.sort(list);
//		System.out.println(list);
//		
//		Collections.sort(list, Collections.reverseOrder()); 
		
		//lab01();
		lab02();
	}

	private static void lab02() {
		var list = new ArrayList<Student>();
		list.add(new Student("홍길동","2000",80));
		list.add(new Student("이길동","2010",95));
		list.add(new Student("고길동","2005",75));
		list.add(new Student("김길동","2021",88));
		list.add(new Student("차길동","2020",90));
	
		//람다표현식으로 아래 함수 간단하게 변환하기
		//public int compare(Student o1, Student o2)
//		Collections.sort(list, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				return (o1.name.compareTo(o2.name))*-1;
//			}
//		}); -> 이 식을 아래 코드로 변형한거임
		//Comparator<Student> cmp =(o1, o2)-> (o1.name.compareTo(o2.name))*-1; 이렇게 쓰여져서 cmp로 들어갔던게 다이렉트로 람다식으로 정해줄 수도 있다.
		Collections.sort(list, (o1, o2)-> (o1.name.compareTo(o2.name))*-1); 
		System.out.println(list);
		
		//학번 내림차순으로 출력
		Comparator<Student> cmp2 = (o1,o2) -> (o1.sid.compareTo(o2.sid)*-1);
		Collections.sort(list, cmp2);
		System.out.println(list);
		
		//성적이 90점 이상인 조건으로 출력하려고함
		Predicate<Student> scorecheck = std -> std.score >= 90;
		for(Student s : list) {
			if(scorecheck.test(s)) {
				System.out.println(s);
			}
		}
	}

	private static void lab01() {
		var list = new ArrayList<Student>();
		list.add(new Student("홍길동","2000",80));
		list.add(new Student("이길동","2010",95));
		list.add(new Student("고길동","2005",75));
		list.add(new Student("김길동","2021",88));
		list.add(new Student("차길동","2020",90));
	
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.sort(list); // 이거 하려면 student.java에 implements
		int index = Collections.binarySearch(list, new Student("고길동","",0));
		if(index !=-1) {
			System.out.println(list.get(index));
		}
		
		StdComparator cmp = new StdComparator(3);
		Collections.sort(list, cmp);
		int idx = Collections.binarySearch(list, new Student("","2010",0), cmp);
		if(idx !=-1) {
			System.out.println(list.get(idx));
		}
		
//		//익명객체로 만드는 방법
//		Collections.sort(list, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				return (o1.name.compareTo(o2.name))*-1;
//			}
//		});
		
//		//익명객체 대신 이 방법도 가능 -> 클래스생성
//		Collections.sort(list, new StdComparator(1));
//		System.out.println(list);
//		Collections.sort(list, new StdComparator(2));
//		System.out.println(list);
//		Collections.sort(list, new StdComparator(3));
//		System.out.println(list);
	}

}
