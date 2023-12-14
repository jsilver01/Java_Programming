package midterm;

public class JekimMovie extends JekimContents{
	private int limitage = 0;

	public JekimMovie(String title, int price, int limitage) {
		super(title, price);
		this.limitage = limitage;
	}

	public int getLimitage() {
		return limitage;
	}

	@Override
	public String toString() {
		String str = super.toString();
		str += "나이제한 : " + this.limitage + "\n";
		str += "------------------------\n";	
		return str;
	}
}
