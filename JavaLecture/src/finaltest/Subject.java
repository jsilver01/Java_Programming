//package finaltest;
//
//import java.util.HashSet;
//
//public class Subject {
//	String subID; //과목 번호
//	String subName; //과목 이름
//	HashSet<Student> stdset = new HashSet<>(); // 수강생 저장구조
//	
//	public Subject(String subID) {
//		this(subID, null);		
//	}
//
//	public Subject(String subID, String subName) {
//		super();
//		this.subID = subID;
//		this.subName = subName;
//	}
//	
//	public void register(Student std) {
//				
//	}
//	
//	@Override
//	public String toString() {		
//		String str = "과목번호 : "+this.subID+"\n";
//		str += "과목이름 : "+this.subName+"\n";
//		str += "등록 학생 명단\n";
//		str += "------------------------\n";		
//		
//		return null;
//	}
//	
//	
//}
