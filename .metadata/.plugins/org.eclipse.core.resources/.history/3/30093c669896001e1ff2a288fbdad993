package jeKim.finaltest;

import java.util.List;

public class jekimTestMain {

	public static void main(String[] args) {

		System.out.println("1)학번이름 출력하기");
		System.out.println("202114219 김정은");
		
		System.out.println();
		
		System.out.println("2)Subject 클래스의 수강신청 및 출력하기");
		Subject subject1 = new Subject("ES0406", "파이썬");		
		subject1.register(new Student("20011", "홍길동"));
		subject1.register(new Student("20011", "홍길동"));
		subject1.register(new Student("20022", "김길동"));
		System.out.println();
		System.out.println(subject1);
		
		System.out.println();
		
		System.out.println("3) SubjectManager 클래스 객체 생성 및 출력하기");
		SubjectManager csManager = new SubjectManager("컴퓨터공학과");
		csManager.addSubject(new Subject("ES0406", "파이썬"));
		csManager.addSubject(new Subject("CA0407", "C언어"));
		csManager.addSubject(new Subject("DC0408", "그래픽"));
		csManager.addSubject(new Subject("ES0406", "파이썬"));		
		System.out.println();
		System.out.println(csManager);
		
		System.out.println();
		
		System.out.println("4) 과목번호로 Subject 찾기 및 수강 등록하기");
		Subject sub1 =csManager.findSubject("CA0407");
		if(sub1!=null) {
			sub1.register(new Student("20011", "홍길동"));
			sub1.register(new Student("20011", "홍길동"));
			sub1.register(new Student("20022", "김길동"));
			sub1.register(new Student("20017", "이길동"));
			sub1.register(new Student("20006", "박길동"));
		}else {
			System.out.println("과목번호를 확인해 주세요.");
		}
		
		Subject sub2 =csManager.findSubject("ES0406");	
		if(sub2!=null) {
			sub2.register(new Student("20011", "홍길동"));		
			sub2.register(new Student("20006", "박길동"));
		}else {
			System.out.println("과목번호를 확인해 주세요.");
		}
		
		Subject sub3 =csManager.findSubject("DC0408");		
		if(sub3!=null) {
			sub3.register(new Student("20011", "홍길동"));
			sub3.register(new Student("20022", "김길동"));
			sub3.register(new Student("20017", "이길동"));	
		}else {
			System.out.println("과목번호를 확인해 주세요.");
		}
		System.out.println();
		
		System.out.println(csManager);
		
		System.out.println();

		System.out.println("5) 학번으로 학생이 수강하고 있는 Subject 리스트 찾기");		
		List<Subject> list = csManager.findStudent("20022");
		if(list!=null) {
			for(Subject sub : list) {
				System.out.println(sub);
			}
		}
		
		System.out.println();
		
		System.out.println("6) 수강생이 가장 많은 과목 출력하기");
		Subject maxSub = csManager.getMaxSubject();
		System.out.println(maxSub);
		
		System.out.println();
			
		jekimFinalFrame frame = new jekimFinalFrame("202114219 김정은", csManager);
		
	}
}
