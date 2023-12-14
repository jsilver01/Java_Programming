package midterm;

public class JekimContents {
	private String title;
	private int price;
	private int downloadnum;
	private int totalprice;
	
	public JekimContents(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	public int getDownloadnum() {
		return downloadnum;
	}

	@Override
	public String toString() {
		String str = "타이틀 : " + this.title + "\n";
		str += "가격 : " + this.price +"\n";
		str += "다운로드 수 : " + this.downloadnum + "\n";
		str += "총 판매가격 : " + this.totalprice +"\n";
		return str;
	}

	public void addIncre() {
		downloadnum++;
		totalprice += this.getPrice();
	}
	
	
	
}
