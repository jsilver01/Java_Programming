package week12_example03;

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

	@Override
	public int compareTo(Student o) { //이름 기준
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
}
