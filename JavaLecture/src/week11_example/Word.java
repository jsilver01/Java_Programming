package week11_example;

public class Word {
	String eng;
	String kor;
	
	public void setKor(String kor) {
		this.kor = kor;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}


	public String getEng() {
		return eng;
	}

	public String getKor() {
		return kor;
	}

	public Word(String eng, String kor) {
		super();
		this.eng = eng;
		this.kor = kor;
	}

	@Override
	public String toString() {
		return eng +" : "+ kor;
	}

	//내가 만든 데이터 타입을 키 값으로 사용할때에는 equals 랑 hashCode() 오버라이딩해서 사용해야함 일반 String, int 같은걸 키 값으로 사용하면 그냥 시스템에서 알아서 처리함
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.eng.hashCode() + this.kor.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Word) {
			Word w = (Word)obj;
			return (this.eng.equals(w.eng) && this.kor.equals(w.kor));
		}else {
			return super.equals(obj);
		}
	}
	
	
}
