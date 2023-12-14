package week13_example01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestMain {
//	//지난 시간 복습
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		var list = new ArrayList<Student>();
//		list.add(new Student("홍길동","2000",80));
//		list.add(new Student("이길동","2010",95));
//		list.add(new Student("고길동","2005",75));
//		list.add(new Student("김길동","2021",88));
//		list.add(new Student("차길동","2020",90));
//		Predicate<Student> p = new Predicate<>() {
//
//			@Override
//			public boolean test(Student t) {
//				// TODO Auto-generated method stub
//				return t.score >= 90;
//			}
//		};
//		
//		list.removeIf(t->t.score>=90); //90점 이상의 점수를 가지고 있는 것들을 삭제 (조건식을 만족하는 객체를 삭제)
//		System.out.println(list);
//		//list.forEach(t->System.out.println(t));
//		
//		System.out.println(Collections.max(list, (o1,o2)-> (o1.score - o2.score)));
//		System.out.println(Collections.min(list, (o1,o2)-> (o1.score - o2.score)));
//		}
	public static void main(String[] args) {
		//stream();
		//listStore();
		//summarizingInt();
		//twice();
	}

	private static void twice() {
		var list = new ArrayList<Student>();
		list.add(new Student("홍길동","2000",80));
		list.add(new Student("이길동","2010",95));
		list.add(new Student("고길동","2005",75));
		list.add(new Student("김길동","2021",88));
		list.add(new Student("차길동","2020",90));
		list.add(new Student("김길동","2021",100));
		
		list.stream().distinct().forEach(System.out::println);
	}

	private static void summarizingInt() {
		var list = new ArrayList<Student>();
		list.add(new Student("홍길동","2000",80));
		list.add(new Student("이길동","2010",95));
		list.add(new Student("고길동","2005",75));
		list.add(new Student("김길동","2021",88));
		list.add(new Student("차길동","2020",90));
		//list.stream().collect(Collectors.summarizingInt(a -> a.score)); 아래랑 동일한 코드 쓰는 방법이 두가지이다.
		IntSummaryStatistics sum = list.stream().collect(Collectors.summarizingInt(Student::getScore));
		
		System.out.println(sum.getAverage());
		System.out.println(sum.getMax());
		System.out.println(sum.getSum());
}

	private static void listStore() { //리스트 형태로 저장
		var list = new ArrayList<Student>();
		list.add(new Student("홍길동","2000",80));
		list.add(new Student("이길동","2010",95));
		list.add(new Student("고길동","2005",75));
		list.add(new Student("김길동","2021",88));
		list.add(new Student("차길동","2020",90));
		var result = list.stream().sorted((o1,o2) -> (o1.score - o2.score)*-1).limit(3).collect(Collectors.toList());
		System.out.println(result);
		
		
}

	private static void stream() {
		var list = new ArrayList<Student>();
		list.add(new Student("홍길동","2000",80));
		list.add(new Student("이길동","2010",95));
		list.add(new Student("고길동","2005",75));
		list.add(new Student("김길동","2021",88));
		list.add(new Student("차길동","2020",90));
		list.stream().filter(t -> t.score<90).forEach(System.out::println);
		System.out.println("-".repeat(20));
		list.stream().sorted((o1,o2) -> (o1.score - o2.score)*-1).limit(1).forEach(System.out::println);
	}
	
}
