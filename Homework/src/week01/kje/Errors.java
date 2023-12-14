/*
package week01.jhchi; --> package 이름이 달라서 생긴 오류 week01.kje로 수정하여 해결
public class errors --> 파일명은 Errors.java라서 대소문자가 달라서 생긴 오류 Errors 로 수정하여 해결
{
  public Static main(string[] args) { --> Static을 static으로 수정하고 반환하는게 없어서 void를 추가하고 string을 String으로 수정하여 해결 
    System.out.println(“이 프로그램은 많은 오류를 가지고 있다.”);
    System.0ut.println(“그러나 프로그램이 이 문장을 출력된다면”) --> 0이 아니라 영어 o로 수정하였고 마지막에 세미콜론을 추가하여 해결 
    System.out.Println(“모든 오류를 고친 것이다.); --> Println이 아니라 println	으로 수정하였고 닫은 "가 없어서 추가하여 해결 
  }
}
*/
package week01.kje;
public class Errors
{
	public static void main(String[] args) {
		 System.out.println("이 프로그램은 많은 오류를 가지고 있다.");
		 System.out.println("그러나 프로그램이 이 문장을 출력된다면");
		 System.out.println("모든 오류를 고친 것이다.");
	}
}