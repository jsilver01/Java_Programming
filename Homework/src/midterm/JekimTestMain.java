package midterm;

public class JekimTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("202114219 김정은\n");
		
		System.out.println("2) Contents 객체 생성 및 출력하기");
		JekimContents c1 = new JekimContents("영화1", 1000);
		System.out.println(c1);
		
		System.out.println("3) Drama 객체 생성 및 출력하기");
		JekimContents c2 = new JekimDrama("드라마1-1", 2000, 0.25);
		System.out.println(c2);
		
		System.out.println("4) Movie 객체 생성 및 출력하기");
		JekimContents c4 = new JekimMovie("영화2", 2000,19);
		System.out.println(c4);
		
		System.out.println("5) TV 객체 생성하기");
		JekimTV jekimTV = JekimTV.getInstance(5);
		
		System.out.println("6) 컨텐츠 추가하기");
		jekimTV.addContent(new JekimDrama("드라마1-1",2000,0.3));
		jekimTV.addContent(new JekimDrama("드라마1-2",2000,0.0));
		jekimTV.addContent(new JekimDrama("드라마1-2",2000,0.25));
		jekimTV.addContent(new JekimMovie("영화2",2000,19));
		jekimTV.addContent(new JekimMovie("영화3",1000,10));
		jekimTV.addContent(new JekimDrama("드라마2-1",1000,0.1));
		jekimTV.addContent(new JekimMovie("영화4",1000,15));
		
		System.out.println("7) 컨텐츠 타이틀로 검색하기");
		JekimContents content1 = jekimTV.searchContents("드라마1-1");
		JekimContents content2 = jekimTV.searchContents("영화2");
		JekimContents content3 = jekimTV.searchContents("영화3");
		JekimContents content4 = jekimTV.searchContents("드라마1-2");
		JekimContents content5 = jekimTV.searchContents("드라마2-1");
		
		System.out.println("8) Client 객체 생성 및 출력하기");
		JekimClient gdhong = new JekimClient("홍길동" ,10 ,3);
		System.out.println(gdhong);
		JekimClient gdkim = new JekimClient("김길동" ,25 ,4);
		JekimClient gdlee = new JekimClient("이길동" ,42 ,3);
		
		System.out.println("9) 컨텐츠 다운로드하기");
		gdhong.downloadContents(content1);
		gdhong.downloadContents(content2);
		gdhong.downloadContents(content3);
		gdhong.downloadContents(content3);
		gdhong.downloadContents(content4);
		gdhong.downloadContents(content5);
		System.out.println("------------------");
		gdkim.downloadContents(content3);
		gdlee.downloadContents(content4);

		System.out.println("10) 다운로드이후 Client 객체 출력하기");
		System.out.println(gdhong);
		
		System.out.println("11) Client에게 다운로드 회수가 높은 컨텐츠 3개 추천하기");
		JekimContents[] rmdContents = jekimTV.recommandContents(gdkim);
		if(rmdContents != null) {
			for(int i = 0; i< rmdContents.length ; i++) {
				System.out.println(rmdContents[i]);
			}
		}
	}

}
