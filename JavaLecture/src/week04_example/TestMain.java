package week04_example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lab01();
		lab02();
		//lab03();
	}
	
	
	public static void lab03() {
		String filename = "map.txt";
		int[][] map = makeMap(filename);
		if(map != null) {
			showMap(map);
		}
	}


	public static void showMap(int[][] map) {
		for(int[] row : map) {
			for(int col : row) {
				switch(col) {
				case 0 -> System.out.print("◻︎︎");
				case 1 -> System.out.print("◼︎");
				case 2 -> System.out.print("★︎");
				}
			}
			System.out.println();
		}
	}


	public static int[][] makeMap(String filename) {
		int[][] map = null; 
		File file = new File(filename);
		try {
			Scanner scan = new Scanner(file);
			final int ROW = scan.nextInt();
			final int COL = scan.nextInt();
			map = new int[ROW][COL]; //map 생성
			
			//파일읽어서 배열에 각각 저장
			for(int i=0;i<map.length;i++) {
				for(int j=0; j<map[i].length;j++) {
					map[i][j] = scan.nextInt();
				}
			}
			scan.close();
			
		} catch (FileNotFoundException e) { //경로에 파일이 없는 경우 예외발생
			// TODO Auto-generated catch block
			System.err.println("파일이 존재하지 않습니다.");
			//e.printStackTrace();
		}
		
		return map;
	}


	public static void lab02() {
		String[] name = {"홍길동","김길동","이길동","고길동"};
		int[][] score = {{10,20,30,0},
				{50,60,20,0},
				{70,60,40,0},
				{90,10,20,0}};
		getTotalScore(score);
		printScore(name,score);
	}


	public static void printScore(String[] name, int[][] score) {
		for(int i =0;i<name.length;i++) {
			System.out.print(name[i]+" >>> ");
			
			for(int j=0;j<score.length-1;j++) {
				System.out.print(score[i][j]+" ");
			}
			
			System.out.print(" : " + score[i][score.length-1]);
			System.out.println();
		}
			//교수님 풀이
//			for(int i = 0;i<name.length;i++) {
//				System.out.print(name[i]+ " >>> ");
//				int k =0;
//				for(int s:score[i]) {
//					if(k==score[i].length-1)
//						System.out.print(" : ");
//					k++;
//					System.out.print(s+ " ");
//				}
//				System.out.println();
//			}
	}


	public static void getTotalScore(int[][] score) {
		//한층씩 읽어오기(행)
		for(int[] arr : score) {
			for(int i=0;i<arr.length -1;i++) {
				arr[arr.length-1] += arr[i];
			}
		}
	}


	public static void lab01() {
		int[] answer = {1, 2, 1, 3, 4, 4, 2, 1, 2, 1, 3, 4, 4, 2};
		int[] user1 = {2, 1, 1, 2, 2, 1, 1};
		int[] user2 = {1, 1, 4, 2, 3, 1, 4};
		//int[] result = checkQuiz(answer, user1.clone()); //원래 배열값은 건들이지 않고 복제해서 원본 유지
		
		//user data 한곳에 합치기
		int[] user = new int[answer.length];
		System.arraycopy(user1, 0, user, 0, user1.length);
		System.arraycopy(user2, 0, user, user1.length, user2.length);
		int[] result = checkQuiz(answer, user.clone());
		
		printArray("정   답 : ", answer);
		printArray("제출한답 : ", user);
		printArray("채점결과 : ", result);
	}
	

	public static void printArray(String string, int[] user1) {
		System.out.printf(string);
		for(int num : user1) {
			System.out.print(num+ " ");
		}
		System.out.println();
		
	}

	public static int[] checkQuiz(int[]answer, int[]user1) {
		for(int i=0;i<answer.length;i++) {
			if(answer[i]==user1[i])
				user1[i]=1;
			else
				user1[i]=0;
		}
		
		return user1;
	}
}
