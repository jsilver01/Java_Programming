package week13_example01;

public class Student implements Comparable<Student>{
	String name;
	String sid;
	int score;
	
	public int getScore() {
		return score;
	}
	
	public Student(String name, String sid, int score) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.sid = sid;
		this.score = score;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+" : "+this.sid+" : "+this.score;
	}

	
//	//sid 중복제거 문제 hashCode 랑 equals 오버라이딩으로 해결함.
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.sid.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			return this.sid.equals(std.sid);
		}else {
			return super.equals(obj);
		}
	}

	@Override
	public int compareTo(Student o) { //이름 기준
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
}
