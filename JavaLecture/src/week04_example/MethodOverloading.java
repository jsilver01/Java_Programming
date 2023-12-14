package week04_example;

public class MethodOverloading { //**method overloading**
	
	public static void replaceChar(char[] str, char a,char b) { //a를 b로 바꾸는 메소드
		for (int i=0; i<str.length; i++) 
			if (str[i] == a)
				str[i] = b;
	}
	
	public static char[] replaceChar(String str, char a, char b) { //toCharArray()호출해서 문자열로 변환함
		char[] tmp = str.toCharArray();
		replaceChar(tmp,a,b);
		return tmp;
	}
	
	public static void main(String[] args) {
		char[] result = replaceChar("greenjoa",'e','E');
		for(char c : result) {
			System.out.print(c);
		}
		System.out.println();
	}

}
