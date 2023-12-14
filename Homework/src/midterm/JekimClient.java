package midterm;

public class JekimClient {
	private JekimContents[] contents;
	private String name;
	private int age;
	private int downloadnum; //다운로드할 수 있는 개수
	private int num; // 다운로드한 개수 
	
	public JekimClient(String name, int age, int downloadnum) {
		this.name = name;
		this.age = age;
		this.downloadnum = downloadnum;
		contents = new JekimContents[this.downloadnum];
	}

	public int getAge() {
		return age;
	}


	public int getDownloadnum() {
		return downloadnum;
	}

	
	public JekimContents[] getContents() {
		return contents;
	}

	@Override
	public String toString() {
		String str = "이름 : " + this.name +"\n";
		str += "나이 : " + this.age + "\n";
		str += "------------------\n";
		if(num==0) {
			str += "아직 다운로드된 컨텐츠가 없습니다.\n";
		}else {
			for(int i =0; i < num;i++) {
				str += contents[i].toString();
			}
		}
		return str;
	}

	public void downloadContents(JekimContents content) {
		if(this.num == this.downloadnum) {
			System.out.println("더이상 다운로드하실 수 없습니다.");
			return;
		}else {
			for(int i =0; i< num;i++) {
				if(contents[i].getTitle().equals(content.getTitle())) {
					System.out.println("이미 다운로드 완료된 작품입니다.");
					return;
				}
			}
			if(content instanceof JekimMovie) {
				JekimMovie m = (JekimMovie) content;
				if(m.getLimitage()>this.age) {
					System.out.println("나이제한으로 다운로드되지 않았습니다.");
					return;
				}
				contents[num] = content;
				contents[num++].addIncre();
				System.out.println("다운로드 완료하였습니다.");
				return;
			}
			contents[num] = content;
			contents[num++].addIncre();
			System.out.println("다운로드 완료하였습니다.");
		}
	}
	
	public boolean hasDownloaded(JekimContents content) {
		for (int i = 0; i < num; i++) {
			if (contents[i].getTitle().equals(content.getTitle())) {
				return true;
			}
		}
		return false;
	}
	
	public boolean canWatch(JekimContents content) {
		if (content instanceof JekimMovie) {
			JekimMovie movie = (JekimMovie) content;
			return this.age >= movie.getLimitage();
		}
		return true;
	}
	
}
