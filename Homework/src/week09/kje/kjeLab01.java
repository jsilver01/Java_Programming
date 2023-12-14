package week09.kje;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class kjeLab01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("202114219 김정은");
		mergeFile("words1.txt","words2.txt","words.txt");
		fileMerge("words1.txt","words2.txt","newFile.txt");
	}

	private static void fileMerge(String filename1, String filename2, String filename3) {
		try(Scanner file1 = new Scanner(new File(filename1));
				Scanner file2 = new Scanner(new File(filename2));
				PrintWriter outfile = new PrintWriter(new File(filename3));) {
			
			WriteFile(file1, outfile);
			WriteFile(file2, outfile);
			
			} catch (FileNotFoundException e) {
				System.out.println("파일이 존재하지 않습니다.");
		}
		
	}
	
	//아래코드처럼 try{} 이렇게 작성하면 finally에서 파일을 닫아줘야하는데 위에 처럼 작성하면 try() ()안에 예외처리 코드를 작성해주면 파일을 내가 닫지 않아
	//자동으로 리소스 종료 해준다.
	private static void mergeFile(String filename1, String filename2, String filename3) {
		Scanner file1 = null, file2 = null;
		PrintWriter outfile = null;
		try {
			file1 = new Scanner(new File(filename1)); //스캐너 객체 생성 파일 읽어오려고 생성함, 입력객체
			file2 = new Scanner(new File(filename2)); //입력객체
			outfile = new PrintWriter(new File(filename3)); //출력객체
			
			WriteFile(file1, outfile);
			WriteFile(file2, outfile);

		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("파일이 존재하지 않습니다.");
		}finally {
			if(file1 != null) file1.close();
			if(file2 != null) file2.close();
			if(outfile != null) outfile.close();
		}
		
	} 


	private static void WriteFile(Scanner file, PrintWriter outfile) {
		while(file.hasNextLine()) { //hasnextline() 은 이 파일에서 읽어올 것이 있냐는 함수
			String str = file.nextLine();
			outfile.println(str); //출력하고 싶으면 outfile에 출력하라는 의미
		}
	}

}
