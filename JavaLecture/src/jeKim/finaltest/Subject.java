package jeKim.finaltest;

import java.util.HashSet;

public class Subject implements Comparable<Subject>{
	String subID; //과목 번호
	String subName; //과목 이름
	HashSet<Student> stdset = new HashSet<>(); // 수강생 저장구조
	
	public Subject(String subID) {
		this(subID, null);		
	}

	public Subject(String subID, String subName) {
		super();
		this.subID = subID;
		this.subName = subName;
	}
	
	public void register(Student std) {
	    if (stdset.contains(std)) {
	        System.out.println("이미 수강 등록되어 있습니다.");
	    } else {
	        this.stdset.add(std);
	        System.out.println("수강 등록이 잘 되었습니다.");
	    }
	}

	//comparable 만들면서 get 이거 생성함
	public String getSubID() {
		return subID;
	}

	
	public String getSubName() {
		return subName;
	}

	@Override
	public int hashCode() {
		return this.subID.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Subject) {
			Subject std = (Subject)obj;
			return this.subID.equals(std.subID);
		}else {
			return super.equals(obj);
		}
	}
	
	@Override
    public int compareTo(Subject other) {
        return this.subID.compareTo(other.subID);
    }

	@Override
	public String toString() {		
		String str = "과목번호 : "+this.subID+"\n";
		str += "과목이름 : "+this.subName+"\n";
		str += "등록 학생 명단\n";
		str += "------------------------\n";		
		
		if(stdset.isEmpty()) {
			str += "등록한 학생이 존재하지 않습니다.\n";
		}else {
			for (Student s : stdset) {
	            str += s.toString() + "\n";
	        }
		}
		return str;
	}

	public int getStudentCount() {
		// TODO Auto-generated method stub
		return stdset.size();
	}
}
