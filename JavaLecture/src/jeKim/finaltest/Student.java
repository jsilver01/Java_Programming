package jeKim.finaltest;

public class Student {
	String stdID; //학번
	String stdName; //이름	
	
	public Student(String stdID, String stdName) {
		super();
		this.stdID = stdID;
		this.stdName = stdName;
	}

	@Override
	public String toString() {
		String str = "학번 : "+this.stdID+" / ";
		str += "이름 : "+this.stdName+"\n";		
		str += "------------------------";
		return str;
	}

	//sid 로 중복제거 
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.stdID.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			return this.stdID.equals(std.stdID);
		}else {
			return super.equals(obj);
		}
	}
	
}
