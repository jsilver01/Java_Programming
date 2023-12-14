package midterm;

public class JekimTV {
	private JekimContents[] contents;
	private int downloadnum; // 다운로드 가능한 개수
	private int num = 0; //다운로드한 개수

	private JekimTV(int downloadnum) {
		this.downloadnum = downloadnum;
		contents = new JekimContents[downloadnum];
	}
	
	public static JekimTV getInstance(int downloadnum) {
		return new JekimTV(downloadnum);
	}

	public void addContent(JekimContents content) {
		if(this.num == this.downloadnum) {
			System.out.println("더이상 추가될 수 없습니다.");
		}else {
			for(int i = 0; i < num ; i++) {
				if(contents[i].getTitle().equals(content.getTitle())){
					System.out.println("타이틀이 같은 작품이 등록되어 있습니다.");
					return;
				}
			}
			contents[num++] = content;
			System.out.println("등록이 완료되었습니다.");
		}
	}

	public JekimContents searchContents(String title) {
		for(int i = 0; i < num ; i++) {
			if(contents[i].getTitle().equals(title)) {
				return contents[i];
			}
		}
		return null;
	}

	public JekimContents[] recommandContents(JekimClient client) {
		int maxrecommandnum = 3;
		int recommandationcount = 0;
		JekimContents[] recommandations = new JekimContents[maxrecommandnum];
		
		JekimContents[] clientarr = client.getContents();
		
		for(int i = 0; i< num; i++) {
			for(int j =0; j<num;j++) {
				if(contents[j]==clientarr[i]) {
					continue;
				}else {
					JekimContents[] store = new JekimContents[contents.length];
					store[i]= contents[i];
				}
			}
		}
		
		return null;
	}
	
	
}
