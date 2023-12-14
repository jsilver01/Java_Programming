package midterm;

public class JekimDrama extends JekimContents{
	private double discount;

	public JekimDrama(String title, int price, double discount) {
		super(title, price);
		this.discount = discount;
	}
	
	@Override
	public int getPrice() {
		return (int)(super.getPrice() * (1-this.discount));
	}

	@Override
	public String toString() {
		String str = super.toString();
		str += "할인율 : " + (this.discount * 100) + "%\n";
		str += "------------------------\n";
		return str;
	}
	
	

}
