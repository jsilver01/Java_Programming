package week11_example;

import java.util.*;
import java.util.Map.Entry;

public class TestMain {
///실습 1///
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Word> list = new Vector<>();
        list.add(new Word("red1","빨강색1"));
        list.add(new Word("red2","빨강색2"));
        list.add(new Word("red3","빨강색3"));
        list.add(new Word("red4","빨강색4"));
        list.add(new Word("red5","빨강색5"));
        list.add(new Word("red6","빨강색6"));
        
        Word w = list.get(1); //index 1 인 객체
        w.setKor("빨강2");
        list.remove(1);

        System.out.println(list);
        System.out.println(w);
//        for(int i = 0; i< list.size();i++) {
//        	System.out.println(list.get(i)); //list[i]에 접근 가능
//        }
	}
}
	
	///실습 2///
//	public static void main(String[] args) {
//		Vector<Word> list = new Vector<>();
//		list.add(new Word("red1","빨강색1"));
//	    list.add(new Word("red2","빨강색2"));
//        list.add(new Word("red3","빨강색3"));
//        list.add(new Word("red4","빨강색4"));
//        list.add(new Word("red5","빨강색5"));
//        list.add(new Word("red6","빨강색6"));
//        
//        list.remove(new Word("red3","빨강색3")); //객체를 다이랙트로 생성하면서 add 했기 때문에 이런식으로 제거가 안됨
//        //삭제하기 위해서 word 클래스에 equal 메소드 오버라이딩해서 같다라는 의미를 정의해서 동작하도록 해줬다.
//        System.out.println(list);
//	}
	
	///실습 3///
//	public static void main(String[] args) {
//		Vector<Word> list = new Vector<>();
//		list.add(new Word("red1","빨강색1"));
//	    list.add(new Word("red2","빨강색2"));
//        list.add(new Word("red3","빨강색3"));
//        list.add(new Word("red4","빨강색4"));
//        list.add(new Word("red5","빨강색5"));
//        list.add(new Word("red6","빨강색6"));
//        list.add(new Word("red1","빨강색1"));
//	    list.add(new Word("red2","빨강색2"));
//        list.add(new Word("red3","빨강색3"));
//        list.add(new Word("red4","빨강색4"));
//        list.add(new Word("red5","빨강색5"));
//        list.add(new Word("red6","빨강색6"));
//        list.add(new Word("red1","빨강색1"));
//	    list.add(new Word("red2","빨강색2"));
//        list.add(new Word("red3","빨강색3"));
//        list.add(new Word("red4","빨강색4"));
//        list.add(new Word("red5","빨강색5"));
//        list.add(new Word("red6","빨강색6"));
//        
//        
//        list.remove(new Word("red3","빨강색3")); //이렇게 여러개 있을 때 이거 실행하면 제일 처음꺼만 삭제된다.
//        System.out.println(list);
//        
//        while(list.contains(new Word("red3","빨강색3"))) { //이렇게 다 찾아서 지우면 모든 것들 지울 수 있다.
//        	int idx = list.indexOf(new Word("red3","빨강색3"));
//        	if(idx != -1) {
//        		list.remove(idx);
//        	}
//        }
//        System.out.println(list);
//	}
	
	///실습 4///
//	public static void main(String[] args) {
//		Vector<Word> list = new Vector<>();
//		list.add(new Word("red1","빨강색1"));
//	    list.add(new Word("red2","빨강색2"));
//        list.add(new Word("red3","빨강색3"));
//        list.add(new Word("red4","빨강색4"));
//        list.add(new Word("red5","빨강색5"));
//        list.add(new Word("red6","빨강색6"));
//        list.add(new Word("red1","빨강색1"));
//	    list.add(new Word("red2","빨강색2"));
//        list.add(new Word("red3","빨강색3"));
//        list.add(new Word("red4","빨강색4"));
//        
//        list.subList(1, 4).clear();
//        System.out.println(list);
//        
////        List<Word> list2 = list.subList(1, 4); //1,2,3 인덱스 데려옴
////        System.out.println(list2);
////        list2.get(0).setKor("빨강2");
////        System.out.println(list);
//	}
	
	///실습5///
//	public static void main(String[] args) {
//		ArrayList<Word> list = new ArrayList<>();
//		list.add(new Word("red1","빨강색1"));
//	    list.add(new Word("red2","빨강색2"));
//        list.add(new Word("red3","빨강색3"));
//        list.add(new Word("red4","빨강색4"));
//        list.add(new Word("red5","빨강색5"));
//        list.add(new Word("red6","빨강색6"));
//        
//        Word[] arr = list.toArray(new Word[list.size()]);
//        for(Word w : arr) {
//        	System.out.println(w);
//        }
////        //Word[] arr = (Word[])list.toArray(); //이거 안됨
////        Object[] arr = list.toArray();
////        for(Object o : arr) {
////        	if(o instanceof Word) {
////        		System.out.println(o);
////        	}
////        }
//	}
	
	///실습6///
//	public static void main(String[] args) {
//		ArrayList<Integer> arr = new ArrayList<>();
//		LinkedList<Integer> list = new LinkedList<>();
//		
//		long starttime = System.nanoTime();
//		for(int i = 0; i<10000 ; i++) {
//			//arr.add(0,i);
//			arr.add(i);
//		}
//		long endtime = System.nanoTime();
//		System.out.println("Array : "+ (endtime - starttime));
//		
//		starttime = System.nanoTime();
//		for(int i = 0; i<10000 ; i++) {
//			//list.add(0,i);
//			list.add(i);
//		}
//		endtime = System.nanoTime();
//		System.out.println("list  : "+ (endtime - starttime));
//	}
	
	///실습7///
//	public static void main(String[] args) {
//		ArrayList<Word> list = new ArrayList<>();
//		list.add(new Word("red1","빨강색1"));
//	    list.add(new Word("red2","빨강색2"));
//	    list.add(new Word("red3","빨강색3"));
//	    list.add(new Word("red4","빨강색4"));
//	    list.add(new Word("red5","빨강색5"));
//	    
//	    Iterator<Word> it = list.iterator();
//	    while(it.hasNext()) {
//	    	System.out.println(it.next());
//	    }
//	}
	
	///실습8///
//	public static void main(String[] args) {
//		LinkedList<Word> list = new LinkedList<>();
//		list.add(new Word("red1","빨강색1"));
//	    list.add(new Word("red2","빨강색2"));
//	    list.add(new Word("red3","빨강색3"));
//	    list.add(new Word("red4","빨강색4"));
//	    list.add(new Word("red5","빨강색5"));
//	    
//	    ListIterator<Word> it = list.listIterator();
//	    while(it.hasNext()) {
//	    	System.out.println(it.next());
//	    }
//	    
//	    System.out.println("==================");
//	    while(it.hasPrevious()) { //앞으로 이동
//	    	Word w = it.previous();
//	    	if(w.eng.equals("red4")) {
//	    		System.out.println(w + " 삭제함");
//	    		it.remove();
//	    	}
////	    	System.out.println(it.previous());
//	    }
//	    System.out.println(list);
//	    
//	}
	
	
//	public static void main(String[] args) {
//		
//		HashSet<Word> set1 = new HashSet<>();
//		//빈출단어
//		set1.add(new Word("red1","빨강색1"));
//		set1.add(new Word("red2","빨강색2"));
//		set1.add(new Word("red3","빨강색3"));
//		set1.add(new Word("red4","빨강색4"));
//		
//		//내가 자주 틀리는 단어
//		HashSet<Word> set2 = new HashSet<>();
//		set2.add(new Word("red1","빨강색1"));
//		set2.add(new Word("red3","빨강색3"));
//		set2.add(new Word("red7","빨강색7"));
//		set2.add(new Word("red8","빨강색8"));
//		set2.add(new Word("red9","빨강색9"));
//		
//		HashSet<Word> word = new HashSet<>(set1);
//		word.retainAll(set2);
//		
//		System.out.println(word);
//		
////		ListIterator<Word> it = list.listIterator();
////	    while(it.hasNext()) {
////	    	System.out.println(it.next());
////		
////	    }
//	}
	
//	public static void main(String[] args) {
//		Map<String, Word> map = new HashMap<>();
//		//HashMap<String, Word> map = new HashMap<>(); 이거도 가능
//		map.put("red1", new Word("red1","빨강색1"));
//		map.put("red2", new Word("red2","빨강색2"));
//		map.put("red3", new Word("red3","빨강색3"));
//		map.put("red4", new Word("red4","빨강색4"));
//		map.put("red4", new Word("red4","빨강색4"));
//		map.put("red5", new Word("red5","빨강색5"));
//		
//		map.put("red2", new Word("red2","빨강2")); // 중복돼서 들어오면 마지막으로 들어온거로 갱신됨 
//		
//		//System.out.println(map); //map 은 순서 유지가 안되는 자료구조임
//		
//		System.out.println(map.get("red3")); 
	
//		//전체 정보 다 읽어내고 싶을때(방법1)
//		Set<String> key = map.keySet();
//		for(String k : key) {
//			System.out.println(map.get(k));
//		}
		
//		//set으로 만들어서 정보 읽어오기(방법2)
//		Set<Entry<String,Word>> entry = map.entrySet();
//		Iterator<Entry<String,Word>> entryit = entry.iterator();
//		while(entryit.hasNext()) {
//			Entry<String, Word> e = entryit.next();
//			String key = e.getKey();
//			Word value = e.getValue();
//			System.out.println(key + "==>" + value);
//		}
		
//		//(방법3)
//		Collection<Word> value = map.values();
//		Iterator<Word> valueit = value.iterator();
//		while(valueit.hasNext()) {
//			Word w = valueit.next();
//			System.out.println(w);
//		}
		
//		
//	} 
//}
    
